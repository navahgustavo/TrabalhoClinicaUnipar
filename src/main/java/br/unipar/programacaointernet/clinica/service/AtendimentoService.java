package br.unipar.programacaointernet.clinica.service;

import br.unipar.programacaointernet.clinica.model.Atendimento;
import br.unipar.programacaointernet.clinica.repository.AtendimentoRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AtendimentoService {

    private final AtendimentoRepository atendimentoRepository;

    public AtendimentoService(AtendimentoRepository atendimentoRepository) {
        this.atendimentoRepository = atendimentoRepository;
    }

    public List<Atendimento> getAll() {
        return this.atendimentoRepository.findAll();
    }

    public Atendimento save(Atendimento atendimento) {
        return this.atendimentoRepository.save(atendimento);
    }

    public Atendimento validarAtendimento(Integer id, String dataHora) {
        return this.atendimentoRepository.findByIdAndDataHora(id, dataHora);
    }

}