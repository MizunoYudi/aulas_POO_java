package exercicioTarefa;

import java.util.ArrayList;
import java.util.List;

public class ExercicioMain {
	public static void main(String[] args) {
		List<Tarefa> tarefaList = new ArrayList<>();
		tarefaList.add(new TarefaSimples("Fazer chamada."));
		tarefaList.add(new TarefaPrazo("Aplicar Prova II", "06/11/2025"));
		tarefaList.add(new TarefaRecorrente("Dar aula", 5));
		
		for(Tarefa tarefa: tarefaList) {
			System.out.println(tarefa.resumo());
			if(tarefa instanceof TarefaPrazo) {
				System.out.println(((TarefaPrazo) tarefa).getPrazo());
			}
			
			if(tarefa instanceof Executavel) {
				((Executavel)tarefa).executarTarefa();
			}
		}
		
		List<Executavel> executavelList = new ArrayList<>();
		executavelList.add(new TarefaSimples("Fazer chamada."));
		executavelList.add(new TarefaPrazo("Aplicar Prova II", "06/11/2025"));
		executavelList.add(new TarefaRecorrente("Dar aula", 5));
		
		for(Executavel exec : executavelList) {
			exec.executarTarefa();
		}
	}
}
