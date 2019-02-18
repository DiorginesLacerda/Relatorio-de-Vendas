package entity;

public class Relatorio {

	private int qtdClients;
	private int qtdSalesMan;
	private Long idSaleMorExpensive;
	private String nameLastVendor;
	
	public Relatorio() {
		// TODO Auto-generated constructor stub
	}

	public Relatorio(int qtdClients, int qtdSalesMan, Long idSaleMorExpensive, String nameLastVendor) {
		super();
		this.qtdClients = qtdClients;
		this.qtdSalesMan = qtdSalesMan;
		this.idSaleMorExpensive = idSaleMorExpensive;
		this.nameLastVendor = nameLastVendor;
	}

	public int getQtdClients() {
		return qtdClients;
	}

	public void setQtdClients(int qtdClients) {
		this.qtdClients = qtdClients;
	}

	public int getQtdSalesMan() {
		return qtdSalesMan;
	}

	public void setQtdSalesMan(int qtdSalesMan) {
		this.qtdSalesMan = qtdSalesMan;
	}

	public Long getIdSaleMorExpensive() {
		return idSaleMorExpensive;
	}

	public void setIdSaleMorExpensive(Long idSaleMorExpensive) {
		this.idSaleMorExpensive = idSaleMorExpensive;
	}

	public String getNameLastVendor() {
		return nameLastVendor;
	}

	public void setNameLastVendor(String nameLastVendor) {
		this.nameLastVendor = nameLastVendor;
	}

	@Override
	public String toString() {
		return "----Relatorio----\nQuantidade de Clientes=" + qtdClients + "\nQuantidade de Vendedores=" + qtdSalesMan + "\nId da maior venda="
				+ idSaleMorExpensive + "\nPior Vendedor=" + nameLastVendor;
	}
	
	
	
}
