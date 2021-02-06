package pl.CarpeDiemTravel.entity.tour;

import pl.CarpeDiemTravel.entity.Airport;
import pl.CarpeDiemTravel.entity.City;

public class StartPoint {

    private City city;
    private Airport airport;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}
