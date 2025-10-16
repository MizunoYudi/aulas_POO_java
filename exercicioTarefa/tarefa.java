package exercicioTarefa;

public abstract class tarefa {
	private String descricao;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	
	public abstract String resumo();
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
