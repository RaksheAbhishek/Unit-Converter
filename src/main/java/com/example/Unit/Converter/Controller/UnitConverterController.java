package com.example.Unit.Converter.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Unit.Converter.Entity.Unit;
import com.example.Unit.Converter.Services.UnitConversionService;

@RestController
@RequestMapping("/api")
public class UnitConverterController {

    private UnitConversionService unitConversionService;

    @Autowired
    public UnitConverterController(UnitConversionService unitConversionService) {
        this.unitConversionService = unitConversionService;
    }

    @GetMapping("/units")
    public List<Unit> getAllUnits() {
        return unitConversionService.getAllUnits();
    }
    
    @GetMapping("/convert")
    public ResponseEntity<Double> convertUnits(
            @RequestParam Long fromUnitId,
            @RequestParam Long toUnitId,
            @RequestParam double value) {

        double result = unitConversionService.convertUnits(fromUnitId, toUnitId, value);
        return ResponseEntity.ok(result);
    }
}
