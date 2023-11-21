package com.gs.controllers;

import com.gs.entities.Hospital;
import com.gs.services.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitais")
public class HospitalController {

    private final HospitalService hospitalService;

    @Autowired
    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @GetMapping
    public List<Hospital> getAllHospitais() {
        return hospitalService.getAllHospitais();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hospital> getHospitalById(@PathVariable Integer id) {
        Hospital hospital = hospitalService.findHospitalById(id)
            .orElseThrow(() -> new RuntimeException("Hospital não encontrado"));
        return ResponseEntity.ok(hospital);
    }

    @PostMapping
    public ResponseEntity<Hospital> createHospital(@RequestBody Hospital hospital) {
        Hospital novoHospital = hospitalService.saveHospital(hospital);
        return ResponseEntity.ok(novoHospital);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hospital> updateHospital(@PathVariable Integer id, @RequestBody Hospital hospital) {
        Hospital hospitalAtualizado = hospitalService.updateHospital(id, hospital);
        return ResponseEntity.ok(hospitalAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHospital(@PathVariable Integer id) {
        hospitalService.deleteHospital(id);
        return ResponseEntity.noContent().build();
    }
}
