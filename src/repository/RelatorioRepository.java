package repository;


import app.mainApp;
import dao.GenericFileDao;
import entity.Relatorio;

public class RelatorioRepository implements IRelatorioRepository{
	
	Context context;
	
	GenericFileDao<Relatorio> dao = new GenericFileDao<>();
	
	public RelatorioRepository(Context context) {
		this.context = context;
	}
	
	@Override
	public void save(Relatorio relatorio) throws Exception {
		String name = context.getNameFile().substring(0,(context.getNameFile().length()-4));
		String fileName = mainApp.PATH_OUT +name+".done.dat";
		dao.saveInFile(relatorio, fileName);
	}

	@Override
	public Relatorio getValueObject(String[] input) {
		// TODO Auto-generated method stub
		return null;
	}

	


	
	
	
}
