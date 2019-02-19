package dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class GenericFileDao<T>{
	
	public GenericFileDao() {
		// TODO Auto-generated constructor stub
	}
	
	public List<String> readFile(String namefile) throws Exception{
		try {
			FileReader file = new FileReader(namefile);
			BufferedReader buffer = new BufferedReader(file);
			
			List<String>response = new ArrayList<>();
			String row;
			while ((row = buffer.readLine()) != null) {
				response.add(row);
			}
			file.close();
			return response;
		} catch (FileNotFoundException e) {
			throw new Exception("Arquivo "+namefile+" não foi encontrado"); 
		} catch (IOException e) {
			throw new Exception("Erro ao ler o arquivo "+namefile+". Verificar se o mesmo está dentro do padrão correto de dados");
			
		}
	}
	
	public void saveInFile(T t,String fileName) throws Exception {
		try {
			FileWriter fw = new FileWriter(fileName);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(t.toString());
			
			pw.close();
			
		} catch (IOException e) {
			throw new Exception("Erro ao Salvar o arquivo "+fileName+"detalhes\n"+e);
		}
	}
}
