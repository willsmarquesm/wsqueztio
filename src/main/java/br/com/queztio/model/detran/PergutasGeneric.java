package br.com.queztio.model.detran;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class PergutasGeneric implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2242876937098435312L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String pergunta;
	@Column(name = "questao_a")
	private String questaA;
	@Column(name = "questao_b")
	private String questaoB;
	@Column(name = "questao_c")
	private String questaoC;
	@Column(name = "questao_d")
	private String questaoD;
	@Column(name = "resposta_correta")
	private String respostaCorreta;
	@Column(name = "caminho_imagem", nullable=true)
	private String caminhoImagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getQuestaA() {
		return questaA;
	}

	public void setQuestaA(String questaA) {
		this.questaA = questaA;
	}

	public String getQuestaoB() {
		return questaoB;
	}

	public void setQuestaoB(String questaoB) {
		this.questaoB = questaoB;
	}

	public String getQuestaoC() {
		return questaoC;
	}

	public void setQuestaoC(String questaoC) {
		this.questaoC = questaoC;
	}

	public String getQuestaoD() {
		return questaoD;
	}

	public void setQuestaoD(String questaoD) {
		this.questaoD = questaoD;
	}

	public String getRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(String respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}

	public String getCaminhoImagem() {
		return caminhoImagem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PergutasGeneric other = (PergutasGeneric) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public void setCaminhoImagem(String caminhoImagem) {
		this.caminhoImagem = caminhoImagem;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + getId() + getPergunta() + getQuestaA() + getQuestaoB() + getQuestaoC() + getQuestaoD() + getRespostaCorreta() + getCaminhoImagem();
	}

}
