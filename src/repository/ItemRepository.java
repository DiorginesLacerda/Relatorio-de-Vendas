package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Item;
import util.Number;

public class ItemRepository implements IItemRepository{

	@Override
	public void save(Item t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Item getValueObject(String[] input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getAll(String input) throws Exception {
		String[] txtItems = input.substring(1, input.length() - 1).split(",");
		List<Item> items = new ArrayList<>();

		for (String item : txtItems) {
			String[] valuesItem = item.split("-");
			items.add(new Item(Number.strToLong(valuesItem[0]), Number.strToDouble(valuesItem[1]),
					Number.strToDouble(valuesItem[2])));
		}
		return items;
	}



}
