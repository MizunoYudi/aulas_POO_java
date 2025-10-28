package reservaHotel;

public class Main {
	public static void main(String[] args) {
		ReservaHotel r1 = new ReservaHotel("Parla");
		ReservaHotel r2 = new ReservaHotel("Parle", 2);
		ReservaHotel r3 = new ReservaHotel("Parli", 1, 5);
		ReservaHotel r4 = new ReservaHotel("Parlo", 4, 2, true);
		
		System.out.println(r1.recibo());
		System.out.println(r2.recibo());
		System.out.println(r3.recibo());
		System.out.println(r4.recibo());
	}
}
