package entity;

public class Item{
	
	private Long id;
	private Double quantity;
	private Double price;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	

	public Item(Long id, Double quantity, Double price) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
