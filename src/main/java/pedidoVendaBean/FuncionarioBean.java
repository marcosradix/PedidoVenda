package pedidoVendaBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import pedidoVenda.funcionario.Funcionario;

@ViewScoped
@ManagedBean
public class FuncionarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final String [] nomes= {"João", "Maria", "José", "Eduardo",
			"Sabastão", "Mariana", "Francisco","Manoel","Fernanda","Gabriela", "Mario","Marcos"};
	
	private static final String [] sobreNomes= {"Souza","Silva","Andrade","Machado",
			"Junior","Albuquerque","Alencar","Assis","Batista","camargo", "Coelho", "Costa", "Dias", "Rosa",
			"Leal","Lima","Leite"};
	
	private List<Funcionario> funcionarios;

	public FuncionarioBean() {
		funcionarios = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			
			adicionarFuncionario();
		}
	}

	private void adicionarFuncionario() {
			
	String nomeCompleto = getNomeAleatorio();
	funcionarios.add(new Funcionario(nomeCompleto));
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public String getNomeAleatorio(){
		int posicao = (int) Math.round(Math.random() * (nomes.length - 1));
		
		return nomes[posicao];
	}
	
	public String getSobreNomeAleatorio(){
		int posicao = (int) Math.round(Math.random() * (sobreNomes.length - 1));
		
		return sobreNomes[posicao];
	}
	
}







