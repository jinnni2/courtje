package courtje.domain;

import courtje.domain.*;
import courtje.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CourtCanceled extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long courtId;
    private String courtName;
    private String status;
}
