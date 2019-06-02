package xyz.gauravsharma;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE", schema = "EMS")
public class Employee {

    @Id
    @Column(name = "EMP_ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
