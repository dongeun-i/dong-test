package dongtest.domain;

import dongtest.domain.*;
import dongtest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RankAdd extends AbstractEvent {

    private Long id;
    private String name;

    public RankAdd(Rank aggregate) {
        super(aggregate);
    }

    public RankAdd() {
        super();
    }
}
