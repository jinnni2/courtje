package courtje.domain;

import courtje.domain.*;
import courtje.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class MachineStopped extends AbstractEvent {

    private Long id;
    private Long courtId;
    private String status;

    public MachineStopped(Machine aggregate) {
        super(aggregate);
    }

    public MachineStopped() {
        super();
    }
}
//>>> DDD / Domain Event
