package br.com.queztio.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.queztio.dao.detran.DirecaoDefensivaDAO;
import br.com.queztio.dao.detran.LegislacaoDAO;
import br.com.queztio.model.detran.DirecaoDefensiva;
import br.com.queztio.model.detran.Legislacao;
import br.com.queztio.model.detran.PerguntasSelecionadas;
import br.com.queztio.model.detran.PergutasGeneric;

public class ConsumirPerguntas {

	List<PerguntasSelecionadas> lista = new ArrayList<PerguntasSelecionadas>();

	public List<PerguntasSelecionadas> getQuestions() throws IOException {

		for (int i = 1; i <= 3; i++) {

			PerguntasSelecionadas perguntasSelecionadas = new PerguntasSelecionadas();

			DirecaoDefensiva df = new DirecaoDefensiva();
			Legislacao lg = new Legislacao();

			LegislacaoDAO lDAO = new LegislacaoDAO();
			DirecaoDefensivaDAO dao = new DirecaoDefensivaDAO();

			Long aux = getIdGerado();
			System.out.println("Inicio 1 loop " + aux + " I: " + i);
			df = dao.buscar(aux);
			System.out.println("\n\n\n" + df);
			perguntasSelecionadas = addAllQuestion(df, perguntasSelecionadas);
			lista.add(perguntasSelecionadas);
			for (PerguntasSelecionadas p : lista)
				System.out.println(lista);
		}
		for (PerguntasSelecionadas p : lista)
			System.out.println(lista);

		for (int i = 1; i <= 3; i++) {

			PerguntasSelecionadas perguntasSelecionadas = new PerguntasSelecionadas();

			DirecaoDefensiva df = new DirecaoDefensiva();
			Legislacao lg = new Legislacao();

			LegislacaoDAO lDAO = new LegislacaoDAO();
			DirecaoDefensivaDAO dao = new DirecaoDefensivaDAO();

			Long aux = getIdGerado();
			System.out.println("Inicio 2 loop " + aux + " I: " + i);
			lg = lDAO.buscar(aux);
			System.out.println("\n\n\n" + lg);
			perguntasSelecionadas = addAllQuestion(lg, perguntasSelecionadas);
			lista.add(perguntasSelecionadas);

		}

		for (PerguntasSelecionadas p : lista)
			System.out.println(lista);

		return lista;

	}

	private PerguntasSelecionadas addAllQuestion(PergutasGeneric p, PerguntasSelecionadas perguntasSelecionadas)
			throws IOException {

		perguntasSelecionadas.setId(p.getId());
		perguntasSelecionadas.setPergunta(p.getPergunta());
		perguntasSelecionadas.setQuestaoA(p.getQuestaoA());
		perguntasSelecionadas.setQuestaoB(p.getQuestaoA());
		perguntasSelecionadas.setQuestaoC(p.getQuestaoA());
		perguntasSelecionadas.setQuestaoD(p.getQuestaoA());
		perguntasSelecionadas.setRespostaCorreta(p.getQuestaoA());
		perguntasSelecionadas.setCaminhoImagem(p.getCaminhoImagem());
		new ManipuladorImagem();
		perguntasSelecionadas.setImg(ManipuladorImagem.converter(p.getCaminhoImagem()));

		System.out.println(" PS " + perguntasSelecionadas);

		return perguntasSelecionadas;

	}

	private void addLista(Object obj) {

	}

	private Long getIdGerado() {

		return (long) new Random().nextInt(3) + 1;
	}

}
