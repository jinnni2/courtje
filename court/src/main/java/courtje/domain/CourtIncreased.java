package courtje.domain;

import courtje.domain.*;
import courtje.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CourtIncreased extends AbstractEvent {

    private Long id;
    private Integer qty;
    private String courtName;

    public CourtIncreased(Court aggregate) {
        super(aggregate);
    }

    public CourtIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
