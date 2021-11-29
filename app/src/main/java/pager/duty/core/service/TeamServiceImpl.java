package pager.duty.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pager.duty.core.controller.model.TeamModel;
import pager.duty.core.converter.TeamModelToTeam;
import pager.duty.core.converter.TeamToTeamModel;
import pager.duty.core.entity.Team;
import pager.duty.core.repository.TeamRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    private TeamModelToTeam teamModelToTeam;

    private TeamToTeamModel teamToTeamModel;

    private TeamRepository repository;

    @Autowired
    public TeamServiceImpl(TeamModelToTeam teamModelToTeam, TeamToTeamModel teamToTeamModel, TeamRepository repository) {
        this.teamModelToTeam = teamModelToTeam;
        this.teamToTeamModel = teamToTeamModel;
        this.repository = repository;
    }

    @Override
    public TeamModel create(TeamModel team) {
        Team currTeam = teamModelToTeam.convert(team);
        currTeam = repository.save(currTeam);
        team = teamToTeamModel.convert(currTeam);
        return team;
    }

    @Override
    public List<TeamModel> getAll() {
        List<TeamModel> result = new ArrayList<>();
        for (Team team : repository.findAll())
            result.add(teamToTeamModel.convert(team));
        return result;
    }

    @Override
    public TeamModel get(long teamId) {
        return teamToTeamModel.convert(repository.findById(teamId)
                .orElseThrow(RuntimeException::new));
    }
}
