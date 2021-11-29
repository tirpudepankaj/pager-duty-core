package pager.duty.core.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pager.duty.core.controller.model.TeamModel;
import pager.duty.core.entity.Team;

@Component
public class TeamToTeamModel implements Converter<Team, TeamModel> {
    @Override
    public TeamModel convert(Team source) {
        return
                TeamModel.builder()
                        .id(source.getId())
                        .developers(source.getDevelopers())
                        .email(source.getEmail())
                        .name(source.getName())
                        .lead(source.getLead())
                        .build();
    }
}
