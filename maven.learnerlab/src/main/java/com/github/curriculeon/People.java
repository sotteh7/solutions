package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 7/22/2020.
 */
public class People implements Iterable {
    List<Person> personList = new ArrayList<>();

    public void add(Person personToBeAdded) {
        personList.add(personToBeAdded);
    }


    public Person findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[personList.size()]);
    }

    @Override
    public Iterator iterator() {
        return personList.iterator();
    }
}
