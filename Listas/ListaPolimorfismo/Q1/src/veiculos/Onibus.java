package veiculos;

public class Onibus extends VeiculoTransporte implements Abastecivel {
	
	@Override
	public void mover() {
		System.out.println("O onibus esta andando...");
	}
	
	public void abastecer() {
		System.out.println("O onibus esta abastecendo");
	}
}
