package trabalho;

public abstract class Moeda {
	double valor;
	
	public Moeda (double valor) {
		super();
		this.valor = valor;
	}
	public void info() {
		System.out.println("Valor:"+ valor);
	}
	abstract double converter();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	
}
