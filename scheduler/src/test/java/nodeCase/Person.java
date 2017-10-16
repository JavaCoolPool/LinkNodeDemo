package nodeCase;

public class Person {	
		
		private  String name;
		
		private  int personNo;
		
		public int getPersonNo() {
			return personNo;
		}

		public void setPersonNo(int personNo) {
			this.personNo = personNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Person(String name) {
			this.name = name;
		}

		public Person(String name, int personNo) {
			this.name = name;
			this.personNo = personNo;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", personNo=" + personNo + "]";
		}
}
