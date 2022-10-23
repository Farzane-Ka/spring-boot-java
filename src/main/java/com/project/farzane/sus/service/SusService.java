package com.project.farzane.sus.service;

import com.project.farzane.sus.model.Sus;

public interface SusService {
    Iterable<Sus> getAllSus();
    void saveSus(Sus susQuestions);
    Sus getById(Long id);
    void deleteById(long id);
}
