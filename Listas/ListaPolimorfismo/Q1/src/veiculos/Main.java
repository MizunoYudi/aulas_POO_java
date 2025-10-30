package veiculos;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<VeiculoTransporte> frota = new ArrayList<>();
		
		frota.add(new Onibus("Onibus 123", 50));
		
		frota.get(0).mostrarInfo();
	}
}
