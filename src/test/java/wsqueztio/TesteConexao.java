package wsqueztio;

import org.junit.Ignore;
import org.junit.Test;

import br.com.queztio.util.HibernateUtil;

public class TesteConexao {
	
	@Test
	@Ignore
	public void testeConexao(){
		
		HibernateUtil.getFabricaDeSessoes();
		
	}
	
}
