package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class arquivoController implements IArquivoController {

	public arquivoController() {
		super();
	}
	
	public void Readfile(String path, String nome) throws IOException {
		
		File dir=new File(path);
		
		if(dir.exists() &&  dir.isDirectory()) {
			String caminho=path+File.separator+nome;
			File file=new File(caminho);
			
			if(file.exists()&&file.isFile()) {
				System.out.println("Diretorio e arquivo encontrados");
				BufferedReader br=new BufferedReader(new FileReader(caminho));
				String linha=br.readLine();
				  System.out.printf("%-20s %-25s %-20s%n", "FOOD NAME", "SCIENTIFIC NAME", "SUBGROUP");
			      System.out.println("-------------------------------------------------------------");
				while(linha!=null) {
				
					if(linha.contains("fruits")) {
							String[] vetlinha=linha.split(",");
							  System.out.printf("%-20s %-25s %-20s%n", vetlinha[0],vetlinha[1],vetlinha[3]);
					}
						linha=br.readLine();
					}
					br.close();
				}
		}else {
			throw new IOException("Diretório inválido");
		}

		
		
	}

}
