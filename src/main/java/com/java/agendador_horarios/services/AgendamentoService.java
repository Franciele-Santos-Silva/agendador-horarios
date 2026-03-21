package com.java.agendador_horarios.services;

import com.java.agendador_horarios.infrastructure.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final JpaRepository<AgendamentoRepository, Long> repository;


}
