package xyz.gauravsharma;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Lob;

@Embeddable
public class Address {

    @Column(name = "CITY")
    private String city;

    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}