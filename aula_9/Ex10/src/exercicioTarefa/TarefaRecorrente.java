package exercicioTarefa;

public class TarefaRecorrente extends Tarefa implements Executavel {
	private int diasDecorrentes;

	public TarefaRecorrente(String descricao, int diasDecorrentes) {
		super(descricao);
		this.setDiasDecorrentes(diasDecorrentes);
	}

	@Override
	public String resumo() {
		return String.format("Tarefa Reco: %s, Dias: %d", getDescricao(), diasDecorrentes);
	}

	public int getDiasDecorrentes() {
		return diasDecorrentes;
	}

	public void setDiasDecorrentes(int diasDecorrentes) {
		this.diasDecorrentes = diasDecorrentes;
	}

	@Override
	public void executarTarefa() {
		System.out.println(String.format("Programando uma tarefa para executar em %d dias", diasDecorrentes));
		
	}
	
}
