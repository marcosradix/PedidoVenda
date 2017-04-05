package pedidoVendaBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PesquisaPedidosBean {

	private List<Integer> produtos = new ArrayList<>();

	public List<Integer> getProdutos() {
		return produtos;
	}

	public PesquisaPedidosBean() {

		for (int i = 0; i < 50; i++) {
			
			produtos.add(i);
		}
	}
	
	
	
	
}
