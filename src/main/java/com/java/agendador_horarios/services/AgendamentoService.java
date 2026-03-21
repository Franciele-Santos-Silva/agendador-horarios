package com.java.agendador_horarios.services;

import com.java.agendador_horarios.infrastructure.entity.Agendamento;
import com.java.agendador_horarios.infrastructure.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public  Agendamento salvarAgendamento(Agendamento agendamento) {

        LocalDateTime horaAgendamento = agendamento.getDataHoraAgendamento();
        LocalDateTime horaFim = agendamento.getDataHoraAgendamento().plusHours(1);

        Agendamento agendados = agendamentoRepository.findByServicoAndDataHoraAgendamentoBetween(agendamento.getServico(), horaAgendamento, horaFim);


        if(Objects.nonNull(agendados)) {
            agendamentoRepository.save(agendamento);
        }
        return  agendamentoRepository.save(agendados);

    }

    public void deletarAgendamento(String cliente, LocalDateTime dataHoraAgendamento) {
    }
}
