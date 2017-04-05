package pedidoVenda.funcionario;

public class MenssageiroCorreio implements Menssageiro{

	@Override
	public void enviarMenssagem(String menssagem) {
		System.out.println("Enviando menssagem por correio :"+ menssagem);
		
	}

}
