import pacoteA.Endereco;
import pacoteA.Contato;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private Contato contato;
    private Endereco endereco;

    public Pessoa(String nome, int idade, String cpf, Contato contato, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.contato = contato;
        this.endereco = endereco;
    }

    public String apresentar(){
        return String.format("Nome: %s\nIdade: %d\nCPF: %s\nContato: %s\nEndereco: %s", nome, idade, cpf, contato.mostrarContato(), endereco.mostrarEndereco());
    }

    //ToDo getters and setters
}