package nodeCase;

import java.util.ArrayList;
import java.util.List;

public class RunCase {
	
	
	public static void main(String[] args) {
	
		PersonChain chain=new PersonChain();
				chain.add(new Person("jack",1));		
				chain.add(new Person("rose",2));
				chain.printAll();
		
	} 	

}
