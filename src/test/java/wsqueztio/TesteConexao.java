package wsqueztio;

import org.junit.Ignore;
import org.junit.Test;

import br.com.queztio.util.HibernateUtil;

public class TesteConexao {
	
	@Test
	public void testeConexao(){
		
		HibernateUtil.getFabricaDeSessoes();
		
	}
	
}
