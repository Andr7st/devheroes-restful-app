package com.devheroes.restful.app.controllers;

import com.devheroes.restful.app.entities.TeamEntity;
import com.devheroes.restful.app.services.ITeamService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@RestController
@RequestMapping(path = "/api/teams")
@SuppressWarnings("unused")
public class TeamRestController {

    @Autowired
    @Qualifier("TeamEntityService")
    private ITeamService teamService;

    @GetMapping({"","/"})
    public List<TeamEntity> listTeams() {
        return teamService.listAll();
    }

    @GetMapping("/{id}")
    public TeamEntity getTeamById(@PathVariable Long id, HttpServletResponse response) {
        TeamEntity teamEntity = teamService.getReferenceById(id);
        if(teamEntity == null) {
            response.setStatus(HttpStatus.NOT_FOUND.value());
        }
        return teamEntity;
    }

    @PostMapping({"","/"})
    public void saveTeam(@RequestBody TeamEntity teamEntity) {
        teamService.save(teamEntity);
    }

    @PutMapping("/{id}")
    public void updateTeam(@PathVariable Long id, @RequestBody TeamEntity teamEntity) {
        teamService.updateById(id, teamEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable Long id) {
        teamService.deleteId(id);
    }
}
