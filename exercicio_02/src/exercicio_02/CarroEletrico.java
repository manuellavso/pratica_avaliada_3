package exercicio_02;

public class CarroEletrico extends Carro{

	//ATRIBUTO DE CARRO ELETRICO
	private int nivelBateria;
	
	//MÉTODO CONSTRUTOR
	public CarroEletrico(String modelo, int velocidade, int nivelBateria) {
		super(modelo, velocidade);
		Validacao.validarNivelBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}

	
	//GET AND SET
	public int getNivelBateria() {
		return nivelBateria;
	}
	public void setNivelBateria(int nivelBateria) {
		Validacao.validarNivelBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}
	
	
	//SOBRESCREVER ACELERAR + CALCULAR CONSUMO
	//CONSTANTE CONSUMO
	private static final int consumoPorAceleracao = 2;
	
	@Override
	public int acelerar(int valorAceleracao) {

		//CALCULAR CONSUMO
	    Validacao.validarAceleracao(valorAceleracao);
	    int consumoBateria = valorAceleracao /consumoPorAceleracao;

	    //CALCULAR NOVO NÍVEL DA BATERIA APOS ACELERAR
	    Validacao.validarConsumoBateria(consumoBateria, nivelBateria);
	    Validacao.validarNivelBateria(nivelBateria);
	    nivelBateria -= consumoBateria;

	    return super.acelerar(valorAceleracao);
	}
	
	//SOBRESCREVER VISUALIZAR
		@Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Nível de bateria: " +nivelBateria+ "%");
			System.out.println();
		}

}
