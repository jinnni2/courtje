package courtje.infra;

import courtje.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "reservationLists",
    path = "reservationLists"
)
public interface ReservationListRepository
    extends PagingAndSortingRepository<ReservationList, Long> {
    List<ReservationList> findByReserveId(String reserveId);
}
