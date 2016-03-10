package wsqueztio;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.queztio.dao.detran.DirecaoDefensivaDAO;
import br.com.queztio.model.detran.DirecaoDefensiva;

public class TesteClasseDirecaoDefensiva {
	
	@Test
	public void adiciona(){
		
		DirecaoDefensiva df = new DirecaoDefensiva();
		
		DirecaoDefensivaDAO dao = new DirecaoDefensivaDAO();
		
		df.setPergunta("Teste 3");
		df.setQuestaA("2");
		df.setQuestaoB("3");
		df.setQuestaoC("4");
		df.setQuestaoD("5");
		df.setRespostaCorreta("1");
		df.setCaminhoImagem("hue");
		
		dao.salvar(df);
		
	}
	
	@Test
	public void list(){
		
		DirecaoDefensivaDAO dao = new DirecaoDefensivaDAO();
		
		List<DirecaoDefensiva> lista = new ArrayList<DirecaoDefensiva>();
		
		lista = dao.listar();
		
		lista.forEach(d -> System.out.println(d));
		
	}
	
}
