/**
 * Subclasse que estende da Classe Compra,
 * que tem a quantidade de parcelas, juros mensal e
 * o valor com juros
 * @author adenilson
 *
 */
public class CompraParcelada extends Compra {
	
	private int numeroParcela;
	private double juroMensal;
	private double valorComJuro;
	private java.util.List<Double> parcelas;
	private double pagarParcela;

	public  CompraParcelada(double valor, double juro, int parcela ) {
		super.Compra(valor);
		this.numeroParcela = parcela;
		this.juroMensal = juro * 0.01;
	}
	
	public  double total() {
		valorComJuro = valorCompra * Math.pow(1+juroMensal, numeroParcela);
		// os valores são arrendodados
		return  Math.round(valorComJuro);
	}
	
	public void calculoNumeroDeParcela() {
		//parcelas sem juros
		double parcelaSemJuro;
		parcelaSemJuro = valorCompra/numeroParcela;
		pagarParcela = parcelaSemJuro;
		
		//parcelas com juros
		for(int i =0; i <= numeroParcela; i++) {
			pagarParcela *=  1 + juroMensal;
			parcelas.add(pagarParcela);
		}
	}
}
