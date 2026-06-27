package exercicio_03;

public class TestaNotificacoes {

	  public static void main(String[] args) {
	        testarEmail();
	        testarSMS();
	        testarMensagemVazia();
	        testarDestinatarioVazio();
	        testarSMSVazio();
	        tipoInexistente();
	  }
	  
	 
    //EMAIL VÁLIDO
    public static void testarEmail() {
        criarNotificacao("Email", "manuellavi0@email.com", "Bom trabalho!");
        System.out.println();
    }

    //SMS VÁLIDO
    public static void testarSMS() {
        criarNotificacao("SMS", "1198729-4576", "Oii, me adiciona é a Clara :)");
        System.out.println();
    }

    //MENSAGEM VAZIA
    public static void testarMensagemVazia() {
    	try {
        criarNotificacao("SMS", "11991722279", "");
    } catch(Exception e) {
        System.err.println("Erro: " + e.getMessage());
    }
}
    
    //DESTINATÁRIO VAZIO - EMAIL
    public static void testarDestinatarioVazio() {
    	try {
        criarNotificacao("Email", "  ", "Oii");
    } catch(Exception e) {
        System.err.println("Erro: " + e.getMessage());
    }
}
    
    //DESTINATÁRIO VAZIO - SMS
    public static void testarSMSVazio() {
    	try {
        criarNotificacao("SMS", "  ", "Oii");
    } catch(Exception e) {
        System.err.println("Erro: " + e.getMessage());
    }
}
    
  //TIPO INEXISTENTE
    public static void tipoInexistente() {
    	try {
        criarNotificacao("", "Generation@gmail.com", "Oii");
    } catch(Exception e) {
        System.err.println("Erro: " + e.getMessage());
    }
}
    

	//MÉTODO CRIAR NOTIFICAÇÃO
    public static void criarNotificacao(String tipo, String destinatario, String mensagem) {
      Validacao.validarMensagem(mensagem);
      
    	if (tipo.equalsIgnoreCase("Email")) {
    		Validacao.validarEmail(destinatario);
            System.out.println("Enviando Email para " + destinatario);
            System.out.println("Mensagem: "+mensagem);
        } 
        
        else if (tipo.equalsIgnoreCase("SMS")) {
        	Validacao.validarSMS(destinatario);
            System.out.println("Enviando SMS para " + destinatario);
            System.out.println("Mensagem: "+mensagem);
        }
        else {
            throw new IllegalArgumentException("Tipo inexistente!");
      }
    }
    
    
    
   } 