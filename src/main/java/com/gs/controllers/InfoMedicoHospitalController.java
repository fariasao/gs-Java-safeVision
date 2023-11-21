package com.gs.controllers;

import com.gs.entities.InfoMedicoHospital;
import com.gs.services.InfoMedicoHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/info-medico-hospital")
public class InfoMedicoHospitalController {

    private final InfoMedicoHospitalService infoMedicoHospitalService;

    @Autowired
    public InfoMedicoHospitalController(InfoMedicoHospitalService infoMedicoHospitalService) {
        this.infoMedicoHospitalService = infoMedicoHospitalService;
    }

    @GetMapping
    public List<InfoMedicoHospital> getAllInfoMedicoHospital() {
        return infoMedicoHospitalService.getAllInfoMedicoHospital();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InfoMedicoHospital> getInfoMedicoHospitalById(@PathVariable Integer id) {
        InfoMedicoHospital infoMedicoHospital = infoMedicoHospitalService.findInfoMedicoHospitalById(id)
            .orElseThrow(() -> new RuntimeException("Informação Médico-Hospital não encontrada"));
        return ResponseEntity.ok(infoMedicoHospital);
    }

    @PostMapping
    public ResponseEntity<InfoMedicoHospital> createInfoMedicoHospital(@RequestBody InfoMedicoHospital infoMedicoHospital) {
        InfoMedicoHospital novaInfoMedicoHospital = infoMedicoHospitalService.saveInfoMedicoHospital(infoMedicoHospital);
        return ResponseEntity.ok(novaInfoMedicoHospital);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InfoMedicoHospital> updateInfoMedicoHospital(@PathVariable Integer id, @RequestBody InfoMedicoHospital infoMedicoHospital) {
        InfoMedicoHospital infoMedicoHospitalAtualizada = infoMedicoHospitalService.updateInfoMedicoHospital(id, infoMedicoHospital);
        return ResponseEntity.ok(infoMedicoHospitalAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInfoMedicoHospital(@PathVariable Integer id) {
        infoMedicoHospitalService.deleteInfoMedicoHospital(id);
        return ResponseEntity.noContent().build();
    }
}
