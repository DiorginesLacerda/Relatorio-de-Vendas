package repository;

import java.util.List;

import entity.Item;
import entity.Venda;
import util.Number;

public class VendaRepository implements IVendaRepository {
	
	ItemRepository itemRepository = new ItemRepository();

	@Override
	public void save(Venda t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Venda getValueObject(String[] input) throws Exception {
		List<Item> items = itemRepository.getAll(input[2]);
		
		Venda venda = new Venda(Number.strToLong(input[1]), items, input[3]);
		
		return venda;
	}

}
