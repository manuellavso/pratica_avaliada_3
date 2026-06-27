package exercicio_01;

public class Validacao {

	//VALIDAR NOME
	public static void validarNome(String nome) {
		if(nome == null || nome.trim().isEmpty())
			throw new IllegalArgumentException("O nome não pode ser vazio.");
	}
	
	//VALIDAR E-MAIL
	public static void validarEmail(String email) {
		if (!email.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$"))
			throw new IllegalArgumentException("Digite um e-mail válido!");
	}

	//VALIDAR NÍVEL DE ACESSO
	public static void validarNivel(int nivelDeAcesso) {
		if(nivelDeAcesso <= 0 || nivelDeAcesso >3)
			throw new IllegalArgumentException("O nível de acesso está inválido, escolha um valor de 1 a 3 onde:"
					+ "1. Pouco acesso | 2. Médio acesso | 3. Acesso total");
	}
	
}
