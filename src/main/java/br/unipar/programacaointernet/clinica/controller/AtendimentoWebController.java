package br.unipar.programacaointernet.clinica.controller;

import br.unipar.programacaointernet.clinica.model.Atendimento;
import br.unipar.programacaointernet.clinica.service.AtendimentoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AtendimentoWebController {

    private final AtendimentoService atendimentoService;

    public AtendimentoWebController(AtendimentoService atendimentoService) {
        this.atendimentoService = atendimentoService;
    }

    @GetMapping(path = "/atendimentos")
    public String getAllAtendimentos(Model model) {
        List<Atendimento> atendimentos = atendimentoService.getAll();
        model.addAttribute("atendimentos", atendimentos);
        return "atendimentos";
    }

    @PostMapping(path = "/atendimentos/save")
    public String saveAtendimentos(Atendimento atendimentos) {
        atendimentoService.save(atendimentos);
        return "redirect:/atendimentos";
    }

}
