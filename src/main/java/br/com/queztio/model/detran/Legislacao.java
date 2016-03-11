package br.com.queztio.model.detran;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name = "tb_legislacao")
public class Legislacao extends PergutasGeneric {

	@Override
	public String toString() {
		return "Legislacao [getId()=" + getId() + ", getPergunta()=" + getPergunta() + ", getQuestaA()=" + getQuestaA()
				+ ", getQuestaoB()=" + getQuestaoB() + ", getQuestaoC()=" + getQuestaoC() + ", getQuestaoD()="
				+ getQuestaoD() + ", getRespostaCorreta()=" + getRespostaCorreta() + ", getCaminhoImagem()="
				+ getCaminhoImagem() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
