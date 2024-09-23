package courtje.domain;

import courtje.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "courts", path = "courts")
public interface CourtRepository
    extends PagingAndSortingRepository<Court, Long> {}
