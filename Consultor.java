package curso02_10_polimorfismo;

public class Consultor extends Funcionario{
	
	public Consultor(int id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
		
	}
	@Override
	public double calcularSalario(double valorTotal, double imposto) {
		return valorTotal - imposto;


}
}
