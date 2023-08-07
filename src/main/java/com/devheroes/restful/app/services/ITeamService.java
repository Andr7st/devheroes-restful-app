package com.devheroes.restful.app.services;

import com.devheroes.restful.app.entities.TeamEntity;
import java.util.List;

public interface ITeamService {

    List<TeamEntity> listAll();

    void save(TeamEntity characterEntity);

    TeamEntity getReferenceById(Long id);

    void deleteId(Long id);

    void updateById(Long id, TeamEntity characterEntity);

}
