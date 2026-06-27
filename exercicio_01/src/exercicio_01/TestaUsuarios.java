package exercicio_01;

public class TestaUsuarios {

		public static void main(String[] args) {

			usuarioValido();
			administradorValido();
			nomeVazio();
			emailInvalido();
			nivelInvalido();
		}

		
		//USUÁRIO VÁLIDO
		static void usuarioValido() {
			System.out.println("\n➤ Caso 1: Usuário válido");
			try {
				Usuario usuario1 = new Usuario("Aimee", "AimeeEDanteFofinhos@empresa.com");
				usuario1.visualizar();
			} catch (Exception e) {
				System.err.println("Erro: " + e.getMessage());
			}
		}

		//ADMINISTRADOR VÁLIDO
		static void administradorValido() {
			System.out.println("\n➤ Caso 2: Administrador válido");
			try {
				Administrador administrador1 = new Administrador("Rafael", "RafaProfJava85@empresa.com", 3);
				administrador1.visualizar();
			} catch (Exception e) {
				System.err.println("Erro: " + e.getMessage());
			}
		}
		
		
		//NOME VAZIO
		static void nomeVazio() {
			System.out.println("\n➤ Caso 3: Nome vazio");
			try {
				Administrador administrador2 = new Administrador("   ", "RafaprofGenJava85@empresa.com", 3);
				administrador2.visualizar();
			} catch (Exception e) {
				System.err.println("Erro: " + e.getMessage());
			}
		}

		
		//E-MAIL INVÁLIDO
		static void emailInvalido() {
			System.out.println("\n➤ Caso 4: E-mail inválido");
			try {
				Administrador administrador3 = new Administrador("Rafael Queiroz", "RafaprofGenJava85empresa.com", 3);
				administrador3.visualizar();
			} catch (Exception e) {
				System.err.println("Erro: " + e.getMessage());
			}
		}

	
		//EXTRA:
		//NÍVEL INVÁLIDO
		static void nivelInvalido() {
			System.out.println("\n➤ Caso 5: Nível de acesso inválido");
			try {
				Administrador administrador4 = new Administrador("Rafael", "RafaprofGenJava85@empresa.com", 0);
				administrador4.visualizar();
			} catch (Exception e) {
				System.err.println("Erro: " + e.getMessage());
			}
	}

		
}
