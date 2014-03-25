package com.royal.griffin.service;


import java.util.List;

import com.royal.griffin.model.Person;

public interface PersonService {
    
    public void addPerson(Person person);
    public List<Person> listPeople();
    public void removePerson(Integer id);
}
