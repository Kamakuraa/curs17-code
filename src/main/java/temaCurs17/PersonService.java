package temaCurs17;

import java.util.*;
import java.util.stream.Collectors;


public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public PersonService(Collection<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public PersonService() {

    }

    public List<String> getAllnames() {
        List<String> result = persons.stream()
                .map(person -> person.getFirstName() + "-" + person.getLastName())
                .collect(Collectors.toList());
        return result;
    }

    public List<Person> getMajorPersons() {
        List<Person> result = persons.stream()
                .filter(person -> person.getAge() > 18)
                .collect(Collectors.toList());
        return result;
    }

    public List<Person> getPersonsFromOradea() {
        List<Person> result = persons.stream()
                .filter(person -> person.getCity().equals("Oradea" ))
                .collect(Collectors.toList());
        return result;
    }

    public List<Person> getPersonsFromOradeaOrCluj() {
        List<Person> result = persons.stream()
                .filter(person -> person.getCity().equals("Oradea" ) || person.getCity().equals("Cluj" ))
                .collect(Collectors.toList());
        return result;
    }

    public List<String> getFirstNameWithCaps() {
        List<String> result = persons.stream()
                .map(person -> person.getFirstName())
                .map(personName -> personName.toUpperCase())
                .collect(Collectors.toList());
        return result;
    }

    public List<String> getFirstLetter() {
        List<String> result = persons.stream()
                .map(person -> person.getFirstName() + " - " + person.getLastName().charAt(0))
                .collect(Collectors.toList());
        return result;
    }

    public List<Person> getAge() {
        List<Person> result = persons.stream()
                .filter(person -> person.getAge() < 60)
                .filter(person -> person.getAge() > 18)
                .collect(Collectors.toList());
        return result;
    }

    public List<Person> getFirstNameA() {
        List<Person> result = persons.stream()
                .filter(person -> person.getFirstName().contains("A" ))
                .collect(Collectors.toList());
        return result;
    }

    public List<String> getUnique() {
        List<String> result = persons.stream()
                .map(Person::getFirstName)
                .distinct()
                .collect(Collectors.toList());
        return result;
    }

    public List<String> getSortedByFirstName() {
        List<String> result = persons.stream()
                .map(Person::getFirstName)
                .sorted()
                .collect(Collectors.toList());
        return result;

    }

    public List<String> getSortedByLastName() {
        List<String> result = persons.stream()
                .map(Person::getLastName)
                .sorted()
                .collect(Collectors.toList());
        return result;

    }

    public List<Person> getSortedByNameAndAge() {
        List<Person> result = persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName)
                        .thenComparing(Comparator.comparing(Person::getLastName)
                                .thenComparing(Person::getAge)))
                .collect(Collectors.toList());
        return result;
    }

}


