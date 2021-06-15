package temaCurs17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class PersonService {
    private final List<Person> persons= new ArrayList<>();

    public PersonService(Collection<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public List<String> getAllNames(){
        List<String> collect = persons.stream()
                .map(person -> person.getFirstName() + "-" + person.getLastName())
                .collect(Collectors.toList());
        return collect;
    }

}
