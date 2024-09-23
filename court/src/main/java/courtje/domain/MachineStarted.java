package courtje.domain;

import courtje.domain.*;
import courtje.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MachineStarted extends AbstractEvent {

    private Long id;
    private Long courtId;
    private Long reserveId;
    private String status;
}
