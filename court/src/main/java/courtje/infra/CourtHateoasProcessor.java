package courtje.infra;

import courtje.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CourtHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Court>> {

    @Override
    public EntityModel<Court> process(EntityModel<Court> model) {
        return model;
    }
}
