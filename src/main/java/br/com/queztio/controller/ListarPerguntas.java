package br.com.queztio.controller;

import java.io.IOException;
import java.util.List;

import br.com.queztio.model.detran.PerguntasSelecionadas;
import br.com.queztio.util.ConsumirPerguntas;

public class ListarPerguntas {
	
	public List<PerguntasSelecionadas> listAllQuestions() throws IOException{
		
		List<PerguntasSelecionadas> lista = new ConsumirPerguntas().getQuestions();
		
		return lista;
	}
	
}
