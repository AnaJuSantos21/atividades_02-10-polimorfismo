package curso02_10_polimorfismo;

public class Principal_Saude {

	public static void main(String[] args) {
		
		ProfissionalSaude profissional = new ProfissionalSaude("Monica", "Dermatologista", 160);
		System.out.println("*****Profissional da Saúde*****");
		System.out.println("Nome: " + profissional.getNome());
		System.out.println("Especialidade: " + profissional.getEspecialidade());
		System.out.println("Valor Consulta: " + profissional.getValorConsulta());
		profissional.agendarConsulta();
		System.out.println( );
		

		System.out.println("*****Médico*****");
		Medico medico = new Medico("Rafael", "Cardiologista", 230, "2");
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Especialidade: " + medico.getEspecialidade());
		System.out.println("Valor Consulta: " + medico.getValorConsulta());
		System.out.println("crm: " + medico.getCrm());
		medico.agendarConsulta();
		System.out.println( );
		
		Dentista dentista = new Dentista("Jessica", "Dentista", 98, "3");
		System.out.println("*****Dentista*****");
		System.out.println("Nome: " + dentista.getNome());
		System.out.println("Especialidade: " + dentista.getEspecialidade());
		System.out.println("Valor Consulta: " + dentista.getValorConsulta());
		System.out.println("cro: " + dentista.getCro());
		dentista.agendarConsulta();
		System.out.println( );
				
		Fisioterapeuta fisio = new Fisioterapeuta("Roberto", "Fisioterapeuta", 250, "4");
		System.out.println("*****Fisioterapeuta*****");
		System.out.println("Nome: " + fisio.getNome());
		System.out.println("Especialidade: " + fisio.getEspecialidade());
		System.out.println("Valor Consulta: " + fisio.getValorConsulta());
		System.out.println("crefito: " + fisio.getCrefito());
		fisio.agendarConsulta();
		System.out.println( );
		
	
	}


	}


