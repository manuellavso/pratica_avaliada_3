package exercicio_03;

public class Validacao {

	//VALIDAR MENSAGEM - Não pode ser vazio
		public static void validarMensagem(String mensagem) {
			if(mensagem == null || mensagem.trim().isEmpty())
				throw new IllegalArgumentException("A mensagem não pode ser vazia!");
		}
		
		//VALIDAR DESTINATARIO
		//1. EMAIL
		public static void validarEmail(String email) {
		    if (!email.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(\\.[a-zA-Z]{2,})+$")) {
		        throw new IllegalArgumentException("Email inválido!");
		    }
		}
		
		//2. SMS
		public static void validarSMS(String telefone) {
		    if (!telefone.matches("\\(?\\d{2}\\)?\\s?9?\\d{4}-?\\d{4}")) {
		        throw new IllegalArgumentException("Número inválido!");
		    }
		}
		
}
