package temaCurs17;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService(List.of(
                new Person("Alexandru", "Bratu", 36, "Bucuresti" ),
                new Person("Cristian", "Ion", 80, "Cluj" ),
                new Person("Stefan", "Bulzan", 36, "Oradea" ),
                new Person("Mihai", "Matulescu", 32, "Arad" ),
                new Person("Dan", "Georgescu", 19, "Bucuresti" )
        ));

        System.out.println(personService.getAllnames());
        System.out.println(personService.getMajorPersons());
        System.out.println(personService.getPersonsFromOradea());
        System.out.println(personService.getPersonsFromOradeaOrCluj());
        System.out.println(personService.getFirstNameWithCaps());
        System.out.println(personService.getFirstLetter());
        System.out.println(personService.getAge());
        System.out.println(personService.getFirstNameA());
        System.out.println(personService.getUnique());
        System.out.println("------");
        System.out.println(personService.getSortedByFirstName());
        System.out.println(personService.getSortedByLastName());
        System.out.println(personService.getSortedByNameAndAge());
    }

}
