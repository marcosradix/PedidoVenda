package pedidoVendaBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PesquisaProdutoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Integer> produtos = new ArrayList<>();

	public List<Integer> getProdutos() {
		return produtos;
	}

	public PesquisaProdutoBean() {

		for (int i = 0; i < 50; i++) {
			
			produtos.add(i);
		}
	}
	
	
	
	
}
