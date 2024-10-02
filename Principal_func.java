package curso02_10_polimorfismo;

public class Principal_func {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario(1, "Marcela", "15 998734526", 123, "Vila Rio Branco");
		System.out.println("*****Funcionario*****");
		System.out.println("Id: " + funcionario.getId());
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Telefone: " + funcionario.getTelefone());
		System.out.println("Matricula: " + funcionario.getMatricula());
		System.out.println("Endereço: " + funcionario.getEndereco());
		System.out.println(funcionario.calcularSalario(2050, 150));
		System.out.println( );
		
		System.out.println("*****Horarista*****");
		Horista hora = new Horista(2, "Carol", "15 23988743", 124, "Vila Serafim");
		System.out.println("Id: " + hora.getId());
		System.out.println("Nome: " + hora.getNome());
		System.out.println("Telefone: " + hora.getTelefone());
		System.out.println("Matricula: " + hora.getMatricula());
		System.out.println("Endereço: " + hora.getEndereco());
		System.out.println(hora.calcularSalario(27, 200));
		System.out.println( );
		
		Jornada jornada = new Jornada(3, "Marcia", "15 9918437166", 125, "Vila Shancrila");
		System.out.println("****Jornada*****");
		System.out.println("Id: " + jornada.getId());
		System.out.println("Nome: " + jornada.getNome());
		System.out.println("Telefone: " + jornada.getTelefone());
		System.out.println("Matricula: " + jornada.getMatricula());
		System.out.println("Endereço: " + jornada.getEndereco());
		System.out.println(jornada.calcularSalario(1900, 100));
		System.out.println( );
		
		Consultor consultor = new Consultor(4, "Jonas", "99 19872355", 126, "Vila Regina");
		System.out.println("*****Consultor*****");
		System.out.println("Id: " + consultor.getId());
		System.out.println("Nome: " + consultor.getNome());
		System.out.println("Telefone: " + consultor.getTelefone());
		System.out.println("Matricula: " + consultor.getMatricula());
		System.out.println("Endereço: " + consultor.getEndereco());
		System.out.println(consultor.calcularSalario(3000, 300));
		
	
		

	}

}
