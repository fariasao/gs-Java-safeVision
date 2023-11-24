package com.gs.services;

import com.gs.bo.HospitalBO;
import com.gs.entities.Hospital;
import com.gs.repositories.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {

	private final HospitalRepository hospitalRepository;
    private final HospitalBO hospitalBO;

    @Autowired
    public HospitalService(HospitalRepository hospitalRepository, HospitalBO hospitalBO) {
        this.hospitalRepository = hospitalRepository;
        this.hospitalBO = hospitalBO;
    }

    public List<Hospital> getAllHospitais() {
        return hospitalRepository.findAll();
    }

    public Optional<Hospital> findHospitalById(Integer id) {
        return hospitalRepository.findById(id);
    }

    public Hospital saveHospital(Hospital hospital) throws Exception {
        return hospitalBO.cadastrarHospital(hospital);
    }

    public Hospital updateHospital(Integer id, Hospital hospitalDetails) throws Exception {
        return hospitalBO.atualizarHospital(id, hospitalDetails);
    }
    public void deleteHospital(Integer id) {
        hospitalRepository.deleteById(id);
    }
}
