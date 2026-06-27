package exercicio_02;

public class Carro {

	//ATRIBUTOS
	private String modelo;
	private int velocidade;
	
	//MÉTODO CONSTRUTOR
	public Carro(String modelo, int velocidade) {
		super();
		Validacao.validarModelo(modelo);
		Validacao.validarVelocidade(velocidade);
		
		this.modelo = modelo;
		this.velocidade = velocidade;
	}

	//MÉTODOS GET AND SET
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		Validacao.validarModelo(modelo);
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		Validacao.validarVelocidade(velocidade);
		this.velocidade = velocidade;
	}
	
	//MÉTODO ACELERAR
	public int acelerar(int valorAceleracao) {
		Validacao.validarAceleracao(valorAceleracao);
		velocidade = velocidade + valorAceleracao;
		return velocidade;
			
	}
	
	//MÉTODO VISUALIZAR
	public void visualizar() {
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("│ ➤ D A D O S   D O   C A R R O:     ");
		System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");		
		System.out.println("Modelo: " +this.modelo);
		System.out.println("Velocidade: "+this.velocidade);
	}
	
	
	
}
