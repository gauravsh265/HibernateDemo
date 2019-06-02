package xyz.gauravsharma;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEE", schema = "EMS")
public class Employee {

    @Id
    @Column(name = "EMP_ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @ElementCollection
    @JoinTable(schema = "EMS")
    private Set<Address> addresses;

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

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
