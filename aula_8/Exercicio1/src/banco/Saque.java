package banco;

public class Saque extends Operacoes implements Operavel{
	public double taxa;
	
	public void executarOperacao() {
		double a = super.valor - (super.valor*taxa/100);
		System.out.println("O valor sacado foi: R$" + a);
	}
}
