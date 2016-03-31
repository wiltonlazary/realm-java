package io.realm.entities;

import io.realm.RealmObject;

public class DefaultValues extends RealmObject {

    private int age = 42;
    private String name;
    private String address;

    // Default constructor
    public DefaultValues() {
        this.name = "Foo";
        setAddress("Bar");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
