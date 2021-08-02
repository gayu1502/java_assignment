package assignment6;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RemoveOddEvenNo {
	
	

	public static void main(String[] args) {

		List<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		System.out.println(num);
		
		for(int i=0;i<num.size();i++)
		{
			if(num.get(i)%2!=0)
			{
				num.remove(i);
			}
		}
		System.out.println(num);
		

}
}