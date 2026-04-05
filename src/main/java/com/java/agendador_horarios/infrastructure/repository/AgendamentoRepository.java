package com.java.agendador_horarios.infrastructure.repository;

import com.java.agendador_horarios.infrastructure.entity.Agendamento;
import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    Agendamento findByServicoAndDataHoraAgendamentoBetween(String servico, LocalDateTime dataHora, LocalDateTime dataFinal);


    @Transactional
    void deleteByDataHoraAgendamentoCliente(LocalDateTime dataHoraAgendamentocl, String cliente);

    Agendamento findByDataHOraAgendamentoBetween(LocalDateTime dataHoraInicial, LocalDateTime dataHoraFinal);
}
