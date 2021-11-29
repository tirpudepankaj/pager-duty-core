package pager.duty.core.controller.model;

import lombok.Builder;
import lombok.Value;
import pager.duty.core.entity.Developer;

import java.util.List;

@Value
@Builder
public class TeamModel {

    private long id;

    private String name;

    private String email;

    private Developer lead;

    private List<Developer> developers;

}
