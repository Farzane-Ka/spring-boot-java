package com.project.farzane.sus.service;

import com.project.farzane.sus.model.Sus;
import com.project.farzane.sus.repository.SusRepository;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SusServiceImpl implements SusService {
    private final SusRepository susRepository;

    public SusServiceImpl(SusRepository susRepository) {
        this.susRepository = susRepository;
    }
    @Override public Iterable<Sus> getAllSus() {
        return susRepository.findAll();
    }

    @Override public void saveSus(Sus susQuestions) {
        susRepository.save(susQuestions);
    }

    @Override public Sus getById(Long id) {
        return susRepository.findById(id).orElseThrow();
//        Optional<Sus> optional = susRepository.findById(id);
//        Sus susQuestions = null;
//        if (optional.isPresent())
//            susQuestions = optional.get();
//        else
//            throw new RuntimeException(
//                    "Result not found for id : " + id);
//        return susQuestions;
    }

    @Override public void deleteById(long id)
    {
        susRepository.deleteById(id);
    }
}
