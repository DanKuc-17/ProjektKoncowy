package pl.CarpeDiemTravel.entity;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City extends NamedEntity{

    @ManyToOne
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
