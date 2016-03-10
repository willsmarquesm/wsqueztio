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
import br.com.queztio.model.detran.DirecaoDefensiva;

public class TesteClasseDirecaoDefensiva {

	@Test
	@Ignore
	public void adiciona() {

		DirecaoDefensiva df = new DirecaoDefensiva();

		DirecaoDefensivaDAO dao = new DirecaoDefensivaDAO();

		df.setPergunta("Teste Placa");
		df.setQuestaA("2");
		df.setQuestaoB("3");
		df.setQuestaoC("4");
		df.setQuestaoD("5");
		df.setRespostaCorreta("1");
		df.setCaminhoImagem(
				"/home/wiusmarques/Área\\ de\\ Trabalho/workspace/wsqueztio/src/main/resources/img/teste.png");

		dao.salvar(df);

	}

	@Test
	@Ignore
	public void list() {

		DirecaoDefensivaDAO dao = new DirecaoDefensivaDAO();

		List<DirecaoDefensiva> lista = new ArrayList<DirecaoDefensiva>();

		lista = dao.listar();

		lista.forEach(d -> System.out.println(d));

	}
	
	@Test
	public void conversao() throws IOException{
		DirecaoDefensivaDAO dao = new DirecaoDefensivaDAO();
		DirecaoDefensiva df = new DirecaoDefensiva(); 
		df = dao.buscar(7L);
		
		File arquivo = new File(df.getCaminhoImagem());
		BufferedImage img = ImageIO.read(arquivo);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ImageIO.write(img, "png", bos);
		
		bos.flush();
		
		byte[] b = bos.toByteArray();
		
		System.out.println(bos);
		System.out.print(b);
		
	}

}
