package com.project.farzane.sus.controller;

import com.project.farzane.sus.model.Sus;
import com.project.farzane.sus.service.ScoreCalculation;
import com.project.farzane.sus.service.SusServiceImpl;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

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
        List<Integer> questionsRate = Arrays.asList(1,2,3,4,5); //dropDown options
        model.addAttribute("questionsRate", questionsRate);
        return "index";
    }

    @GetMapping("/globalScores")
    public String viewAllScores(Model model) {
        List<String> scores = new ArrayList<>();
        Iterator<Sus> it = susServiceImpl.getAllSus().iterator();
        while (it.hasNext()) {
            scores.add(ScoreCalculation.computeScore(it.next()));
        }
        model.addAttribute("globalScores", scores);
        return "globalScores";
    }

    @PostMapping("/myScore")
    public String saveSus(@ModelAttribute("sus") Sus sus, Model model) {
        susServiceImpl.saveSus(sus);
        model.addAttribute("sus", sus );
        model.addAttribute("timestamp", Instant.now());
        String score = ScoreCalculation.computeScore(sus);
        model.addAttribute("score", score);
        return "myScore";

    }


}
