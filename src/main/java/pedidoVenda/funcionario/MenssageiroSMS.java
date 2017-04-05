package pedidoVenda.funcionario;

@Urgente
public class MenssageiroSMS implements Menssageiro{

	@Override
	public void enviarMenssagem(String menssagem) {
		System.out.println("Enviando menssagem por SMS: "+ menssagem);
		
	}


}
