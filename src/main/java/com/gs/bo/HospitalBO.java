package com.gs.bo;

import com.gs.entities.Hospital;
import com.gs.repositories.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HospitalBO {

    private final HospitalRepository hospitalRepository;

    @Autowired
    public HospitalBO(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    public Hospital cadastrarHospital(Hospital hospital) throws Exception {
        validarHospital(hospital);
        return hospitalRepository.save(hospital);
    }

    public Hospital atualizarHospital(Integer id, Hospital detalhesHospital) throws Exception {
        Hospital hospital = hospitalRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Hospital não encontrado"));

        atualizarDadosHospital(hospital, detalhesHospital);
        return hospitalRepository.save(hospital);
    }

    private void validarHospital(Hospital hospital) throws Exception {
        if (hospital.getNomeHospital() == null || hospital.getEnderecoHospital() == null) {
            throw new Exception("Dados do hospital são inválidos");
        }
    }

    private void atualizarDadosHospital(Hospital hospital, Hospital detalhes) {
        hospital.setNomeHospital(detalhes.getNomeHospital());
        hospital.setTelefoneHospital(detalhes.getTelefoneHospital());
        hospital.setEnderecoHospital(detalhes.getEnderecoHospital());
    }
}
