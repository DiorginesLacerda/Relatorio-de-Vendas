package entity;

import java.util.ArrayList;
import java.util.List;

public class Venda{
	private long id;
	private List<Item> items;
	private String salemanName;
	
	public Venda() {
		this.items = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	

	public Venda(long id, List<Item> items, String salemanName) {
		super();
		this.id = id;
		this.items = items;
		this.salemanName = salemanName;
	}

	public Double amountPrice() {
		return this.items.stream().mapToDouble(Item::getPrice).sum();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getSalemanName() {
		return salemanName;
	}

	public void setSalemanName(String salemanName) {
		this.salemanName = salemanName;
	}
	
	
	
	
}
