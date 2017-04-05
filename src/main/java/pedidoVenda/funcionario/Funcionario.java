package pedidoVenda.funcionario;

import java.io.Serializable;
import java.math.BigDecimal;

public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	private String matricula;
	private String nome;
	private String dataAdmissao;
	private BigDecimal salario;
	
	public Funcionario() {
	}

	
	public Funcionario(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	
	
}
