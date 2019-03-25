package com.lowes.geeksforlowes.service;

import com.lowes.geeksforlowes.model.Team;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {

    @Override
    public Team getTeamById(Integer teamId) {
        return null;
    }

    @Override
    public String addTeam(Team team) {
        return "team added";
    }

    @Override
    public String updateTeam(Team team) {
        return "team, updated";
    }


}
