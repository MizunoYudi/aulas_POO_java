import java.util.ArrayList;
import java.util.Scanner;

public class ReservaHotel{
    private String nome;
    private int noites;
    private int pessoas;
    private boolean cafeIncluso;

    public ReservaHotel reservar(String nome){
        ReservaHotel resv = new ReservaHotel();
        resv.nome = nome;
        resv.noites = 1;
        resv.pessoas = 1;
        resv.cafeIncluso = false;
        return resv;
    }

    public ReservaHotel reservar(String nome, int noites){
        ReservaHotel resv = new ReservaHotel();
        resv.nome = nome;
        resv.noites = noites;
        resv.pessoas = 1;
        resv.cafeIncluso = false;
        return resv;
    }

    public ReservaHotel reservar(String nome, int noites, int pessoas){
        ReservaHotel resv = new ReservaHotel();
        resv.nome = nome;
        resv.noites = noites;
        resv.pessoas = pessoas;
        resv.cafeIncluso = false;
        return resv;
    }

    public ReservaHotel reservar(String nome, int noites, int pessoas, boolean cafeIncluso){
        ReservaHotel resv = new ReservaHotel();
        resv.nome = nome;
        resv.noites = noites;
        resv.pessoas = pessoas;
        resv.cafeIncluso = cafeIncluso;
        return resv;
    }

    public void exibirReserva(ReservaHotel r){
        System.out.println("Nome: " + r.nome);
        System.out.println("Noites: " + r.noites);
        System.out.println("Pessoas: " + r.pessoas);
        if(r.cafeIncluso){
            System.out.println("Cafe incluso");
        } else {
            System.out.println("Cafe nao incluso\n");
        }
    }

    public void listar(ArrayList<ReservaHotel> lista){
        for(int i = 0; i < lista.size(); i++){
            this.exibirReserva(lista.get(i));
        }
    }

    public static void main(String[] args){
        ReservaHotel r = new ReservaHotel();
        ArrayList<ReservaHotel> historicoReservas = new ArrayList<ReservaHotel>();
        
        historicoReservas.add(r.reservar("Pablo"));
        historicoReservas.add(r.reservar("Carlos Ferreira", 3));
        historicoReservas.add(r.reservar("Maria Antonieta", 2, 2));
        historicoReservas.add(r.reservar("Fernando e Familia", 5, 8, true));

        r.listar(historicoReservas);
    }
}