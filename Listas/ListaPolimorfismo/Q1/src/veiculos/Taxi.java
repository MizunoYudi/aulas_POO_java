package veiculos;

public class Taxi extends VeiculoTransporte implements Abastecivel {
	@Override
	public void mover() {
		System.out.println("O taxi esta andando...");
	}
	
	public void abastecer() {
		System.out.println("O taxi esta abastecendo...");
	}
}
