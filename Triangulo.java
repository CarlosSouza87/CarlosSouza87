package geometricos;

public class Triangulo {

		public double a;
		public double b;
		public double c;
		
		//Metodo - uma fun��o que ser� utilizada na aplica��o principal.
		
		public double area() {
			double p = (a + b + c) / 2.0;
			return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
