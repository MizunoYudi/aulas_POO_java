package model;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;

    public Endereco(String rua, int numero, String bairro){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getRua(){
        return rua;
    }

    public int getNumero(){
        return numero;
    }

    public String getBairro(){
        return bairro;
    }

    public void ExibirEndereco(){
        System.out.println("Rua: " + this.getRua() +
                           "\nNumero: " + this.getNumero() + 
                           "\nBairro: " + this.getBairro());
    }
}
