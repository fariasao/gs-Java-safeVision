package com.gs.services;

import com.gs.entities.InfoMedicoHospital;
import com.gs.repositories.InfoMedicoHospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InfoMedicoHospitalService {

    private final InfoMedicoHospitalRepository infoMedicoHospitalRepository;

    @Autowired
    public InfoMedicoHospitalService(InfoMedicoHospitalRepository infoMedicoHospitalRepository) {
        this.infoMedicoHospitalRepository = infoMedicoHospitalRepository;
    }

    public List<InfoMedicoHospital> getAllInfoMedicoHospital() {
        return infoMedicoHospitalRepository.findAll();
    }

    public Optional<InfoMedicoHospital> findInfoMedicoHospitalById(Integer id) {
        return infoMedicoHospitalRepository.findById(id);
    }

    public InfoMedicoHospital saveInfoMedicoHospital(InfoMedicoHospital infoMedicoHospital) {
        return infoMedicoHospitalRepository.save(infoMedicoHospital);
    }

    public InfoMedicoHospital updateInfoMedicoHospital(Integer id, InfoMedicoHospital infoMedicoHospitalDetails) {
        InfoMedicoHospital infoMedicoHospital = infoMedicoHospitalRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Informação Médico-Hospital não encontrada"));

        infoMedicoHospital.setMedico(infoMedicoHospitalDetails.getMedico());
        infoMedicoHospital.setHospital(infoMedicoHospitalDetails.getHospital());

        return infoMedicoHospitalRepository.save(infoMedicoHospital);
    }

    public void deleteInfoMedicoHospital(Integer id) {
        infoMedicoHospitalRepository.deleteById(id);
    }
}
