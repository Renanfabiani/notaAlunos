package entities;

public class notas {

	public String nome;
	public double a;
	public double b;
	public double c;
	
	public double totalNota() {
		return (a+b+c);}

	public double resultado() {
		if (totalNota ()<60.0) {
			return 60.0 - totalNota();
		}
		else {
			return 0.0;
		}
	}
}
		
	