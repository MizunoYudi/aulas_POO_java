package reservaHotel;

public class ReservaHotel {
	private String nome;
	private int noites;
	private int pessoas;
	private boolean cafeIncluso;
	
	public ReservaHotel(String nome) {
		this.setNome(nome);
		setNoites(1);
		setPessoas(1);
		setCafeIncluso(false);
	}
	
	public ReservaHotel(String nome, int noites) {
		this.setNome(nome);
		this.setNoites(noites);
		setPessoas(1);
		setCafeIncluso(false);
	}
	
	public ReservaHotel(String nome, int noites, int pessoas) {
		this.setNome(nome);
		this.setNoites(noites);
		this.setPessoas(pessoas);
		setCafeIncluso(false);
	}
	
	public ReservaHotel(String nome, int noites, int pessoas, boolean cafeIncluso) {
		this.setNome(nome);
		this.setNoites(noites);
		this.setPessoas(pessoas);
		this.setCafeIncluso(cafeIncluso);
	}
	
	private String cafeEIncluso() {
		if(cafeIncluso) {
			return "Incluso";
		}
		return "Nao incluso";
	}
	
	public String recibo() {
		return String.format("Reserva: \nNome: %s\nNoites: %d\nPessoas: %d\nCafe Incluso: %s", nome, noites, pessoas, cafeEIncluso());
	}

	public int getNoites() {
		return noites;
	}

	public void setNoites(int noites) {
		this.noites = noites;
	}

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}

	public boolean isCafeIncluso() {
		return cafeIncluso;
	}

	public void setCafeIncluso(boolean cafeIncluso) {
		this.cafeIncluso = cafeIncluso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}