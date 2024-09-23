package courtje.domain;

import courtje.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CourtReserved extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long courtId;
    private String courtName;
    private String status;
}
