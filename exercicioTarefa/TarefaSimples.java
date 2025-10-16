package exercicioTarefa;

public class TarefaSimples extends tarefa {
	
	public TarefaSimples(String descricao) {
		super(descricao);
	}
	
	@Override
	public String resumo() {
		return String.format("Tarefa Simples: %s", getDescricao());
	}
}
