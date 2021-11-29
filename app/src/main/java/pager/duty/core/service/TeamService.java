package pager.duty.core.service;

import pager.duty.core.controller.model.TeamModel;

import java.util.List;

public interface TeamService {

    public TeamModel create(TeamModel team);

    public List<TeamModel> getAll();

    public TeamModel get(long teamId);

}
