package trabalho;

public class Euro extends Moeda {
	
	public Euro (double valor){
		super(valor);
	}
	public void info(){
		super.info();
	}
	@Override
	double converter() {
		 return super.valor = valor * 5;
	}
	@Override
	public String toString() {
		return "Euro - "  + valor;
	}

}
