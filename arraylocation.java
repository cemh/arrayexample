package arrayexample;

public class arraylocation {

	private double coords[];
	
	public arraylocation(double[] coords){
		
		this.coords= coords;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] coords={5.0, 0.0};
		arraylocation accra= new arraylocation(coords);
		coords[0]=32.9;
		coords[1]=-117.2;
		
		System.out.println(accra.coords[0]);
		
		
		
	}

}
