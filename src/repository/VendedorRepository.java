package repository;


import entity.Vendedor;

public class VendedorRepository implements IVendedorRepository{

	@Override
	public void save(Vendedor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vendedor getValueObject(String[] input) {
		return new Vendedor(input[1], input[2], Double.parseDouble(input[3]));
	}

}
