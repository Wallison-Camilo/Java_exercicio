package trabalho;

public class Dolar extends Moeda {

	public Dolar (double valor){
		super(valor);
	}
	public void info(){
		super.info();
	}
	@Override
	double converter() {
		 return super.valor * 4;
	}
	@Override
	public String toString() {
		return "Dolar - " + valor;
	}


}
