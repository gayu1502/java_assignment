package assignment8;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class StackUsingLinkedList <T>{
	
	public StackUsingLinkedList()
	{
		top=null;
	}
	private static class Element<T>{
		private T data;
		private Element<T> next;
		Element(T data,Element<T> next)
		{
			this.data=data;
			this.next=next;
		}
	}
	private Element<T> top;
	public void push(T v)
	{
		if(v==null)
		{
			throw new NullPointerException();
		}
		top=new Element<T>(v, top);
	}
	
	public T pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		T data=top.data;
		top=top.next;
		return data;
	}
	
	public T peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		T data=top.data;
		return data;
	}
	
	public boolean isEmpty()
	{
		return(top==null);
	}
	
		public static void main(String[] args) {
		
			StackUsingLinkedList st=new StackUsingLinkedList<>();
			System.out.println("check stack is empty: "+st.isEmpty());
			st.push(1);
			st.push(2);
			st.push(3);
			st.push(4);
			st.push(5);
			System.out.println("check stack is empty: "+st.isEmpty());
			System.out.println("peek: "+st.peek());
			
			while(!st.isEmpty())
			{
			System.out.println(st.pop());
			}	
			
			
	}
}

