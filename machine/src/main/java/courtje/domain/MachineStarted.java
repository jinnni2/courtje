package courtje.domain;

import courtje.domain.*;
import courtje.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class MachineStarted extends AbstractEvent {

    private Long id;
    private Long courtId;
    private Long reserveId;
    private String status;

    public MachineStarted(Machine aggregate) {
        super(aggregate);
    }

    public MachineStarted() {
        super();
    }
}
//>>> DDD / Domain Event
