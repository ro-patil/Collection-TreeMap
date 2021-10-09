package TreeMap;

public class MyClass {

	public static void main(String[] args) 
	{
		MyTreeMap t=new MyTreeMap();
		t.add(15, "a");
		t.add(8, "b");
		t.add(24, "c");
		t.add(4, "d");
		t.add(12, "e");
		t.add(22, "f");
		t.add(40, "g");
		t.add(7, "h");
		t.print();
		System.out.println(t.get(12));
		
	}

}
