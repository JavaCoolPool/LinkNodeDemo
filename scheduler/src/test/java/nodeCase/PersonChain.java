package nodeCase;

public class PersonChain {

	private  PersonNode head;
		
	private  int size;

	private  int count;
	
	
	public void add(Person p ){
		if(null!=head){
			head=new PersonNode(p,head);
			size++;
			count++;
		}else{
			head=new PersonNode(p,null);
			size++;
			count++;
		}
	}
	
	
	public void printAll(){
		
		System.out.println("123");
		
		for(PersonNode p=head;head!=null;p=p.getNextPoint()){
			System.out.println(p.getPerson().toString());
		}
	}
}
