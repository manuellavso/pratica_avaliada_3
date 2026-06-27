package exercicio_03;

public class NotificacaoSMS extends Notificacao{

	//MÉTODOS CONSTRUTORES
	public NotificacaoSMS(String destinatario) {
		super(destinatario);
		Validacao.validarSMS(destinatario);

	}

	//SOBRESCREVER ENVIAR
	 @Override
	    public void enviar(String mensagem) {
	        Validacao.validarMensagem(mensagem);
	        System.out.println("Enviando SMS para: " + getDestinatario());
	        System.out.println("Mensagem: " + mensagem);
	    }

}