import java.lang.Math;

public class Calcula{
	
	public Calcula(){}

	/*public Double calc(double n1, double n2, double nP, int op, int opP){
		//if()
	}*/

	public Double calcAux(double n1, double n2, int op){
		switch(op){
			case 1:
				return n1+n2;
			case 2:
				return n1-n2;
			case 3:
				return n1*n2;
			case 4:
				return n1/n2;
			case 5:
				double res = 1;
				for(long i = Math.round(n1); i > 0; i--){
					res = res*i;
				}
				return res;
			case 6:
				return Math.exp(n1);
			case 7:
				return Math.sqrt(n1);
			case 8:
				return Math.cbrt(n1);
			case 9:
				return (n1/100)*n2;
			case 10:
				return Math.pow(n1, 2);
			case 11:
				return Math.pow(n1, 3);
			case 12:
				return Math.pow(n1, n2);
			default:
				return 0.0;
		}
	}
}