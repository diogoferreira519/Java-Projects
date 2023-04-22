package cursoguanabara;

public class progESTOQUE {
	private int codproduto;
	private String alm;
	private double estmin;
	private String descr;
	private double saldo;
	private double saldoEst;
	private double qtd;
	private String tipoEstoque;
	private double customedio = saldo/saldoEst;
	
	public int getProduto() {
		return codproduto;
	}
	public void setProduto(int produto) {
		this.codproduto = produto;
	}
	public String getAlm() {
		return alm;
	}
	public void setAlm(String alm) {
		this.alm = alm;
	}
	public double getEstmin() {
		return estmin;
	}
	public void setEstmin(double estmin) {
		this.estmin = estmin;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public void entrada(double numero) {
		if (tipoEstoque =="ESTOQUE TOTAL") {
			saldoEst +=numero;
			saldo = saldo + (numero*customedio);
		}else if(tipoEstoque =="ESTOQUE FISÍCO") {
			saldoEst +=numero;
		}else
			saldo +=numero;
	}
	public void saida(double numero) {
		if (tipoEstoque =="ESTOQUE TOTAL") {
			saldoEst -=numero;
			saldo = saldo - (numero*customedio);
		}else if(tipoEstoque =="ESTOQUE FISÍCO") {
			saldoEst -=numero;
		}else
			saldo -=numero;
	}
	public void Retornasit() {
		System.out.println("PRODUTO: " + codproduto + " DESCRIÇÃO:" + descr);
		System.out.println("ALMOXARIFADO: " + alm);
		if (tipoEstoque=="DÉBITO DIRETO"){
			System.out.println("DÉBITO DIRETO NÃO TEM ESTOQUE");
			System.out.println("SALDO:" + saldo);
		}else 
			System.out.println("QUANTIDADE NO ESTOQUE : " + saldoEst + " SALDO: " +saldo);
			System.out.println("estoque MINIMO: " + estmin);
			System.out.println("CUSTO MÉDIO: R$" + customedio);
	}

	
}
