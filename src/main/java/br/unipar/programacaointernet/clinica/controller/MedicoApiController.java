package br.unipar.programacaointernet.clinica.controller;

import br.unipar.programacaointernet.clinica.model.Medico;
import br.unipar.programacaointernet.clinica.service.MedicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicoApiController {

    private final MedicoService medicoService;

    public MedicoApiController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping(path = "/api/medicos")
    public ResponseEntity<List<Medico>> getAll() {
        return ResponseEntity.ok(this.medicoService.getAll());
    }

    @PostMapping(path = "/api/medicos")
    public ResponseEntity<Medico> save(@RequestBody Medico medico) {
        return ResponseEntity.ok(this.medicoService.save(medico));
    }
}