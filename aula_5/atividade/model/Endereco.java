package model;

public class Endereco {
    private String rua;
    private String cidade;
    private int numero;
    private String cep;
    private boolean casa;
    private String complemento;
    private String estado;
    private String bairro;

    public Endereco(String rua, String cidade, int numero, String cep, boolean casa, String complemento, String bairro){
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
        this.casa = casa;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    public Endereco(){

    }

    public String getRua(){
        return rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getCasa(){
        if(casa){
            return "Casa - ";
        }
        return "";
    }

    public void setCasa(boolean casa){
        this.casa = casa;
    }

    public String getComplemento(){
        return complemento;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getBairro(){
        return bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String mostrarEndereco() {
        return String.format("%s, %s, %s, %d, %s, %s %s, %s", rua, bairro, cidade, numero, cep, this.getCasa(), complemento, estado);
    }
}