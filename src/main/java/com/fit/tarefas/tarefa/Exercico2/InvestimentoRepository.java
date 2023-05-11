package com.fit.tarefas.tarefa.Exercico2;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface InvestimentoRepository extends JpaRepository<InvestimentoEntity, Long> {
}
