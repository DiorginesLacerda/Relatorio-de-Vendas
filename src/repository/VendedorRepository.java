package repository;


import entity.Vendedor;
import util.Number;

public class VendedorRepository implements IVendedorRepository{

	@Override
	public void save(Vendedor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vendedor getValueObject(String[] input) throws Exception {
		return new Vendedor(input[1], input[2], Number.strToDouble(input[3]));
	}

}
