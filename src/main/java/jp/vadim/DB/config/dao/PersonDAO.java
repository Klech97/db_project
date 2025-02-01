package jp.vadim.DB.config.dao;

import jp.vadim.DB.config.modules.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(1, "Tom"));
        people.add(new Person(1,"Nat"));
    }
}
