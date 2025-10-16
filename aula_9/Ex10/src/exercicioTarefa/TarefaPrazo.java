package exercicioTarefa;

public class TarefaPrazo extends Tarefa implements Executavel{
	private String prazo;
	
	public TarefaPrazo(String descricao, String prazo) {
		super(descricao);
		this.prazo = prazo;
	}

	@Override
	public String resumo() {
		return String.format("Tarefa Agendada: %s, Prazo: %s", getDescricao(), prazo);
	}

	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	@Override
	public void executarTarefa() {
		System.out.println("Agendando uma tarefa...");
		
	}
}
