package com.fit.tarefas.tarefa.Exercico2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(value = Include.NON_NULL)
public class Investimento {
	@JsonProperty("tipo")
	private String tipo;
	
	@JsonProperty("valor")
	private double valor;
}
