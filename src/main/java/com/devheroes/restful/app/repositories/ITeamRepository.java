package com.devheroes.restful.app.repositories;

import com.devheroes.restful.app.entities.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeamRepository extends JpaRepository<TeamEntity, Long> {
}
