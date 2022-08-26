package com.example.optimizer.exception;

public class RuneNotFoundException extends RuntimeException {
    public RuneNotFoundException(Long id) {
        super("Could not find rune -> " + id);
    }
}
