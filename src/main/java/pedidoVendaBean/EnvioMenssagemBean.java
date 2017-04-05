package pedidoVendaBean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pedidoVenda.funcionario.Menssageiro;
import pedidoVenda.funcionario.Urgente;
@Named
@RequestScoped
public class EnvioMenssagemBean implements Serializable{
	private static final long serialVersionUID = 1L;

	@Inject @Urgente
	private Menssageiro menssagem;
	
	private String texto;
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	public void meuInject(){
		
		menssagem.enviarMenssagem(texto);
	}
	
	
}
