package model;

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
    
    public Pessoa(){

    }

    public String apresentar(){
        return String.format("Nome: %s\nIdade: %d anos\nCPF: %s\nContato: \n%s\nEndereco: \n%s", nome, idade, cpf, contato.mostrarContato(), endereco.mostrarEndereco());
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Contato getContato(){
        return contato;
    }

    public void setContato(Contato contato){
        this.contato = contato;
    }
}