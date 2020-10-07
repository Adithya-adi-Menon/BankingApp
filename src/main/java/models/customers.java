package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "customers")
@Table(name="customers")
public class customers {


    @Id
    @Column(name = "id")
    int id;

    @Column(name = "name")
    String name;

    @Column(name="email")
    String email;

    @Column(name = "currentbal")
    int currentbal;

    public customers() {
    }


    public customers(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCurrentbal() {
        return currentbal;
    }

    public void setCurrentbal(int currentbal) {
        this.currentbal = currentbal;
    }


}
