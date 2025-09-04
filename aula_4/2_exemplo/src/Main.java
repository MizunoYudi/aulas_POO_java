import model.Aluno;

public class Main{
    public static void main(String[] args){
        Aluno aluno1 = new Aluno(nome: "nome", idade:"25");
        System.out.println(aluno1.showAluno());
    }
}