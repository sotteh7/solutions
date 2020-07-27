package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 7/22/2020.
 */
public class People {
    List<Person> personList;

    public People() {
        this(new ArrayList<>());
    }

    public People(List<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById(long id) {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            if (person.getId() == id) { //if the id is correct,
                return person; // return person
            } else { // if its the wrong id,
                continue; // keep lookin'!
            }
        } // finished loop; we've finished lookin'
        return null; // we were not able to find the person with the id
    }

    public Person findByIdExpanded(long id) {
        for (int i = 0; i < personList.size(); i++) {
             Person person = personList.get(i);
            if (person.getId() == id) { //if the id is correct,
                return person; // return person
            } else { // if its the wrong id,
                continue; // keep lookin'!
            }
        } // finished loop; we've finished lookin'
        return null; // we were not able to find the person with the id
    }

    public Boolean contains(Person specifiedPerson) {
        return personList.contains(specifiedPerson);
    }

    public void remove(Person someSpecificPerson) {
        personList.remove(someSpecificPerson);
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        int arrayLength = personList.size();
        Person[] newArray = new Person[arrayLength];
        return personList.toArray(newArray);
    }

}