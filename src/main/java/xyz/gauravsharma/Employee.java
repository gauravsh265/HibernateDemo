package xyz.gauravsharma;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEE", schema = "EMS")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMP_ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @ManyToMany
    @JoinTable(name = "EMP_ADR_MAPPING",schema = "EMS",
            joinColumns = @JoinColumn( name = "EMP_ID"),
            inverseJoinColumns = { @JoinColumn( name = "ADDR_ID")}
    )
    private List<Address> addresses = new ArrayList<>();

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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addresses=" + addresses +
                '}';
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
