package com.lowes.geeksforlowes.service;

import com.lowes.geeksforlowes.model.Team;

public interface TeamService {


    Team getTeamById(Integer teamId);

    String addTeam(Team team);

    String updateTeam(Team team);
}
