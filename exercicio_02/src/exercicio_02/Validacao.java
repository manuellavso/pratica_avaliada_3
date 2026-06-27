package exercicio_02;

public class Validacao {

	//VALIDAR MODELO - Não pode ser vazio
	public static void validarModelo(String modelo) {
		if(modelo == null || modelo.trim().isEmpty())
			throw new IllegalArgumentException("O modelo não pode ser vazio!");
	}
	
	//VALIDAR VELOCIDADE
	public static void validarVelocidade(int velocidade) {
		if(velocidade < 0)
			throw new IllegalArgumentException("A velocidade não pode ser negativa.");
	}
	
	//VALIDAR A ACELERAÇÃO
	public static void validarAceleracao(int valorAceleracao) {
		if(valorAceleracao <= 0)
			throw new IllegalArgumentException("A aceleração deve ser maior que zero!");
	}

	//VALIDAR NÍVEL DE BATERIA <0
	public static void validarNivelBateria(int nivelBateria) {
	    if (nivelBateria < 0)
	        throw new IllegalArgumentException("Bateria não pode ser negativa!");
	    if (nivelBateria > 100)
	        throw new IllegalArgumentException("Bateria não pode ser maior que 100!");
	}
	
	//VALIDAR NÍVEL INSUFICIENTE DE BATERIA
		public static void validarConsumoBateria(int consumoBateria, int nivelBateria) {
			if(consumoBateria > nivelBateria)
				throw new IllegalArgumentException("Bateria insuficiente para acelerar!");
		}
	
}
