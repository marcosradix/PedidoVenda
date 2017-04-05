package pedidoVendaBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pedidoVenda.funcionario.service.NegocioException;

@RequestScoped
@Named
public class CadastroPedidosBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Integer> produtos = new ArrayList<>();

	public List<Integer> getProdutos() {
		return produtos;
	}

	public CadastroPedidosBean() {

		for (int i = 0; i < 1; i++) {
			
			produtos.add(i);
		}
	}
	
	public void salvar(){
		throw new NegocioException("O pedido não pode ser salvo, método não implementado");
	}
	
}







