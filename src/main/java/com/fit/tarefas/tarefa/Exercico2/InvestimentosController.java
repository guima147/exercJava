package com.fit.tarefas.tarefa.Exercico2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banco")
public class InvestimentosController {

	
	@PostMapping("/investir")
	public ResponseEntity<Investimento> investir(@RequestBody Investimento investimentoRequest) {
		
		
		return null;
	} 
}
