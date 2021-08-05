package assignment8;

public class StackUsingArray {
	private int top;
	private int size;
	private int[] stack;
	
	public StackUsingArray()
	{
		top=-1;
		size=10;
		stack=new int[size];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top==size-1;
	}
	
	public int push(int data)
	{
		if(isFull())
		{
			System.out.println("stack is full");
		}
		return stack[++top]=data;
		
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
		}
		return stack[top--];
	}
	
	public int peek()
	{
		return stack[top];
	}
	
	public void display()
	{
		for(int i:stack)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		StackUsingArray st=new StackUsingArray();
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.display();
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
		System.out.println(st.size);
		System.out.println(st.peek());
		System.out.println(st.pop());
		
		
	}

}
