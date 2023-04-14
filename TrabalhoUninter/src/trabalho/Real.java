package trabalho;

public class Real extends Moeda {
	
	public Real (double valor){
		super(valor);
	}
	public void info(){
		super.info();
	}
	@Override
	double converter() {
		 return super.valor;
	}
	@Override
	public String toString() {
		return "Real - " + valor;
	}

}
