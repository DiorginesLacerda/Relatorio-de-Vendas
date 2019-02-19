package service;

import java.util.Comparator;
import java.util.List;

import entity.Relatorio;
import entity.Venda;
import repository.Context;
import repository.RelatorioRepository;

public class RelatorioService {

	private Context context;
	private RelatorioRepository repository;
	
	public RelatorioService(Context context) {
		super();
		this.context = context;
		this.repository = new RelatorioRepository(context);
	}
	
	
	public void performSaveRelatorio() throws Exception {
		repository.save(new Relatorio(
				context.getClientes().size(),
				context.getVendedores().size(),
				getMorExpenxiveSale(context.getVendas()),
				getLastSalesman(context.getVendas())
				));
	}
	
	private Long getMorExpenxiveSale(List<Venda> input) {
		Venda venda = input.parallelStream().max(Comparator.comparing(Venda::amountPrice)).get();
		
		return venda.getId();
	}
	
	private String getLastSalesman(List<Venda> input) {
		double min = -1;
		String name = "";
		
		for (Venda venda : input) {
			if(min<0) {
				min = venda.amountPrice();
				name = venda.getSalemanName();
			}
			else if(venda.amountPrice()<min) {
				min = venda.amountPrice();
				name = venda.getSalemanName();
			}
		}
		
		return name;
	}
	
	
	
	
}
