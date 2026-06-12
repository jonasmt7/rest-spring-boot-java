package br.com.jonasmt7.services;

import br.com.jonasmt7.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(String id){
        logger.info("Finding one Person");

        Person person = new Person(counter.incrementAndGet(), "Jonas", "Teixeira", "Teresópolis-RJ", "Male");
        return person;
    }

    public List<Person> findAll(){
        logger.info("Finding all People!");
        List<Person> persons = new ArrayList<Person>();
        return persons;
    }

    public Person create(Person person){
        logger.info("Creating a Person");

        return person;
    }

    public Person update(Person person){
        logger.info("Updating a Person");

        return person;
    }

    public void delete(String id){
        logger.info("Deleting a Person");


    }
}
