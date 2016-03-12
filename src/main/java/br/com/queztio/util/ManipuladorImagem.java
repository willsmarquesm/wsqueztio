package br.com.queztio.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ManipuladorImagem {


	public static byte[] converter(String path) throws IOException {
		
		File arquivo = new File(path);
		BufferedImage img = ImageIO.read(arquivo);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ImageIO.write(img, "png", bos);
		
		return bos.toByteArray();
	}
}
