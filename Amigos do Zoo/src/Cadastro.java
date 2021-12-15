import java.util.Date;

public class Cadastro {
	
	private int 	codigoAnimal;
	private char 	tipoAnimal; // M - Mam�fero, R- R�ptil
	private String	especie;
	private int 	idadeAnimal;
	private Date 	dataChegada = new Date();
	private Date 	dataLiberacao = new Date();
	private String	apelido;
	private char	sexo; // M - Macho, F - F�mea
	private String	padraoCorPelo; // Ex: pintado, tigre, listrado, branco, negra, parda, ...
	private boolean	filhote; // Se � beb� � verdadeiro, sen�o falso
	private int		qtdFilhotes; // Somente quando � f�mea

	public void listarAnimal() {
		System.out.println("C�digo : " + codigoAnimal +
						   "\nApelido: " + apelido + 
						   "\nEsp�cie: " + especie);
	}

	public int getCodigoAnimal() {
		return codigoAnimal;
	}

	public void setCodigoAnimal(int codigoAnimal) {
		this.codigoAnimal = codigoAnimal;
	}

	public char getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(char tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}

	public Date getDataLiberacao() {
		return dataLiberacao;
	}

	public void setDataLiberacao(Date dataLiberacao) {
		this.dataLiberacao = dataLiberacao;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getPadraoCorPelo() {
		return padraoCorPelo;
	}

	public void setPadraoCorPelo(String padraoCorPelo) {
		this.padraoCorPelo = padraoCorPelo;
	}

	public boolean isFilhote() {
		return filhote;
	}

	public void setFilhote(boolean filhote) {
		this.filhote = filhote;
	}

	public int getQtdFilhotes() {
		return qtdFilhotes;
	}

	public void setQtdFilhotes(int qtdFilhotes) {
		this.qtdFilhotes = qtdFilhotes;
	}
	
}
