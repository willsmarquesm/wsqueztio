package br.com.queztio.dao.detran;

import java.util.List;

import br.com.queztio.model.detran.Legislacao;

public class LegislacaoDAO extends GenericDAO<Legislacao>{
	
	@Override
	public void salvar(Legislacao entidade){
		super.salvar(entidade);
	}
	
	@Override
	public List<Legislacao> listar(){
		return super.listar();
	}

}
