package wsqueztio;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.junit.Ignore;
import org.junit.Test;

import br.com.queztio.dao.detran.DirecaoDefensivaDAO;
import br.com.queztio.dao.detran.LegislacaoDAO;
import br.com.queztio.dao.detran.MecanicaDAO;
import br.com.queztio.dao.detran.MeioAmbienteDAO;
import br.com.queztio.dao.detran.PrimeirosSocorrosDAO;
import br.com.queztio.model.detran.DirecaoDefensiva;
import br.com.queztio.model.detran.Legislacao;

public class TesteClasseDirecaoDefensiva {
	
	final String path = "C:/Users/VictorH/git/wsqueztio/src/main/resources/img/teste2.png";
	LegislacaoDAO lDAO = new LegislacaoDAO();
	MecanicaDAO mDAO = new MecanicaDAO();
	MeioAmbienteDAO meDAO = new MeioAmbienteDAO();
	PrimeirosSocorrosDAO pDAO = new PrimeirosSocorrosDAO();
	DirecaoDefensivaDAO dao = new DirecaoDefensivaDAO();
	
	
	@Test
	@Ignore
	public void adiciona() {

		Legislacao df = new Legislacao();
		
		

		df.setPergunta("Teste 1");
		df.setQuestaA("2");
		df.setQuestaoB("3");
		df.setQuestaoC("4");
		df.setQuestaoD("5");
		df.setRespostaCorreta("1");
		df.setCaminhoImagem(path);

		lDAO.salvar(df);

	}

	@Test
	//@Ignore
	public void list() {

		List<DirecaoDefensiva> lista = new ArrayList<DirecaoDefensiva>();
		List<Legislacao> lista1 = new ArrayList<Legislacao>();
		
		lista = dao.listar();
		lista1 = lDAO.listar();
		
		lista.forEach(d -> System.out.println(d));
		lista1.forEach(f -> System.out.println(f));
		
	}
	
	@Test
	@Ignore
	public void conversao() throws IOException{
		
		/*
		DirecaoDefensivaDAO dao = new DirecaoDefensivaDAO();
		DirecaoDefensiva df = new DirecaoDefensiva(); 
		df = dao.buscar(7L);*/
		
		File arquivo = new File("C:/Users/VictorH/git/wsqueztio/src/main/resources/img/teste1.png");
		BufferedImage img = ImageIO.read(arquivo);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ImageIO.write(img, "png", bos);
		
		bos.flush();
		
		byte[] b = bos.toByteArray();
		
		System.out.println(bos);
		System.out.print(b);
		
	}

}
