package veiculos;

public class Taxi extends VeiculoTransporte implements Abastecivel {
	public Taxi(String identificador, int capacidade) {
		super(identificador, capacidade);
	}

	@Override
	public void mover() {
		System.out.println("O taxi esta andando...");
	}
	
	public void abastecer() {
		System.out.println("O taxi esta abastecendo...");
	}
}
