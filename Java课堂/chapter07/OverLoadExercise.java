
public class OverLoadExercise{
	public static void main(String[] args){

		Methods M = new Methods();
		System.out.print(M.m(7) + " ");
		System.out.print(M.m(7,8) + " ");
		M.m("askdm" + " ");

		System.out.print(M.max(3,4) + " ");
		System.out.print(M.max(3.4,49.8) + " ");
		System.out.print(M.max(3.4,49.8,45.0) + " ");
	}
}

class Methods{
	public int m(int n){
		return n*n;
	}
	public int m(int n,int m){
		return n*m;
	}
	public void m(String s){
		System.out.print(s);
	}

	public int max(int n,int m){
		// if(n > m){
		// 	return n;
		// } else {
		// 	return m;
		// }
		return n > m ? n : m;
	}
	public double max(double n,double m){
		// if(n > m){
		// 	return n;
		// } else {
		// 	return m;
		// }
		return n > m ? n : m;
	}
	public double max(double n,double m,double k){
		// double temp;
		// if(n > m){
		// 	temp = n;
		// } else {
		// 	temp = m;
		// }
		// if(temp > k){
		// 	return temp;
		// } else {
		// 	return k;
		// }
		System.out.println("double n,double m,double k");
		double max1 = n > m ? n : m;
		return max1 > m ? max1 : m; 
	}
		public double max(double n,double m,int k){
		double max1 = n > m ? n : m;
		return max1 > m ? max1 : m; 
	}
}