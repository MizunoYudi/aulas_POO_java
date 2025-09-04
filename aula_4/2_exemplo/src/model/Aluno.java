package model;

public class Aluno{
    protected String nome;
    int idade; // Implicitamente, ele é da restrição protected

    public Aluno(){}

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome; // Poderia ser this.nome tbm
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(String: idade){
        this.idade = idade;
    } 

    public String showAluno(){
        return "Nome: " + this.getNome() + "\nIdade: " + this.getIdade();
    }
}