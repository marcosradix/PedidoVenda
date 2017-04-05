package pacoteTeste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import pedidoVenda.model.Cliente;
import pedidoVenda.model.Endereco;
import pedidoVenda.model.TipoPessoa;

public class Teste {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoVenda");
		EntityManager manager =  factory.createEntityManager();
		EntityTransaction trx = manager.getTransaction();		
		trx.begin();
		/*
		Cliente cli = new Cliente();
		cli.setNome("João Oliveria");
		cli.setEmail("jo@gmail.com.br");
		cli.setDocumentoReceitaFederal("60545-274");
		cli.setTipo(TipoPessoa.FISICA);
		Endereco endereco =  new Endereco();
		endereco.setLogradouro("Rua das aboras Vermelhas");
		endereco.setNumero("15");
		endereco.setCidade("Fortaleza");
		endereco.setUf("CE");
		endereco.setCep("60000000");
		endereco.setComplemento("casa");
		endereco.setCliente(cli);
		cli.getEnderecos().add(endereco);
		manager.persist(cli);
		*/
		trx.commit();
		
	}
}
