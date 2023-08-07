package com.devheroes.restful.app.services;

import com.devheroes.restful.app.entities.TeamEntity;
import com.devheroes.restful.app.repositories.ITeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Repository("TeamEntityService")
@SuppressWarnings("unused")
public class TeamEntityImpl implements ITeamService {

    @Autowired
    ITeamRepository teamRepository;

    @Override
    public List<TeamEntity> listAll() {
        return teamRepository.findAll();
    }

    @Override
    public void save(TeamEntity characterEntity) {
        teamRepository.save(characterEntity);
    }

    @Override
    public TeamEntity getReferenceById(Long id) {
        final Optional<TeamEntity> teamEntity = teamRepository.findById(id);
        return teamEntity.orElse(null);
    }

    @Override
    public void deleteId(Long id) {
        teamRepository.deleteById(id);
    }

    @Override
    public void updateById(Long id, TeamEntity teamEntity) {
        teamRepository.findById(id).map(t -> {
            t.setName(teamEntity.getName());
            t.setDivision(teamEntity.getDivision());
            return teamRepository.save(t);
        }).orElseGet(() -> {
            teamEntity.setId(id);
            return teamRepository.save(teamEntity);
        });
    }
}
