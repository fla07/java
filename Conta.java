

public class Conta {


	private int nro;
	private Titular titular = new Titular ();
	private double saldo;
	private double limite = 100.00;


	public static void main(String[] args) {
		

	}
	
	

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public Titular getTitular() {
		
		return titular;
	}

	public void setTitular(Titular titular ) {
		
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	// Metodos
	
	public void deposito(double dimdim){
		saldo+=dimdim;
	}
	
	public boolean retirada(double dimdim){
		boolean status=false;
		if(dimdim<= (saldo+limite))	{
			saldo-=dimdim;
			status=true;
		}
		return status;
	}

	public boolean transferencia(double dimdim, Conta xpto){
		boolean status=false;
		if(retirada(dimdim)){
			xpto.deposito(dimdim);
			status=true;
		}
		return status;
	}






	

}
