package exercicio_03;

public class Notificacao {

	private String destinatario;
	
	//MÉTODOS CONSTRUTORES
	public Notificacao(String destinatario) {
		this.destinatario = destinatario;
	}

	//GETTERS AND SETTERS
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	
	//MÉTODO ENVIAR
	public void enviar(String mensagem) {
		Validacao.validarMensagem(mensagem);
		System.out.print("➤ Enviando ");
	}
	
}