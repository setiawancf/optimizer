package com.example.optimizer.service;

import com.example.optimizer.exception.NotFoundException;
import com.example.optimizer.model.Rune;
import com.example.optimizer.repository.RuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuneService {

    @Autowired
    private RuneRepository repository;

//    RuneService(RuneRepository repository) {
//        this.repository = repository;
//    }

    public List<Rune> findAll() {
        return repository.findAll();
    }

    public Rune findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException(id, Rune.class.getName()));
    }

    public Rune addNewRune(Rune newRune) {
        return repository.save(newRune);
    }
}
