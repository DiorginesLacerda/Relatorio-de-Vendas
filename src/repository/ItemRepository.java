package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Item;

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
	public List<Item> getAll(String input) {
		String[] txtItems = input.substring(1, input.length() - 1).split(",");
		List<Item> items = new ArrayList<>();

		for (String item : txtItems) {
			String[] valuesItem = item.split("-");
			items.add(new Item(Long.parseLong(valuesItem[0]), Double.parseDouble(valuesItem[1]),
					Double.parseDouble(valuesItem[2])));
		}
		return items;
	}



}
