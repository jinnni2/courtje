package courtje.infra;

import courtje.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MachineHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Machine>> {

    @Override
    public EntityModel<Machine> process(EntityModel<Machine> model) {
        return model;
    }
}
