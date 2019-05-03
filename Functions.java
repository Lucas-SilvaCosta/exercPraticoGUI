import java.lang.Math;

public class Functions{
	
	public Functions(){}

	public int fat(int n){
		int res = 1;
		for(int i = n; i > 0; i--){
			res = res*i;
		}
		return res;
	}

	public double nep(double n){
		return Math.exp(n);
	}

	public double raiz2(double n){
		return Math.sqrt(n);
	}
}