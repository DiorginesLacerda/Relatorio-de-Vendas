package repository;

import entity.Cliente;

public class ClienteRepository implements IClienteRepository {

	@Override
	public void save(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente getValueObject(String[] input) {
		return new Cliente(input[1], input[2], input[3]);
	}

	

}
