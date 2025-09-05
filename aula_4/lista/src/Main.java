import service.CadastroService;

public class Main{
    public static void main(String[] args){
        CadastroService cadastro = new CadastroService();

        cadastro.CadastrarPessoa("Antonio", 37, "Atonietos", 299, "Alameda Vilabos");
        cadastro.MostrarPessoa();
    }
}