package banco;

public class Transferencia extends Operacoes implements Operavel {
	public String contaDestino;
	
	public void executarOperacao() {
		System.out.println("A transferência de R$" + super.valor + " realizada para a conta de " + contaDestino);
	}
}
