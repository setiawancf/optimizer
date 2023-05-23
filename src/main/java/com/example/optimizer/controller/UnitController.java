package com.example.optimizer.controller;

import com.example.optimizer.model.Unit;
import com.example.optimizer.service.UnitService;
import com.example.optimizer.service.UnitService;
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
@RequestMapping("/units")
public class UnitController {
    public static final Logger logger = LoggerFactory.getLogger(UnitController.class);

    @Autowired
    private UnitService unitService;

    @GetMapping("/find/all")
    List<Unit> all() {
        return unitService.findAll();
    }

    @GetMapping("/find/{id}")
    Unit findOne(@PathVariable Long id) {
        return unitService.findById(id);
    }

    @PostMapping("/add")//add new unit
    public ResponseEntity<Map<String, Object>> add(@RequestBody Unit newUnit) {
        Map<String,Object> map = new HashMap<String,Object>();
        try {
        map.put("status", unitService.addNewUnit(newUnit));
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
