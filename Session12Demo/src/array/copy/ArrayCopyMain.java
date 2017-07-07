package array.copy;

public class ArrayCopyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** SHallow COpy & True Copy **/
		// So when we copy the refernece , rather than copying the entire Array ...
		// that is known as Shallow copy.
		
		// num2=num; => Refernce : Memory location....
		int [] num={1,2,3,4,5};
		// Shallow copy & Actual Copy...
		// When we pass the refernce and create anew array.
		
		
		int [] num2;
		// Shallow copy means , when we copy the refence and both values point to the same reference.
		
		num2=num;
		
		System.out.println(num);
		System.out.println(num2);
		// True Copy: When we copy the exact values rather than merely copying 
				//the reference.
		int [] num3 = new int[num.length];
		for(int i=0;i<num.length;i++){
			num3[i]=num[i];
		}
		
		System.out.println(num3);
		
		for(int i=0;i<num.length;i++){
			System.out.print("num "+num[i]);
			System.out.print("num2 "+num2[i]);
			System.out.println("num3 "+num3[i]);
		}
	}

}
