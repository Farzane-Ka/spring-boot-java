package com.project.farzane.sus.controller;

import com.project.farzane.sus.model.Sus;
import com.project.farzane.sus.service.SusServiceImpl;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Controller
public class SusController {

    private SusServiceImpl susServiceImpl;

    public SusController(SusServiceImpl susService) {
        this.susServiceImpl = susService;
    }


    @GetMapping("/")
    public  String viewHomePage(Model model) {
        Sus sus = new Sus();
        model.addAttribute("sus", sus);
        List<String> questionsRate = Arrays.asList("1 (Strongly disagree)", "2", "3", "4", "5 (Strongly agree)"); //dropDown options
        model.addAttribute("questionsRate", questionsRate);
        return "index";
    }

    @GetMapping("/globalScores")
    public String viewAllScores(Model model) {
        List<String> scores = new ArrayList<>();
        Iterator<Sus> it = susServiceImpl.getAllSus().iterator();
        while (it.hasNext()) {
            scores.add(computeScore(it.next()));
        }
        model.addAttribute("globalScores", scores);
        return "globalScores";
    }

    @PostMapping("/myScore")
    public String saveSus(@ModelAttribute("sus") Sus sus, Model model) {
        susServiceImpl.saveSus(sus);
        model.addAttribute("sus", sus );
        String score = computeScore(sus);
        model.addAttribute("score", score);
        return "myScore";

    }

    String computeScore(Sus sus) { // computing the sus score from the questions
        int score = 0;
        List<String> questionsRate = Arrays.asList(sus.getQuestion1(),
                sus.getQuestion2(), sus.getQuestion3(), sus.getQuestion4(),
                sus.getQuestion5(), sus.getQuestion6(), sus.getQuestion7(),
                sus.getQuestion8(), sus.getQuestion9(),sus.getQuestion10());

        for (int i = 0; i < questionsRate.size(); i++) {
            if ((i+1) % 2== 0) { //finding even number questions
                score += 5 - Integer.parseInt(questionsRate.get(i));
            } else {
                score +=  Integer.parseInt(questionsRate.get(i)) -1;
            }
        }
        double susScore = score * 2.5;
        return String.valueOf(susScore);
    }
}
