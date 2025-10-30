package veiculos;

public class Bicicleta extends VeiculoTransporte {
	public Bicicleta(String identificador, int capacidade) {
		super(identificador, capacidade);
	}

	@Override
	public void mover() {
		System.out.println("Andando de bicicleta...");
	}
}
