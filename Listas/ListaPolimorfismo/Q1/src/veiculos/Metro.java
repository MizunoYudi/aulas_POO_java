package veiculos;

public class Metro extends VeiculoTransporte {
	public Metro(String identificador, int capacidade) {
		super(identificador, capacidade);
	}

	@Override
	public void mover() {
		System.out.println("Andando pelo metro...");
	}
}
