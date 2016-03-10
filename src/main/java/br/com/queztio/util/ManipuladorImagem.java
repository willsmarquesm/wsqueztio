package br.com.queztio.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ManipuladorImagem {

	private byte[] imagemConvertida;

	public byte[] converter(String localizacaoEnome) throws IOException {
		
		File arquivo = new File(localizacaoEnome);
		BufferedImage img = ImageIO.read(arquivo);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ImageIO.write(img, "png", bos);
		imagemConvertida = bos.toByteArray();
		return bos.toByteArray();
	}
}
