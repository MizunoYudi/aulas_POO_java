package service;

import model.Pessoa;
import model.Endereco;

public class CadastroService {
    private Pessoa pessoa;

    public CadastroService(){
    }

    public void CadastrarPessoa(String nome, int idade, String rua, int numero, String bairro) {
        Endereco endereco = new Endereco(rua, numero, bairro);
        pessoa = new Pessoa(nome, idade, endereco);
    }

    public void MostrarPessoa() {
        pessoa.exibirDados();
    }
}