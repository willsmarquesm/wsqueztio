package br.com.queztio.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.queztio.dao.detran.DirecaoDefensivaDAO;
import br.com.queztio.dao.detran.LegislacaoDAO;
import br.com.queztio.dao.detran.MecanicaDAO;
import br.com.queztio.dao.detran.MeioAmbienteDAO;
import br.com.queztio.dao.detran.PrimeirosSocorrosDAO;
import br.com.queztio.model.detran.DirecaoDefensiva;
import br.com.queztio.model.detran.Legislacao;
import br.com.queztio.model.detran.PerguntasSelecionadas;
import br.com.queztio.model.detran.PergutasGeneric;

public class ConsumirPerguntas {

	private  LegislacaoDAO lDAO = new LegislacaoDAO();
	private  MecanicaDAO mDAO = new MecanicaDAO();
	private  MeioAmbienteDAO meDAO = new MeioAmbienteDAO();
	private  PrimeirosSocorrosDAO pDAO = new PrimeirosSocorrosDAO();
	private  DirecaoDefensivaDAO dao = new DirecaoDefensivaDAO();
	private  PerguntasSelecionadas perguntasSelecionadas = new PerguntasSelecionadas();
	private  List<PerguntasSelecionadas> lista = new ArrayList<PerguntasSelecionadas>();;
	
	
	public  List<PerguntasSelecionadas> getQuestions() throws IOException {

		DirecaoDefensiva df = new DirecaoDefensiva();
		Legislacao lg = new Legislacao();
		

		

		for (int i = 1; i <= 3; i++) {
			Long aux = getIdGerado();
			System.out.println("Inicio 1 loop "+ aux + " I: " + i);
			df = dao.buscar(aux);
			System.out.println("\n\n\n" + df);
			perguntasSelecionadas = addAllQuestion(df);
			lista.add(perguntasSelecionadas);
			for(PerguntasSelecionadas p: lista) System.out.println(lista);
		}
		for(PerguntasSelecionadas p: lista) System.out.println(lista);
		
		for (int i = 1; i <= 3; i++) {
			Long aux = getIdGerado();
			System.out.println("Inicio 2 loop "+ aux + " I: " + i);
			lg = lDAO.buscar(aux);
			System.out.println("\n\n\n" + lg);
			perguntasSelecionadas = addAllQuestion(lg);
			lista.add(perguntasSelecionadas);
			
		}
		
		for(PerguntasSelecionadas p: lista) System.out.println(lista);
		
		return lista;

	}

	private PerguntasSelecionadas addAllQuestion(PergutasGeneric p) throws IOException {

		perguntasSelecionadas.setId(p.getId());
		perguntasSelecionadas.setPergunta(p.getPergunta());
		perguntasSelecionadas.setQuestaA(p.getQuestaA());
		perguntasSelecionadas.setQuestaoB(p.getQuestaA());
		perguntasSelecionadas.setQuestaoC(p.getQuestaA());
		perguntasSelecionadas.setQuestaoD(p.getQuestaA());
		perguntasSelecionadas.setRespostaCorreta(p.getQuestaA());
		perguntasSelecionadas.setCaminhoImagem(p.getCaminhoImagem());
		perguntasSelecionadas.setImg(new ManipuladorImagem().converter(p.getCaminhoImagem()));
		
		System.out.println(" PS " + perguntasSelecionadas);
		
		return perguntasSelecionadas;

	}

	private void addLista(Object obj){
		
	}
	
	private Long getIdGerado() {

		return (long) new Random().nextInt(3) + 1;
	}

}
