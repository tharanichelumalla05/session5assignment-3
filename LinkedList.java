/*program for implementing linkedlist without using collections*/

package linked;// here I have created a package as linked

public class LinkedList{
	//declares a class called Linkedlist
		//classes are the basics of opps(object oriented programming)
public static void main(String []args){
	//TODO Auto-generated method stub
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
			int[] data = { 12,15,24,56,67,89};//creating an array of size and we are initializing them

			Object[][] linkedList = new Object[1][2];//we created an object for class 

			createLinkedList(data,linkedList);//creating a linked list and printing the linked list
		printLinkedList(linkedList);
		 
		}
		 
		public static void createLinkedList(int []data,Object[][] linkedList)//creating linkedlist
		{

			Object node[][] = null;//taking the object node has null
		
			Object newnode[][] = null;//here taking new node also has null
		node=new Object[1][2];//creating a node with new object and initializing an array
		linkedList[0][1]=node;//now we are assigning the nodes in linked list with size of an array
		
		for(int i=0;i<data.length;i++)//by using for loop we are implementing linked list
		{
		node[0][0]=new Integer(data[i]);//creating an object by this if the one head which points to the 
		newnode=new Object[1][2];//first node of the list
		node[0][1]=newnode;
		node=newnode;//node equal to newnode
		 
		}
		node =null;//node equals to null
		newnode = null;//newnode equals to null
		    }
		 
		 
		public static void printLinkedList(Object[][] linkedList)
		{
		 
		Object node[][] = null;
		node=linkedList;//we first insert the node  then insert the last node in linked list
		node =(Object [][]) node[0][1];
		
		while(node[0][1]!= null)//we are using while loop that is node not equal to the null
		{
		System.out.print("  "+node[0][0]+" --->" );
		//System is used to return code
	   //print is used to print the output on same line
		//then it prints this
		node=(Object [][]) node[0][1];//same here it is as well by placing a new node
		 
		}
		System.out.print("null" );
		//System is used to return code
		//out is static number
		//print is used to print the output on same line
		//in last it prints null that the node is empty or null
		 
		}
	}



