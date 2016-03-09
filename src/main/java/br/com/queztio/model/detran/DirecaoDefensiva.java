package br.com.queztio.model.detran;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name = "tb_direcao_defensiva")
public class DirecaoDefensiva extends PergutasGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "DirecaoDefensiva [getId()=" + getId() + ", getPergunta()=" + getPergunta() + ", getQuestaA()="
				+ getQuestaA() + ", getQuestaoB()=" + getQuestaoB() + ", getQuestaoC()=" + getQuestaoC()
				+ ", getQuestaoD()=" + getQuestaoD() + ", getRespostaCorreta()=" + getRespostaCorreta()
				+ ", getCaminhoImagem()=" + getCaminhoImagem() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}

	
	
}
