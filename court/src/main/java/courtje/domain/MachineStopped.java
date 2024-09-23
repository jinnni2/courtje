package courtje.domain;

import courtje.domain.*;
import courtje.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MachineStopped extends AbstractEvent {

    private Long id;
    private Long courtId;
    private String status;
}
