import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
	String nodeName;
	String nodeMobNo;
	Node next;
	
	Node(String name, String MobNo)
	{
		nodeName = name;
		nodeMobNo = MobNo;
		next = null;
	}
	
	
}



class ContactManager
{
	Node head;
	
	void addContact(String Name, String MobNo)
	{
		Node newNode = new Node(Name, MobNo);
		if(head == null)
		{
		 head = newNode;
		 return;
		}
		Node trav = head;
		while(trav.next != null)
		{
			trav = trav.next;
		}
		trav.next = newNode;
	}

	void removeContact(String rname)
	{
		
		
		if(head == null)
		{
			System.out.println("Contact List Is Empty");
		 return;
		}
		
		if(head.nodeName.equalsIgnoreCase(rname))
		{
			head = head.next;
			return;
		}
		
	
		Node trav = head;
		Node prev = null;
		while(trav.next!=null && !trav.nodeName.equalsIgnoreCase(rname))
		{
			
			prev = trav;
			trav= trav.next;
			
		}
		if(trav == null)
		{
			System.out.println("Contact not found");
		}
		prev.next = trav.next;
		
		System.out.println("Contact Deleted Succesfully");
	}

	void searchContact(String sname)
	{
	
		if(head == null)
		{
			System.out.println("Contact List Is Empty");
		 return;
		}
		
		if(head.nodeName.equalsIgnoreCase(sname))
		{
			System.out.println(head.nodeName + "'s Contact Found ");
			return;
		}
		
	
		Node trav = head;
		
		while(trav.next!=null && !trav.nodeName.equalsIgnoreCase(sname))
		{
			
			
			trav= trav.next;
			
		}
		
		if(trav == null)
		{
			System.out.println("Contact not found");
		}
		System.out.println(trav.nodeName + "'s Contact Found ");
		
		
	}

	void displayContacts()
	{
		
		
		if(head == null)
		{
			System.out.println("Contact List Is Empty");
			return;
		}
		Node trav = head;
		System.out.println("Contact List");
		while(trav!=null)
		{
			System.out.println("Name: "+trav.nodeName+ " Number: "+ trav.nodeMobNo);
			trav = trav.next;
		}
	}
	
	int ch;
	public static void main(String args[])
	{
		ContactManager c1 = new ContactManager();

		
		
		Scanner scn = new Scanner(System.in);
		
		
		
		

			do
			{
				
				System.out.println("---------------------------");
				System.out.println("1. Add Contact");
				System.out.println("2. Display Contacts");
				System.out.println("3. Remove Contact by Name");
				System.out.println("4. Search Contact");
				System.out.println("5. Exit");
				System.out.println("---------------------------");
				System.out.println("Enter You Choice");
				
				try{
				c1.ch = scn.nextInt();
				scn.nextLine();
				}catch(InputMismatchException e)
				{
					System.out.println("Exception: Enter Input Only in Integer format");
					
				}
				catch(Exception o)
				{
					o.printStackTrace();
					
				}
				
				
				switch(c1.ch)
				{
				case 1:
					System.out.println("Enter Name to Add");
					String name = scn.nextLine();
					System.out.println("Enter" + name +"'s Mobile Number ");
					String mobNo = scn.nextLine();
					// String n1 = name;
					// String mob = mobNo;
					c1.addContact(name,mobNo);
					System.out.println("Mobile Number Added");
					System.out.println();
					break;
					
				case 2:
					System.out.println();
					c1.displayContacts();
					System.out.println();
					break;
					
				case 3: 
					System.out.println("Enter Name to Remove");
					String n1= scn.nextLine();
					c1.removeContact(n1);
					System.out.println("Name Removed");
					System.out.println();
					break;
				
				case 4:
					System.out.println("Enter Name to Search");
					String n2 = scn.nextLine();
					c1.searchContact(n2);
					System.out.println();
					break;
					
				case 5:
					break;
					
				}
					
			}while(true);
			
			
				
		
	}

}