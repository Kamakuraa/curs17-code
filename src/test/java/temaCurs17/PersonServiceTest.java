package temaCurs17;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


class PersonServiceTest {
    PersonService personService;

    @BeforeEach
    void setup() {
        personService = new PersonService(List.of(
                new Person("Alexandru", "Bratu", 36, "Bucuresti" ),
                new Person("Cristian", "Ion", 80, "Cluj" ),
                new Person("Stefan", "Bulzan", 36, "Oradea" ),
                new Person("Mihai", "Matulescu", 32, "Arad" ),
                new Person("Dan", "Georgescu", 19, "Bucuresti" )
        ));
    }

    @Test
    @DisplayName("When the firstName and the LastName is call then is lunch" )
    void getAllNames() {
        Assertions.assertThat(personService.getAllnames()).isEqualTo(List.of(
                "Alexandru-Bratu", "Stefan-Bulzan", "Cristian-Ion", "Mihai-Matulescu", "Dan-Georgescu"
        ));
    }

    @Test
    @DisplayName("WHEN" )
    void getMajorPersons() {

        Assertions.assertThat(personService.getMajorPersons()).isEqualTo(List.of(
                new Person("Alexandru", "Bratu", 36, "Bucuresti" ),
                new Person("Cristian", "Ion", 80, "Cluj" ),
                new Person("Stefan", "Bulzan", 36, "Oradea" ),
                new Person("Mihai", "Matulescu", 32, "Arad" ),
                new Person("Dan", "Georgescu", 19, "Bucuresti" )
        ));
    }

    @Test
    @DisplayName("WHEN the person is from Oradea THEN is cal" )
    void getPersonFromOradea() {
        PersonService personService = new PersonService(List.of(
                new Person("Alexandru", "Bratu", 36, "Bucuresti" ),
                new Person("Cristian", "Ion", 80, "Cluj" ),
                new Person("Stefan", "Bulzan", 36, "Oradea" ),
                new Person("Mihai", "Matulescu", 32, "Arad" ),
                new Person("Dan", "Georgescu", 19, "Bucuresti" )
        ));
        Assertions.assertThat(personService.getMajorPersons()).isEqualTo(List.of(
                new Person("Alexandru", "Bratu", 36, "Bucuresti" ),
                new Person("Cristian", "Ion", 80, "Cluj" ),
                new Person("Stefan", "Bulzan", 36, "Oradea" ),
                new Person("Mihai", "Matulescu", 32, "Arad" ),
                new Person("Dan", "Georgescu", 19, "Bucuresti" )
        ));
    }

    @Test
    @DisplayName("WHEN the first name is with caps THEN IS CALLED" )
    void getFirstNameWithCaps() {
        PersonService personService = new PersonService(List.of(
                new Person("Alexandru", "Bratu", 36, "Bucuresti" ),
                new Person("Cristian", "Ion", 80, "Cluj" ),
                new Person("Stefan", "Bulzan", 36, "Oradea" ),
                new Person("Mihai", "Matulescu", 32, "Arad" ),
                new Person("Dan", "Georgescu", 19, "Bucuresti" )
        ));
        Assertions.assertThat(personService.getMajorPersons()).isEqualTo(List.of(
                new Person("Alexandru", "Bratu", 36, "Bucuresti" ),
                new Person("Cristian", "Ion", 80, "Cluj" ),
                new Person("Stefan", "Bulzan", 36, "Oradea" ),
                new Person("Mihai", "Matulescu", 32, "Arad" ),
                new Person("Dan", "Georgescu", 19, "Bucuresti" )
        ));
    }

    @Test
    @DisplayName("WHEN the first letter is A THEN is called" )
    void getFirstLetter() {
// ceva nu este in regula aici
// trebuie sa ma uit mai atent
// expected: [Person{firstName='Alexandru', lastName='Bratu', age=36, city='Bucuresti'},
//    Person{firstName='Cristian', lastName='Ion', age=80, city='Cluj'},
//    Person{firstName='Stefan', lastName='Bulzan', age=36, city='Oradea'},
//    Person{firstName='Mihai', lastName='Matulescu', age=32, city='Arad'},
//    Person{firstName='Dan', lastName='Georgescu', age=19, city='Bucuresti'}]
//but was : ["Alexandru - B", "Cristian - I", "Stefan - B", "Mihai - M", "Dan - G"]
        Assertions.assertThat(personService.getFirstLetter()).isEqualTo(List.of(
                new Person("Alexandru", "Bratu", 36, "Bucuresti" ),
                new Person("Cristian", "Ion", 80, "Cluj" ),
                new Person("Stefan", "Bulzan", 36, "Oradea" ),
                new Person("Mihai", "Matulescu", 32, "Arad" ),
                new Person("Dan", "Georgescu", 19, "Bucuresti" )


        ));
    }

    @Test
    @DisplayName("WHEN the persons is between two ages THEN is called" )
    void getAges() {
        Assertions.assertThat(personService.getAge()).isEqualTo(List.of(
                new Person("Alexandru", "Bratu", 36, "Bucuresti" ),
//                new Person("Cristian", "Ion", 80, "Cluj" ),
                new Person("Stefan", "Bulzan", 36, "Oradea" ),
                new Person("Mihai", "Matulescu", 32, "Arad" ),
                new Person("Dan", "Georgescu", 19, "Bucuresti" )
        ));
    }

    @Test
    @DisplayName("WHEN the person" )
    void getUnique() {

        Assertions.assertThat(personService.getUnique()).isEqualTo(List.of("Alexandru", "Cristian", "Stefan", "Mihai", "Dan" ));
    }

    @Test
    @DisplayName("WHEN the person is sorted by the FirstName THEN IS CALLED" )
    void getASortedByFirstName() {

        Assertions.assertThat(personService.getSortedByFirstName()).isEqualTo(List.of("Alexandru", "Cristian", "Dan", "Mihai", "Stefan" ));
    }

    @Test
    @DisplayName("WHEN the person is sorted by the lastName THEN IS CALLED" )
    void getASortedByLastName() {

        // nu merge, nu imi dau seama de ce nu merge
        Assertions.assertThat(personService.getSortedByLastName()).isEqualTo(List.of("Bratu", "Bulzan", "Georgescu", "Ion", "Matulescu" ));
    }

    @Test
    @DisplayName("" )
    void getSortedByNameAndAge() {
        PersonService personService = new PersonService(List.of(
                new Person("Alexandru", "Bratu", 36, "Bucuresti" ),
                new Person("Cristian", "Ion", 80, "Cluj" ),
                new Person("Stefan", "Bulzan", 36, "Oradea" ),
                new Person("Mihai", "Matulescu", 32, "Arad" ),
                new Person("Dan", "Georgescu", 19, "Bucuresti" )
        ));

        Assertions.assertThat(personService.getSortedByNameAndAge()).isEqualTo(List.of(
                new Person("Alexandru", "Bratu", 36, "Bucuresti" ),
                new Person("Cristian", "Ion", 80, "Cluj" ),
                new Person("Stefan", "Bulzan", 36, "Oradea" ),
                new Person("Mihai", "Matulescu", 32, "Arad" ),
                new Person("Dan", "Georgescu", 19, "Bucuresti" )
        ));
    }


}