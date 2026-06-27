package exercicio_03;

public class NotificacaoEmail extends Notificacao{

	//MÉTODOS CONSTRUTORES
	public NotificacaoEmail(String destinatario) {
		super(destinatario);
		Validacao.validarEmail(destinatario);
	}

	//SOBRESCREVER ENVIAR
	 @Override
	    public void enviar(String mensagem) {
	        Validacao.validarMensagem(mensagem);
	        System.out.println("Enviando email para: " + getDestinatario());
	        System.out.println("Mensagem: " + mensagem);
	    }

}
