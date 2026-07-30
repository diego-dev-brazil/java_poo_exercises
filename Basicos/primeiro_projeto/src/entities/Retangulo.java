package entities;

public class Retangulo {
	public double base;
	public double altura;
	
	public double area() {
		return base * altura;
	}
	
	public double perimetro() {
		return (base+altura) * 2;
	}
	 public double diagonal() {
		 return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
	 }
	 
	 public String toString () {
		 return "Área: " + area() + "\nPerímetro: " + perimetro() + "\nDiagonal: " + diagonal();
	 }
}
