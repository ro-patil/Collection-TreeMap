package TreeMap;

public class MyTreeMap 
{
	Node root;
	void add(int date,String day)
	{
		if(root==null)
			root=new Node(date, day);
		else
		{
			Node temp=root;
			while(true)
			{
				if(date==temp.date)
					break;
				else if(date<temp.date && temp.left!=null)
					temp=temp.left;
				else if(date<temp.date)
				{
					temp.left=new Node(date, day);
					break;
				}
				else if(date>temp.date && temp.right!=null)
					temp=temp.right;
				else
				{
					temp.right=new Node(date, day);
					break;
				}
			}
		}
	}
	void print()
	{
		if(root!=null)
			printTree(root);
	}
	private void printTree(Node node) 
	{
		if(node.left!=null)
			printTree(node.left);
		System.out.println(node.date+" "+node.day);
		if(node.right!=null)
			printTree(node.right);
	}
	String get(int date)
	{
		if(root==null)
			return "empty";
		else
		{
			Node temp=root;
			while(true)
			{
				if(date==temp.date)
					return temp.day;
				else if(date<temp.date && temp.left!=null)
					temp=temp.left;
				else if(date<temp.date)
					return "not found";
				else if(date>temp.date && temp.right!=null)
					temp=temp.right;
				else
					return "not found";
			}
		}
	}
	
}
