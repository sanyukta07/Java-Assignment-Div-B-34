import java.util.*;
class ListOfNames
{
	
	public ArrayList<String> add(ArrayList<String> al){
	al.add("MITA");
	al.add("Keerti");
	al.add("soham");
	al.add("Lokesh");
	al.add("BRYN");
	return (al);
      }
	public ArrayList<String> remove(ArrayList<String> al)
	{
	al.remove("soham");
	return (al);
	}
	
	
	
}
class ArrayListt
{
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
	
		ListOfNames ln=new ListOfNames();
		
		
      	System.out.println("An initial list of elements: "+ln.add (al));
		System.out.println("List of elements after removing soham  "+ln.remove(al)); 
		System.out.println("Size of array list: "+al.size()); 
		
		System.out.println("An initial list of elements: "+al);
	
		for(int i = 0; i < al.size(); i++) {
			String name = al.get(i);
			String vowels = "";
			String duplicates = "";
			for(int j = 0; j < name.length(); j++) {
				char c = name.charAt(j);
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'|| c == 'A'|| c == 'E' || c == 'I' || c == 'O' || c == 'U') {
					if(vowels.indexOf(c) == -1)
						vowels += ", " + c;
				}
 
				for(int k = 0; k < j; k++) {
					if(duplicates.indexOf(c) == -1 && name.charAt(k) == c)
						duplicates += ", " + c;
					   
				}
 
			}
		   
			if(vowels.equals("" ) && duplicates.equals(""))
				System.out.println("The name in lower case "+name.toLowerCase());
			else if(vowels.equals(""))
				System.out.println("The name " + name + " has the following duplicate character(s): " + duplicates.substring(2));
			else if(duplicates.equals(""))
				System.out.println("The name " + name + " contains vowels, and the vowels are: " + vowels.substring(2));
			else
				System.out.println("The name " + name + " contains vowels and has duplicate characters");
 
		}
			
		
		
}
}