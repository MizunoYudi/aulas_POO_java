import pacoteA.Endereco;
import pacoteA.Contato;

public class classePrincipal {
    public static void main(String[] args){
        Contato contato1 = new Contato("Noim", "40028922");
        System.out.println(contato1.mostrarContato());
        contato1.setEmail("biriba@hotmail.com");
        System.out.println(contato1.mostrarContato());
    
        Endereco endereco1 = new Endereco("Bairro", "Vila");
        System.out.println(endereco1.mostrarEndereco());
        
        Endereco endereco2 = new Endereco("Guilhermina", "Esperanca");

        //endereco endereco3 = endereco2 // passando o ponteiro de endereco 2 para endereco 3, o correto para copiar seria:
        //endereco endereco3 = new endereco(endereco2.getRua(), endereco2.getCidade());

        Pessoa pessoa1 = new Pessoa("Pablo", 12, "4034394233", contato1, endereco1);
        System.out.println(pessoa1.apresentar());
    }
}