package repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import app.mainApp;
import dao.GenericFileDao;
import entity.Cliente;
import entity.Venda;
import entity.Vendedor;

public class Context {

	//private final String PATH_IN = "./data/in/";
	private GenericFileDao<String>dao;
	private ClienteRepository clienteRepository;
	private VendedorRepository vendedorRepository;
	private VendaRepository vendaRepository;
	
	private List<Vendedor> vendedores;
	private List<Cliente> clientes;
	private List<Venda> vendas;

	private String nameFile;
	
	public Context(String nameFile) throws IOException {
		this.nameFile = nameFile;
		this.clienteRepository = new ClienteRepository();
		this.vendedorRepository = new VendedorRepository();
		this.vendaRepository = new VendaRepository();
		this.vendedores = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.vendas = new ArrayList<>();
		dao = new GenericFileDao<>();
		readFile(this.nameFile);
		
	}

	private void readFile(String nameFile) throws IOException {

		String pathFile = mainApp.PATH_IN+nameFile;
		List<String> dataInput = dao.readFile(pathFile);
		
		dataInput.forEach(r ->{
			String[] content = r.split("ç");
			if (content[0].equals("001")) {
				vendedores.add(vendedorRepository.getValueObject(content));
			} else if (content[0].equals("002")) {
				clientes.add(clienteRepository.getValueObject(content));
			} else if (content[0].equals("003")) {
				vendas.add(vendaRepository.getValueObject(content));
			}
		});
	}
	
	

	public String getNameFile() {
		return nameFile;
	}

	public List<Vendedor> getVendedores() {
		return vendedores;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	
	
	
	

}
