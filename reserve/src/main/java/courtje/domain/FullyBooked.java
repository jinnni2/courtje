package courtje.domain;

import courtje.domain.*;
import courtje.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FullyBooked extends AbstractEvent {

    private Long id;
    private Long reserveId;
    private String courtName;
}
