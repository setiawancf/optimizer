package com.example.optimizer.controller;

import com.example.optimizer.exception.RuneNotFoundException;
import com.example.optimizer.model.Rune;
import com.example.optimizer.repository.RuneRepository;
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

    @GetMapping("/find")
    List<Rune> all() {
        return runeService.findAll();
    }

    @GetMapping("/find/{id}")
    Rune findOne(@PathVariable Long id) {
        return runeService.findById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> add(@RequestBody Rune newRune) {
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
}
