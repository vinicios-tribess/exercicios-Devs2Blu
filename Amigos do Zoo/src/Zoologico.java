
public class Zoologico {

	public static void main(String[] args) {
		
		Cadastro cad = new Cadastro();
		cad.setCodigoAnimal(2);
		cad.setApelido("Moana");
		cad.setEspecie("Hipopótamo");
		
		cad.listarAnimal();
		System.out.println(cad.getCodigoAnimal());
	}

}
