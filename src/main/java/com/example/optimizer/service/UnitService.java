package com.example.optimizer.service;

import com.example.optimizer.exception.NotFoundException;
import com.example.optimizer.model.Rune;
import com.example.optimizer.model.Unit;
import com.example.optimizer.repository.UnitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitService {

    private final UnitRepository repository;

    UnitService(UnitRepository repository) {
        this.repository = repository;
    }

    public List<Unit> findAll() {
        return repository.findAll();
    }

    public Unit findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException(id, Unit.class.getName()));
    }

    public Unit addNewUnit(Unit newUnit) {
        return repository.save(newUnit);
    }
}
