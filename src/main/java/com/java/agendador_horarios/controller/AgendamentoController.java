package com.java.agendador_horarios.controller;

import com.java.agendador_horarios.infrastructure.entity.Agendamento;
import com.java.agendador_horarios.services.AgendamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<Agendamento> salvarAgendamento(@RequestBody Agendamento agendamento){
        return ResponseEntity.accepted().body(agendamentoService.salvarAgendamento(agendamento));
    }

}
