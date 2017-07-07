package abstractclass.demo;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum s= new Sum();
		int a=s.calculate();
		s.display(a);
		
		
		Multiplication m=new Multiplication();
		a=m.calculate();
		s.display(a);
		
	}

}
/** Mobile **/
