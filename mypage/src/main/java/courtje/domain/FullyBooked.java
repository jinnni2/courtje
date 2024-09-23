package courtje.domain;

import courtje.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class FullyBooked extends AbstractEvent {

    private Long id;
    private Long reserveId;
    private String courtName;
}
