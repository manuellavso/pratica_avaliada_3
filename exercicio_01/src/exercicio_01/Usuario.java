package exercicio_01;

public class Usuario {
	
	private String nome;
	private String email;
	
	//MÉTODO CONSTRUTOR
	public Usuario(String nome, String email) {
		super();
		Validacao.validarNome(nome);
		Validacao.validarEmail(email);
		this.nome = nome;
		this.email = email;
	}

	//MÉTODO GET E SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Validacao.validarNome(nome);
		this.nome = nome;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		Validacao.validarEmail(email);
		this.email = email;
	}
	
	//MÉTODO VISUALIZAR
	public void visualizar() {
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("│ ➤ D A D O S   D O   U S U A R I O	     ");
		System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");		
		System.out.printf("Nome: %s", this.nome);
		System.out.printf("%nE-mail: %s", this.email);
	}
}
