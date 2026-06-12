package br.com.jonasmt7.services;

import br.com.jonasmt7.model.Person;
import org.springframework.stereotype.Service;

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

}
