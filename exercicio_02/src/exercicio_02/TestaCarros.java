package exercicio_02;

public class TestaCarros {

	public static void main(String[] args) {

		carroEletrico();
		carroEletricoAc();
		aceleracaoValida();
		aceleracaoInvalida();
		bateriaInsuficiente();
		bateriaNegativa();
		bateriaAcimaDeCem();
		
	}
	/*Observação: não deixei todos com System.err.println pois o STS estava bugando e misturando tudo, 
	o que fazia a formatação sair errada no console (pulando linha e não aparecendo no lugar certo)*/
	
	//CARRO ELÉTRICO VÁLIDO
	static void carroEletrico() {
		try {
			System.out.println("\n➤ Caso 1: Criação de um carro elétrico");
			CarroEletrico ce1 = new CarroEletrico("BYD", 40, 80);
			ce1.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	//CARRO ELÉTRICO ACELERANDO VÁLIDO
	static void carroEletricoAc() {
		try {
			System.out.println("\n➤ Caso 2: Carro elétrico acelerando");
			CarroEletrico ce10 = new CarroEletrico("BYD", 0, 20);
			ce10.acelerar(30);
			ce10.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

	//CARRO ACELERANDO VÁLIDO - Não elétrico
	static void aceleracaoValida() {
		try {
			System.out.println("\n➤ Caso 3: Aceleração válida");
			Carro c1 = new Carro("Fiat", 20);
			System.out.println("Velocidade inicial: " + c1.getVelocidade());
			c1.acelerar(30);
			System.out.println("\nVelocidade final: " + c1.getVelocidade());
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	
	//ACELERAÇÃO INVÁLIDA
	static void aceleracaoInvalida() {
		try {
			System.out.println("\n➤ Caso 4: Aceleração inválida");
			Carro c2 = new Carro("Fiat", 20);
			c2.acelerar(-30);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	
	//BATERIA INSUFICIENTE
	static void bateriaInsuficiente() {
		try {
			System.out.println("\n➤ Caso 5: Bateria insuficiente");
			CarroEletrico ce2 = new CarroEletrico("BYD", 40, 50);
			ce2.acelerar(120);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}


	//BATERIA MENOR QUE 0
	static void bateriaNegativa() {
		try {
			System.out.println("\n➤ Caso 6: Bateria menor que zero");
			CarroEletrico ce3 = new CarroEletrico("Nissan", 20, -10);
			ce3.visualizar();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	
	//BATERIA MAIOR QUE 100
		static void bateriaAcimaDeCem() {
			try {
				System.out.println("\n➤ Caso 7: Nível de bateria acima de 100%");
				CarroEletrico ce4 = new CarroEletrico("Nissan", 20, 110);
				ce4.visualizar();
			} catch (Exception e) {
				System.err.println("Erro: " + e.getMessage());
			}
		}
		
		

}
