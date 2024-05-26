package br.unipar.programacaointernet.clinica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String dataHora;
    private Boolean anamnese = false;
    @ManyToOne
    private Medico idMedico;
    @ManyToOne
    private Paciente idPaciente;

}
