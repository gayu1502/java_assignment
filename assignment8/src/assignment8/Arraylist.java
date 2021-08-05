package assignment8;

public class Arraylist {
	
	private int array[];
	private int count;
	private int size;
	

	public Arraylist() {
	
		array = new int[1];
	    count = 0;
		size=1;
	}
	
	public void add(int data)
	{
		if(count==size)
		{
			growSize();
		}
		array[count]=data;
		count++;
	}

	public void growSize()
	{
		int temp[]=null;
		if(count==size)
		{
			temp=new int[size * 2];
					{
						for(int i=0;i<size;i++)
						{
							temp[i]=array[i];
						}
					}
		       }
		
		array=temp;
		size=size * 2;
	}
	
	public void shrinkSize()
	{
		int temp[]=null;
		if(count>0)
		{
			temp=new int[count];
			for(int i=0;i<count;i++)
			{
				temp[i]=array[i];
			}
			size=count;
			array=temp;
		}
	}
	
	public void addAt(int index,int data)
	{
		if(count==size)
		{
			growSize();
		}
		for(int i=count-1;i>=index;i--)
		{
			array[i+1]=array[i];
		}
		array[index]=data;
		count++;
	}
	
	public void remove()
	{
		if(count>0)
		{
			array[count-1]=0;
			count--;
		}
	}
	
	public void removeAt(int index)
	{
		if(count>0)
		{
			for(int i=index;i<count-1;i++)
			{
				array[i]=array[i+1];
			}
			array[count-1]=0;
			count--;
		}
	}
	public static void main(String[] args) {
		Arraylist da=new Arraylist();
		
		da.add(1);
		da.add(2);
		da.add(3);
		da.add(4);
		da.add(5);
		da.add(6);
		da.add(7);
		da.add(8);
		da.add(9);
		
		System.out.println("elements of array: ");
		for(int i=0;i<da.size;i++) {
			System.out.println(da.array[i]+" ");
		}
		System.out.println();
		
		System.out.println("size of array: " + da.size);
		System.out.println("No of elements in array : "+ da.count);
		
		da.shrinkSize();
		
		System.out.println("elements of array: "+"after shrinkSize of array");
		for(int i=0;i<da.size;i++) {
			System.out.println(da.array[i]+" ");
		}
		System.out.println();
		
		System.out.println("size of array: " + da.size);
		System.out.println("No of elements in array : "+ da.count);
	
		da.addAt(1, 22);
		
		System.out.println("elements of array: "+"after add at index 1 of array");
		for(int i=0;i<da.size;i++) {
			System.out.println(da.array[i]+" ");
		}
		System.out.println();
		
		System.out.println("size of array: " + da.size);
		System.out.println("No of elements in array : "+ da.count);
	
		da.remove();
		
		System.out.println("elements of array: "+"after delete of last element of array");
		for(int i=0;i<da.size;i++) {
			System.out.println(da.array[i]+" ");
		}
		System.out.println();
		
		System.out.println("size of array: " + da.size);
		System.out.println("No of elements in array : "+ da.count);
	
		da.removeAt(1);
		
		System.out.println("elements of array: "+"after delete element at index 1 of array");
		for(int i=0;i<da.size;i++) {
			System.out.println(da.array[i]+" ");
		}
		System.out.println();
		
		System.out.println("size of array: " + da.size);
		System.out.println("No of elements in array : "+ da.count);
	
	}
	
	
	
}	
	
	
	


