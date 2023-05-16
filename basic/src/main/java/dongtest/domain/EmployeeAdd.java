package dongtest.domain;

import dongtest.domain.*;
import dongtest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class EmployeeAdd extends AbstractEvent {

    private Long id;

    public EmployeeAdd(Employee aggregate) {
        super(aggregate);
    }

    public EmployeeAdd() {
        super();
    }
}
