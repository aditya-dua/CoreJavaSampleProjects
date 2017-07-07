package loops.demo;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Mutiplication Table 
		 * Break;;;
		 * */
		int num,p;
		num=8;
		/*for(int i=1;i<=20;i++,num++)
		{
				
				p=num*i;
				System.out.println(num +" X "+ i+" = "+p);

			
		}*/
		//1<20 | 1%2 it gives 1 = > 1 !=0 |||| i++ => 2
		// 2<20 || 2%2 ===0
		for(int a=1;a<20;a++){
			if(a%2==0) continue;
			System.out.println(a);
		}
	}

}
