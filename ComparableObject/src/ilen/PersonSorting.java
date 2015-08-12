package ilen;

public class PersonSorting {
	
	public PersonSorting () {
		// constructor
	}
	
	public void SortingLastNameAscending(Person... p) {
		for(int i=0; i<p.length; i++) {
			for(int j=i+1; j<p.length; j++) {
				// if person after less than before then swap position together
				if(p[j].compareTo(p[i])<0 && i!=j) {
					Person temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}
	}
	
	public void SortingDoBAscending(Person... p) {
		for(int i=0; i<p.length; i++) {
			for(int j=i+1; j<p.length; j++) {
				// if person after less than before then swap position together
				if(p[j].getAge() < p[i].getAge() && i!=j) {
					Person temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 =  new Person("Mischa", "Barton", 1980);
		Person p2 =  new Person("Christian", "Bale", 1977);
		Person p3 =  new Person("Joan", "Collins", 1985);
		Person p4 =  new Person("Gemma", "Arterton", 1982);
		Person p5 =  new Person("Daniel", "Craig", 1980);
		
		Person[] persons = new Person[]{p1, p2, p3, p4, p5};
		
		PersonSorting sorting = new PersonSorting();
		
		// Sorting Person by Last Name
		sorting.SortingLastNameAscending(persons);
		System.out.println("Sorting Person by Last Name");
		for(Person p : persons)
			System.out.println(p.getFistName() + " " + p.getLastName() + " " + p.getDoB());
		
		// Sorting Person by Age
		sorting.SortingDoBAscending(persons);
		System.out.println("\nSorting Person by Age");
		for(Person p : persons)
			System.out.println(p.getFistName() + " " + p.getLastName() + " " + p.getDoB() + ", " +p.getAge() + " year old");
	}

}
