package VeiculoConstrutor;

public class Automovel {

	private int 	velocidade;
	private float 	litragem;
	private String 	frenagem;
	private String 	tipoCombustivel;
	
	public Automovel(int velocidade, float litragem, String frenagem, String tipoCombustivel) {
		super();
		this.velocidade = velocidade;
		this.litragem = litragem;
		this.frenagem = frenagem;
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public void listarDados() {
		System.out.print("Velocidade......: " + this.velocidade + " Km/h" + "\n" +
				           "Litragem........: " + this.litragem + " l/s" + "\n" +
				           "Frenagem........: " + this.frenagem + "\n" +
				           "Tipo Combustível: " + this.tipoCombustivel + "\n");
	}
	
	public float ajustarVelocidade() {
		float velocidadeAjustada = this.velocidade * 1.10f;
		return velocidadeAjustada;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public float getLitragem() {
		return litragem;
	}
	
	public void setLitragem(float litragem) {
		this.litragem = litragem;
	}
	
	public String getFrenagem() {
		return frenagem;
	}
	
	public void setFrenagem(String frenagem) {
		this.frenagem = frenagem;
	}
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
	
}