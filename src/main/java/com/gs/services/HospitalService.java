package com.gs.services;

import com.gs.entities.Hospital;
import com.gs.repositories.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {

    private final HospitalRepository hospitalRepository;

    @Autowired
    public HospitalService(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    public List<Hospital> getAllHospitais() {
        return hospitalRepository.findAll();
    }

    public Optional<Hospital> findHospitalById(Integer id) {
        return hospitalRepository.findById(id);
    }

    public Hospital saveHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    public Hospital updateHospital(Integer id, Hospital hospitalDetails) {
        Hospital hospital = hospitalRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Hospital não encontrado"));

        hospital.setNomeHospital(hospitalDetails.getNomeHospital());
        hospital.setTelefoneHospital(hospitalDetails.getTelefoneHospital());
        hospital.setEnderecoHospital(hospitalDetails.getEnderecoHospital());

        return hospitalRepository.save(hospital);
    }

    public void deleteHospital(Integer id) {
        hospitalRepository.deleteById(id);
    }
}
