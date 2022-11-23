package com.project.farzane.sus.service;

import com.project.farzane.sus.model.Sus;

import java.util.ArrayList;
import java.util.List;

public class ScoreCalculation {
    public static String computeScore(Sus sus) { // computing the sus score from the questions
        List<Integer> questions = List.of(sus.getQuestion1(), sus.getQuestion2(), sus.getQuestion3(),
                sus.getQuestion4(), sus.getQuestion5(), sus.getQuestion6(), sus.getQuestion7(),
                sus.getQuestion8(), sus.getQuestion9(), sus.getQuestion10());
        int sumOddIndexes = questions.stream().filter(item -> questions.indexOf(item) % 2 == 0)
                .map(item -> (item - 1)).mapToInt(Integer::valueOf).sum();
        int sumEvenIndexes = questions.stream().filter(item -> questions.indexOf(item) % 2 != 0).map(item -> (5 - item))
                .mapToInt(Integer::valueOf).sum();
        double susScore = (sumEvenIndexes + sumOddIndexes) * 2.5;
        return String.valueOf(susScore);
    }
    public static void main(String[] args) {

    }
}
