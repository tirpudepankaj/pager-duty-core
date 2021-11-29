package pager.duty.core.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pager.duty.core.controller.model.TeamModel;
import pager.duty.core.service.TeamService;

import java.util.List;

@RestController
@RequestMapping("/page-duty-core")
public class TeamController {

    private TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("/team")
    public ResponseEntity<TeamModel> create(@RequestBody TeamModel teamModel) {
        return
                ResponseEntity.accepted()
                        .body(teamService.create(teamModel));
    }

    @GetMapping("/team")
    public ResponseEntity<List<TeamModel>> getAll() {
        return
                ResponseEntity.ok().body(teamService.getAll());
    }

    @GetMapping("/team/{teamId}")
    public ResponseEntity<TeamModel> get(@PathVariable long teamId) {
        return ResponseEntity.ok().body(teamService.get(teamId));
    }
}
