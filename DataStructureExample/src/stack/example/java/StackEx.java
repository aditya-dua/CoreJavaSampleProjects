package stack.example.java;

public class StackEx {
	
	private Node top=null;
	private int length=0;
	
	/**
	 * Method : PUSH(int data)
	 * @param args
	 */
	
	public void push(int item){
		Node node=new Node(item);
		if(top== null){
			top=node;
		}else{
			node.next=top;
			top=node;
		}
		length++;
	}

	public int pop(){
		int result = -1;
		if(top!=null){
			result=top.data;
			top=top.next;
			length--;
		}
		return result;
	}
	
	public int peek(){
		
		if(top==null){
			return -1;
		}else{
			return top.data;
		}
	}
	
	/** Print all the elements of this Stack using toString() method**/
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		Node temp=null;
		result.append("[");
		if(top!=null){
			for(temp=top;temp !=null;temp=temp.next){
				result.append(temp.data+" ");
			}
		}
		result.append("]");
		return result.toString();
	}
	
	public int size(){
		return length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackEx stack=new StackEx();
		System.out.println("Current Length Is ::"+stack.size());
		stack.push(3);
		stack.push(6);
		stack.push(2);
		stack.push(8);
		System.out.println(stack);// this will call the toString() method
		System.out.println("Peek :: "+stack.peek());
		System.out.println("POP ::"+stack.pop());
		System.out.println("Current Length Is ::"+stack.size());
		System.out.println(stack);
	}
	
	

	private class Node{
		private Node next=null;
		private int data = 0;
		
		private Node(int value){
			this.data=value;
		}
	}

}
