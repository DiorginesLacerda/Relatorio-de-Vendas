package repository;

import java.util.ArrayList;
import java.util.List;

import app.mainApp;
import dao.GenericFileDao;
import entity.Cliente;
import entity.Venda;
import entity.Vendedor;

public class Context {

	private GenericFileDao<String>dao;
	private ClienteRepository clienteRepository;
	private VendedorRepository vendedorRepository;
	private VendaRepository vendaRepository;
	
	private List<Vendedor> vendedores;
	private List<Cliente> clientes;
	private List<Venda> vendas;

	private String nameFile;
	
	public Context(String nameFile) throws Exception {
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

	private void readFile(String nameFile) throws Exception {

		String pathFile = mainApp.PATH_IN+nameFile;
		List<String> dataInput = dao.readFile(pathFile);
		
		dataInput.forEach(r ->{
			String[] content = r.split("ç");
			if (content[0].equals("001")) {
				try {
					vendedores.add(vendedorRepository.getValueObject(content));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Erro ao criar o Vendedor a partir dos dados "+ content+
							e);
				}
			} else if (content[0].equals("002")) {
				clientes.add(clienteRepository.getValueObject(content));
			} else if (content[0].equals("003")) {
				try {
					vendas.add(vendaRepository.getValueObject(content));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Erro ao criar a Venda a partir dos dados "+ content+
							e);
				}
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
