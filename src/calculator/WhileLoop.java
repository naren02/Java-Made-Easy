package calculator;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileLoop sai = new WhileLoop();
		sai.whileLoopExpl(5);
	}
	
	public void whileLoopExpl(int i){
		while(i>0){
			System.out.println(i);
			i--;
		}
	}

}
