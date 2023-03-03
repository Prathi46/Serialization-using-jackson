package org.Jackson;

import com.fasterxml.jackson.annotation.JsonInclude;

//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {
    private int id;
    private String firstName;
    //@JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String address;

    public Employee(int id, String firstName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
