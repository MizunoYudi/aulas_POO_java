package banco;

public class Deposito extends Operacoes implements Operavel {
	public void executarOperacao() {
		System.out.println("O valor depositado foi: " + super.valor);
	}
}
