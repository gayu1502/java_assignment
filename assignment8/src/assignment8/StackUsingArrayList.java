package assignment8;

import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList<T> {
	
	@Override
	public String toString() {
		return "StackUsingArrayList [stack=" + stack + "]";
	}
	private int size;
	private List<T> stack=new ArrayList<>();
	
	
	public boolean isEmpty()
	{
		return stack.isEmpty();
	}
	
	
	public T push(T data)
	{
		stack.add(data);
		size++;
		return data;
		
	}
	
	public int size()
	{
		return stack.size();
	}
	
	public T pop()
	{
		if(stack.isEmpty())
		{
			return null;
		}
		T top=stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return top;
		
	}
	
	public T peek()
	{
		if(stack.isEmpty())
		{
			return null;
		}
		return stack.get(stack.size()-1);
	}

	public static void main(String[] args) {

		StackUsingArrayList st=new StackUsingArrayList<>();
		System.out.println("check stack is empty: "+st.isEmpty());
		st.push("gayu");
		st.push("rohit");
		st.push("nisha");
		st.push("bhavesh");
		System.out.println("check stack is empty: "+st.isEmpty());
		System.out.println(st);
		System.out.println("stack size: "+st.size());
		System.out.println("peek: "+st.peek());
		System.out.println("after peek"+st);
		System.out.println("pop: "+st.pop());
		System.out.println("after pop: "+st);
		System.out.println("size: "+st.size());
	}

}
