package exercicioTarefa;

public class TarefaSimples extends Tarefa implements Executavel{
	
	public TarefaSimples(String descricao) {
		super(descricao);
	}
	
	@Override
	public String resumo() {
		return String.format("Tarefa Simples: %s", getDescricao());
	}

	@Override
	public void executarTarefa() {
		System.out.println("Executando uma tarefa simples...");
		
	}
}

