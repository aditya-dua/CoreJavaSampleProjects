package loops.demo;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi I am aditya dua");
		/** 
		 * For first 100 even numbers
		 */
		
		int num=2;//first even number : 2
		int i=0;
		/**while(i<100){
			System.out.println(num);
			num=num+2;// after first even next even always comes at +2...2...4
			i++;
			}**/
		do{
			System.out.println(num);
			num=num+2;
			i++;
		}while(i<100);
		
		
	}

}
