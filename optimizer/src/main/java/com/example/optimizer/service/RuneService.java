package com.example.optimizer.service;

import com.example.optimizer.exception.RuneNotFoundException;
import com.example.optimizer.model.Rune;
import com.example.optimizer.repository.RuneRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class RuneService {

    private final RuneRepository repository;

    RuneService(RuneRepository repository) {
        this.repository = repository;
    }

    public List<Rune> findAll() {
        return repository.findAll();
    }

    public Rune findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuneNotFoundException(id));
    }

    public Rune addNewRune(Rune newRune) {
        return repository.save(newRune);
    }
}
