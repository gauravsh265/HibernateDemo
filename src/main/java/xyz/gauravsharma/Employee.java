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

    @Embedded
    private Address address;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "city", column = @Column(name = "HOME_CITY")),
            @AttributeOverride(name = "description", column = @Column(name = "HOME_DESC"))
    })
    private Address homeAddress;


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

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", homeAddress=" + homeAddress +
                '}';
    }
}
