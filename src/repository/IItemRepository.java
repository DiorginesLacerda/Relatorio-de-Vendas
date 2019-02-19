package repository;

import java.util.List;

import entity.Item;

public interface IItemRepository extends IRepository<Item> {

	public List<Item> getAll(String input)throws Exception;
}
