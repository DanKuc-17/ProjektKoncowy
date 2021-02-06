package pl.CarpeDiemTravel.entity.tour;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tours")
public class Tour {

    @OneToOne
    private StartPoint StartPoint;
    @OneToOne
    private EndPoint endPoint;

    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private Standard standard;

}
