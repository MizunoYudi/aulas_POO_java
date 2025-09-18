public class Produto{
    private String nome;
    private double preco;
    private int qtd;

    public Produto(){
        this.nome = "Vazio";
        this.preco = 0;
        this.qtd = 0;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public void exibirDados(){
        System.out.println(String.format("Nome: %s\nPreco: %.2f\nQuantidade: %d\n", nome, preco, qtd));
    }

    public static void main(String[] args){
        Produto p1 = new Produto();
        Produto p2 = new Produto("Produto", Double.valueOf(3));
        Produto p3 = new Produto("Mousepad", Double.valueOf(39.90), 3);

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
    }
}