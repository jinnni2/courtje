package courtje.domain;

import courtje.domain.*;
import courtje.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FullyBooked extends AbstractEvent {

    private Long id;
    private Long reserveId;
    private String courtName;

    public FullyBooked(Court aggregate) {
        super(aggregate);
    }

    public FullyBooked() {
        super();
    }
}
//>>> DDD / Domain Event
