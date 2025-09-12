import model.*;
import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();
        Endereco e = new Endereco();
        Contato c = new Contato();
        String sAux;
        int iAux;

        int op;

        do{
            System.out.println("== Sistema de Cadastro ==");
            System.out.println("1 - Cadastrar Pessoa \n2 - Sair");
            System.out.print("\nInsira a opção desejada: ");
            op = sc.nextInt();
            System.out.print("\n");

            switch(op){
                case 1:
                    sc.nextLine();

                    System.out.print("Digite o nome: ");
                    sAux = sc.nextLine();
                    p.setNome(sAux);

                    System.out.print("Digite a idade: ");
                    iAux = sc.nextInt();
                    p.setIdade(iAux);

                    System.out.print("Digite o CPF: ");
                    sAux = sc.next();
                    p.setCpf(sAux);

                    System.out.print("Digite o email: ");
                    sAux = sc.next();
                    c.setEmail(sAux);

                    System.out.print("Digite o telefone: ");
                    sAux = sc.next();
                    c.setTelefone(sAux);

                    sc.nextLine();
                    System.out.print("Digite o nome da rua: ");
                    sAux = sc.nextLine();
                    e.setRua(sAux);

                    System.out.print("Digite numero: ");
                    iAux = sc.nextInt();
                    e.setNumero(iAux);

                    System.out.print("Digite s caso tenha casa: ");
                    sAux = sc.next();
                    if(sAux.equals("s")){
                        e.setCasa(true);
                    } else {
                        e.setCasa(false);
                    }

                    sc.nextLine();
                    System.out.print("Digite o complemento: ");
                    sAux = sc.nextLine();
                    e.setComplemento(sAux);

                    System.out.print("Digite o bairro: ");
                    sAux = sc.nextLine();
                    e.setBairro(sAux);

                    System.out.print("Digite a cidade: ");
                    sAux = sc.nextLine();
                    e.setCidade(sAux);

                    System.out.print("Digite o estado: ");
                    sAux = sc.nextLine();
                    e.setEstado(sAux);

                    System.out.print("Digite o CEP: ");
                    sAux = sc.next();
                    e.setCep(sAux);

                    p.setContato(c);
                    p.setEndereco(e);

                    System.out.println("\nCadastro Realizado Com Sucesso!");
                    System.out.println(p.apresentar());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("\nSistema encerrado!");
                    break;
                default:
                    System.out.println("\nOpcao Invalida");
            }
        }while(op != 2);
    }
}