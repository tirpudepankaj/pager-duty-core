package pager.duty.core.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pager.duty.core.controller.model.TeamModel;
import pager.duty.core.entity.Team;

@Component
public class TeamModelToTeam implements Converter<TeamModel, Team> {

    @Override
    public Team convert(TeamModel source) {
        return Team.builder()
                .name(source.getName())
                .email(source.getEmail())
                .lead(source.getLead())
                .developers(source.getDevelopers())
                .build();
    }
}
