package courtje.domain;

import courtje.domain.*;
import courtje.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CourtDecreased extends AbstractEvent {

    private Long id;
    private Integer qty;
    private String courtName;

    public CourtDecreased(Court aggregate) {
        super(aggregate);
    }

    public CourtDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
