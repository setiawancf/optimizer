package com.example.optimizer.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(Long id, String modelName) {
        super("Could not " + modelName + " rune -> " + id);
    }
}
