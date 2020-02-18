package calculator;

public class ForLoopForArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numarray[] = {2,4,7,9,10,20,30,40};
			
			//System.out.println(numarray.length);
			
			for(int i = 0; i < numarray.length ; i++){
				System.out.println(numarray[i]);
			}
			System.out.println("Enhanced For Loop >>>>>>>>>>>>>>>>>>>>>");
			
			for(int i : numarray){
				i=i*10;
				System.out.println(i);
			}
			
	}

}
