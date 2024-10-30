package logica;

public class Parcial {

	
		
	public double Cuadratica(int a, int b, int c, int x) throws Exception {
		
		if (x != 0) {
			return (a*x^2 + b*x +c);
		}else {
			throw new Exception("No cumple como cuadrática");
		}
		
	}
	
	public double divisibilidad(int k, int m, int c) throws Exception{
		
		if (m != 0) {
			return c = k/m;
		}else {
			throw new Exception("No es divisible");
		}
		
		
		
	}
	// Con esto lo que quiero hacer es comprobar si el c es divisible para poder factorizarlo
	private boolean divivisibilidad1(int c) {
		
		
		if (k * m == c) {
			return True;
		}else {
			return False;
		}
	
	
}
	
	
		
			
		
	public double esFactorizable1(int a, int b, int c, int k, int m) {
		int x ;
		
		boolean True;
		if (Math.sqrt(a) > 0 && divivisibilidad1(c) == True) {
			
			double parentesis1 = (Math.sqrt(a) +  k);
			double parentesis2 = (Math.sqrt(a) + m);
			
			double factorizado = (parentesis1 * parentesis2);
			double respuesta1 = (x = Math.sqrt(a)/ k);
			double respuesta2 = (x = Math.sqrt(a)/ m);
			
			
		}
		return (respuesta1, respuesta2);
	}

	
	public double esFactorizable2(int a, int b, int c) {
		
	}
		
			
		
	}
	}	
		
			
			
	
		
	
		
		
		
		
		
		
		
	}
		
			

	

}