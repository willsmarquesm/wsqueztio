package br.com.queztio.model.detran;

import java.util.Arrays;

public class PerguntasSelecionadas extends PergutasGeneric{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private byte[] img;

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return  " getId()=" + getId() + ", getPergunta()="
				+ getPergunta() + ", getQuestaA()=" + getQuestaoA() + ", getQuestaoB()=" + getQuestaoB()
				+ ", getQuestaoC()=" + getQuestaoC() + ", getQuestaoD()=" + getQuestaoD() + ", getRespostaCorreta()="
				+ getRespostaCorreta() + ", getCaminhoImagem()=" + getCaminhoImagem() + "]";
	}

	
	

}
