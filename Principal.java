package curso02_10_polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Thor", "Masculino", "Qualquer");
		System.out.println("*****Lobo*****");
		lobo.emitirSom();
		lobo.caminhar();
		System.out.println("Nome: " + lobo.getNome());
		System.out.println("Sexo: " + lobo.getSexo());
		System.out.println("Raça: " + lobo.getRaca());
		
		
		Leao leao = new Leao("Cacau", "Masculino", "Qualquer");
		System.out.println("*****Leão*****");
		leao.emitirSom();
		leao.correr();
		System.out.println("Nome: " + leao.getNome());
		System.out.println("Sexo: " + leao.getSexo());
		System.out.println("Raça: " + leao.getRaca());
		
		Tigre tigre = new Tigre("Theo", "Masculino", "Qualquer");
		System.out.println("*****Tigre*****");
		tigre.emitirSom();
		tigre.dormir();
		System.out.println("Nome: " + tigre.getNome());
		System.out.println("Sexo: " + tigre.getSexo());
		System.out.println("Raça: " + tigre.getRaca());
		
		Cachorro cachorro = new Cachorro("Belinha", "Feminino", "Shitzu");
		System.out.println("*****Cachorro*****");
		cachorro.emitirSom();
		cachorro.correr();
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Sexo: " + cachorro.getSexo());
		System.out.println("Raça: " + cachorro.getRaca());
		
		Gato gato = new Gato("Perola", "Feminino", "Qualquer");
		System.out.println("*****Gato*****");
		gato.emitirSom();
		gato.caminhar();
		System.out.println("Nome: " + gato.getNome());
		System.out.println("Sexo: " + gato.getSexo());
		System.out.println("Raça: " + gato.getRaca());

	}

}
