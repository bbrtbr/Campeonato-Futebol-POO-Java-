package TrabalhoPOO;


public class Clube {
	public String nome;
	public int pontos;
	public int saldoGols;
	
	
	public Clube(String nome) {
		this.setNome(nome);
		this.setPontos(0);
		this.setSaldoGols(0);
	}
	
	public void ganhar(int saldoGols) {
		this.saldoGols += saldoGols;
		this.pontos += 3;
	}
	public void empatar() {
		this.saldoGols += 0;
		this.pontos += 1;
	}
	public void perder(int saldoGols) {
		this.saldoGols += saldoGols;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setSaldoGols(int saldoGols) {
		this.saldoGols = saldoGols;
	}
	public int getSaldoGols() {
		return saldoGols;
	}
	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getPontos() {
		return pontos;
	}

}