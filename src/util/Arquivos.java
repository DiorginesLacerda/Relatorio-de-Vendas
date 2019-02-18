package util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
	
	public static List<String> comparaDiretorios(String inDirectory, String outDirectory) {
		List<String> inFiles = getNamesFiles(inDirectory);
		List<String> outFiles = getNamesFiles(outDirectory);
		
		List<String> filterFiles  = new ArrayList<>();
		
		for (String file : inFiles) {
			if(!outFiles.contains(file)) {
				filterFiles.add(file);
			}
		}
		return filterFiles;
	}
	
	private static List<String> getNamesFiles(String Directory){
		File folder = new File(Directory);
		File listFiles[] = folder.listFiles();
		List<String> fiilesNames = new ArrayList<>();
		
		//Carrega os nomes dos arquivos .dat
		for (File file : listFiles) {
			String name = file.getName();
			String subs = name.substring(name.length()-4,name.length());
			if(subs.equals(".dat")) {
				fiilesNames.add(file.getName());
			}
		}
		return fiilesNames;
		
	}
	
}
