package br.unipar.programacaointernet.clinica.repository;

import br.unipar.programacaointernet.clinica.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

    Paciente findByNomeAndTelefone (String nome, String telefone);

}
