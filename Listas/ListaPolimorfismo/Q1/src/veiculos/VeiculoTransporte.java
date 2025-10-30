package veiculos;

public abstract class VeiculoTransporte {
	public int capacidade;
	public String identificador;
	
	public VeiculoTransporte(String identificador, int capacidade) {
		this.capacidade = capacidade;
		this.identificador = identificador;
	}
	
	public void mover() {
		
	}
	
	public void mostrarInfo() {
		
	}
}
