package exercicio_01;

public class Administrador extends Usuario {

	private int nivelDeAcesso;
	
	//MÉTODO CONSTRUTOR
	public Administrador(String nome, String email, int nivelDeAcesso) {
		super(nome, email);
		Validacao.validarNivel(nivelDeAcesso);
		this.nivelDeAcesso = nivelDeAcesso;
	}
	
	//MÉTODOS GET E SET
	public int getNivelDeAcesso() {
		return nivelDeAcesso;
	}
	public void setNivelDeAcesso(int nivelDeAcesso) {
		Validacao.validarNivel(nivelDeAcesso);
		this.nivelDeAcesso = nivelDeAcesso;
	}
	
	//SOBRESCREVER VISUALIZAR
	@Override
	public void visualizar() {
		super.visualizar();
		
		String nivel = "";

		switch(this.nivelDeAcesso){
		case 1:
				nivel = "Pouco acesso";
		break;
		case 2:
				nivel = "Médio acesso";
		break;
		case 3:
				nivel = "Acesso total";
		break;
		}
		
		System.out.printf("\nNível de acesso: %s", nivel);
		System.out.println();
	}
	
	

}
