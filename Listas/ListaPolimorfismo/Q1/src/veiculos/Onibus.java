package veiculos;

public class Onibus extends VeiculoTransporte implements Abastecivel {
	
	public Onibus(String identificador, int capacidade) {
		super(identificador, capacidade);
	}

	@Override
	public void mover() {
		System.out.println("O onibus esta andando...");
	}
	
	public void abastecer() {
		System.out.println("O onibus esta abastecendo");
	}
}
