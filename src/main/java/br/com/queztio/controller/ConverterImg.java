package br.com.queztio.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ConverterImg {
	
	public byte[] conversao(String path) throws IOException{
		
		File arquivo = new File(path);
		BufferedImage img = ImageIO.read(arquivo);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ImageIO.write(img, "png", bos);
		
		bos.flush();
		
		return bos.toByteArray();
		
	}
	
}
