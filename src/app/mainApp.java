package app;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

import repository.Context;
import service.RelatorioService;
import util.Arquivos;

public class mainApp {
	public static final String PATH_IN = "./data/in/";
	public static final String PATH_OUT = "./data/out/";

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		readFiles();
		
		
		WatchService watchService = FileSystems.getDefault().newWatchService();
		Path path = Paths.get(PATH_IN);
		
		path.register(
		          watchService, 
		            StandardWatchEventKinds.ENTRY_CREATE,
		                StandardWatchEventKinds.ENTRY_MODIFY);
		
		WatchKey key;
        while ((key = watchService.take()) != null) {
        	
        	
        	
        	for (WatchEvent<?> event : key.pollEvents()) {
        		if(event.kind().toString().equals("ENTRY_CREATE")
        				|| event.kind().toString().equals("ENTRY_MODIFY"))
        			readFile(event.context().toString());
               
            }
        	key.reset();
        }
	}
	
	private static  void readFiles() {
		List<String> files = Arquivos.comparaDiretorios(PATH_IN, PATH_OUT);
		files.forEach(f->readFile(f));
	}
	
	private static void readFile(String file){
		try {
			Context context = new Context(file);
			RelatorioService relatorioService = new RelatorioService(context);
			relatorioService.performSaveRelatorio();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
