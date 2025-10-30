package pedidosRestaurante;

public abstract class Pedido {
	public int valor;
	public String descricao;
	
	public void resumo() {
		
	}
	
	public double calcularTaxaServico() {
		return valor*10/100;
	}
}
