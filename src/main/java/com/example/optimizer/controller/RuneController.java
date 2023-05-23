package com.example.optimizer.controller;

import com.example.optimizer.model.Rune;
import com.example.optimizer.service.RuneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/runes")
public class RuneController {
    public static final Logger logger = LoggerFactory.getLogger(RuneController.class);

    @Autowired
    private RuneService runeService;

    @GetMapping("/find/all")//find all
    List<Rune> all() {
        return runeService.findAll();
    }

    @GetMapping("/find/{id}")//find rune by id
    Rune findOne(@PathVariable Long id) {
        return runeService.findById(id);
    }

    @PostMapping("/add")//add new rune
    public ResponseEntity<Map<String, Object>> addNewRune(@RequestBody Rune newRune) {
        Map<String,Object> map = new HashMap<String,Object>();
        try {
        map.put("status", runeService.addNewRune(newRune));
        map.put("notif", "Berhasil");
        return new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            map.put("notif", e.getMessage());
            map.put("status", false);
            e.printStackTrace();
            return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/add/unit")//add rune to unit
    public ResponseEntity<Map<String, Object>> addToUnit(@RequestBody List<Rune> listRuneToAdd) {
        Map<String,Object> map = new HashMap<String,Object>();
        return null;
    }
}
