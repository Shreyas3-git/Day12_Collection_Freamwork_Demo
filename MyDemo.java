import java.util.*;



public class MyDemo 
{

	public static void main(String[] args) 
	{
	//	doList();
	//	doStack();
	//	doQueue();
		doMap();
	}

	private static void doList()
	{
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();
		ArrayList<Integer>l3 = new ArrayList<Integer>();
		l1.add("Mon");
		l1.add("Tue");
		l1.add("Wed");
		l1.add("Thu");
		l1.add("May");
		l1.add("Friday");
		l1.add("Sat");
		l1.add("Sun");
		l1.remove("May");
		
		l2.addAll(l1);
		
		System.out.println("Elements in first arrayList:");
		for (int i = 0; i < l1.size(); i++) 
		{
			System.out.println(l1.get(i));
		}
		
		System.out.println("Elements in second ArrayList:");
		for (int i = 0; i < l2.size(); i++) 
		{
			System.out.println(l2.get(i));
		}
		
		System.out.println("Display element in Integer type list:");
		l3.add(1);
		l3.add(2);
		l3.add(3);
		
		for (int i = 0; i < l3.size(); i++) 
		{
			System.out.println(l3.get(i));
		}
		
	}
	
	public static void doStack()
	{
		Stack<String> s1 = new Stack<String>();
		
		s1.add("Orange");
		s1.add("Mango");
		s1.add("Banaana");
		s1.add("Grapes");
		s1.add("Watermelon");
		
		System.out.println("element to be pop in stack:"+s1.pop());
		System.out.println(s1);
	}
	
	public static void doQueue()
	{
		PriorityQueue<String> element = new PriorityQueue<String>();
		PriorityQueue<Integer>num = new PriorityQueue<Integer>();
		element.add("Pirates Of Caribean");
		element.add("Forest Gump");
		element.add("Social Network");
		element.add("Theory Of Everything");
		element.add("The Imitation Game");
		element.add("Dead Pool");
		element.add("Iron Man");
		
		System.out.println(element.remove("Dead Pool"));
		System.out.println("Head or Rare:"+element.peek());
		System.out.println("Elements in Priority Queue:\n"+element);
	
		num.add(7);
		num.add(4);
		num.add(200);
		num.add(2);
		num.add(19);
		System.out.println("Head:"+num.peek());
		System.out.println(num.remove());
		System.out.println("Elements in priority queue:"+num);
	}
	
	public static void doMap()
	{
		HashMap<Integer,String> info = new HashMap<>();
		
		info.put(1,"Apple");
		info.put(2,"Samsung");
		info.put(3,"Nokia");
		info.put(4,"Motorolla");
		info.put(5,"Mi");
		info.put(6,"Micromax");
		info.put(7,"Apple");
		
		for( Map.Entry m : info.entrySet() )
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}
}
