// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	int N = Integer.parseInt(args[0]);
	int GraterThenHalf= 0;
	int SmallOrEquleHalf= 0;

	for (int i = 0; i < N; i++){
	double randomN = Math.random();
	if (randomN > 0.5){
	GraterThenHalf++;	
	}else {
	SmallOrEquleHalf++;	
	}
	}	
	System.out.println( "> 0.5: " + GraterThenHalf + " times");	
	System.out.println( "<= 0.5: " + SmallOrEquleHalf + " times");

if ( SmallOrEquleHalf !=0){
	double ratio = (double) GraterThenHalf / SmallOrEquleHalf;
	System.out.println( "Ratio: " + ratio);
}

	}

}
