package pl.CarpeDiemTravel.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Country extends NamedEntity {

    @OneToMany (mappedBy = "countries")
    private Set<City> cities = new HashSet<>();

    public Set<City> getCity() {
        return cities;
    }
}
