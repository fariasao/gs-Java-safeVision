package com.gs.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_sv_medico_hospital")
public class InfoMedicoHospital {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMedicoHospital;

    @ManyToOne
    @JoinColumn(name = "id_medico") // Refere-se à coluna de chave estrangeira na tabela 'tb_sv_medico_hospital'
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "id_hospital") // Refere-se à coluna de chave estrangeira na tabela 'tb_sv_medico_hospital'
    private Hospital hospital;
    
    public InfoMedicoHospital() {
        // Construtor padrão
    }

    // Construtor com parâmetros
    public InfoMedicoHospital(Integer idMedicoHospital, Medico medico, Hospital hospital) {
        this.idMedicoHospital = idMedicoHospital;
        this.medico = medico;
        this.hospital = hospital;
    }

    // Getters e setters
    public Integer getIdMedicoHospital() {
        return idMedicoHospital;
    }

    public void setIdMedicoHospital(Integer idMedicoHospital) {
        this.idMedicoHospital = idMedicoHospital;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
