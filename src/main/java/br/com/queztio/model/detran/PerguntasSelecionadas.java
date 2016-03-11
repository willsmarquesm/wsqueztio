package br.com.queztio.model.detran;

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
		return "PerguntasSelecionadas [getId()=" + getId() + "]";
	}
	
	
	
}
