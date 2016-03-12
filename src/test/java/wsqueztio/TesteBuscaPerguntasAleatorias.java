package wsqueztio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import br.com.queztio.controller.ListarPerguntas;
import br.com.queztio.dao.detran.DirecaoDefensivaDAO;
import br.com.queztio.dao.detran.LegislacaoDAO;
import br.com.queztio.model.detran.DirecaoDefensiva;
import br.com.queztio.model.detran.Legislacao;
import br.com.queztio.model.detran.PerguntasSelecionadas;
import br.com.queztio.util.ManipuladorImagem;

public class TesteBuscaPerguntasAleatorias {

	LegislacaoDAO legislacaoDAO = new LegislacaoDAO();
	DirecaoDefensivaDAO direcaoDefensivaDAO = new DirecaoDefensivaDAO();
	PerguntasSelecionadas peSelecionadas = new PerguntasSelecionadas();
	Legislacao legislacao = new Legislacao();
	DirecaoDefensiva direcaoDefensiva = new DirecaoDefensiva();
	ListarPerguntas listar = new ListarPerguntas();

	List<PerguntasSelecionadas> listaTeste = new ArrayList<>();

	

	@Test
	public void buscar() throws IOException {
		
		
		for (int j = 0; j < 3; j++) {
			
		
			Random teste = new Random();

		
			Long aux1 = (long) 1 + teste.nextInt(3);
				
		
			legislacao = legislacaoDAO.buscar(aux1);
			//direcaoDefensiva = direcaoDefensivaDAO.buscar(aux2);

			peSelecionadas.setId(legislacao.getId());
			peSelecionadas.setPergunta(legislacao.getPergunta());
			peSelecionadas.setQuestaA(legislacao.getQuestaA());
			peSelecionadas.setQuestaoB(legislacao.getQuestaA());
			peSelecionadas.setQuestaoC(legislacao.getQuestaA());
			peSelecionadas.setQuestaoD(legislacao.getQuestaA());
			peSelecionadas.setRespostaCorreta(legislacao.getQuestaA());
			peSelecionadas.setCaminhoImagem(legislacao.getCaminhoImagem());
			peSelecionadas.setImg(new ManipuladorImagem().converter(peSelecionadas.getCaminhoImagem()));

			listaTeste.add(peSelecionadas);
		}

		for (PerguntasSelecionadas p : listaTeste)
			System.out.println(p);

	}

}
