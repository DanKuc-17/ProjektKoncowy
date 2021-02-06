package pl.CarpeDiemTravel.entity.tour;

import pl.CarpeDiemTravel.entity.Airport;
import pl.CarpeDiemTravel.entity.City;
import pl.CarpeDiemTravel.entity.Hotel;

public class EndPoint {

    private City city;
    private Airport airport;
    private Hotel hotel;


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

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}
