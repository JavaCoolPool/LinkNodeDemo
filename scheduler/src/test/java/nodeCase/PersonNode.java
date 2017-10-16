package nodeCase;

public class PersonNode {
	
	 private Person person;
	 
	 private PersonNode nextPoint;

	 
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public PersonNode getNextPoint() {
		return nextPoint;
	}

	public void setNextPoint(PersonNode nextPoint) {
		this.nextPoint = nextPoint;
	}

	
	public PersonNode(Person person, PersonNode nextPoint) {
		this.person = person;
		this.nextPoint = nextPoint;
	}

	@Override
	public String toString() {
		return "PersonNode [person=" + person + ", nextPoint=" + nextPoint + "]";
	}
	
}
