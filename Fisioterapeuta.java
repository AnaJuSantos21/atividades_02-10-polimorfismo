package curso02_10_polimorfismo;

public class Fisioterapeuta extends ProfissionalSaude{
	
    private String crefito;
	
	public Fisioterapeuta(String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome, especialidade, valorConsulta);
		this.crefito = crefito;
		
	}
	
	@Override
	public void agendarConsulta() {
		System.out.println("Agendando consulta no fisioterapeuta");
	}
	
	public String getCrefito() {
		   return crefito;
	}
	     public void setCrefito(String crefito) {
		   this.crefito= crefito;
		   
	     }

}
