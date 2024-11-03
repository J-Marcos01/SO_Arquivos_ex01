package view;

import java.io.File;
import java.io.IOException;

import controller.arquivoController;
import controller.IArquivoController;

public class Principal {

	public static void main(String[] args)  {
		
		IArquivoController arqcont = new arquivoController();
		
		String path="C:"+File.separator+"TEMP";
		String file="generic_food.csv";
		
		try {
			arqcont.Readfile(path, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
