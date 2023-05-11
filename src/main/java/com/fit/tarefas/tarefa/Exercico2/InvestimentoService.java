package com.fit.tarefas.tarefa.Exercico2;

import org.springframework.stereotype.Service;

@Service
public class InvestimentoService {
	
	
	public Investimento investir(Investimento investimento) {
		
		if (investimento.getValor() <5000) {
			investimento.setTipo("Poupança");
			investimento.setValor(investimento.getValor() * 1.005);

		} else {
			investimento.setValor(investimento.getValor() * 0.05);
		}
		
		
		return investimento;
	}
}
