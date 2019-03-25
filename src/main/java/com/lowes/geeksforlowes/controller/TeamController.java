package com.lowes.geeksforlowes.controller;

import com.lowes.geeksforlowes.model.Team;
import com.lowes.geeksforlowes.service.TeamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "lowesforgeeks/team")
public class TeamController {

    @Autowired
    TeamServiceImpl teamService;

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public @ResponseBody Team viewTeam(
            @PathVariable("teamId") Integer teamId,
            @RequestHeader("memberId") Integer memberId) {
        Team team = teamService.getTeamById(teamId);
        return team;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public @ResponseBody String addTeam(
            @RequestBody Team team,
            @RequestHeader("memberId") Integer memberId) {
        String response = teamService.addTeam(team);
        return response;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public @ResponseBody String updateTeam(
            @RequestBody Team team,
            @RequestHeader("memberId") Integer memberId) {
        System.out.println(memberId);
        String response = teamService.updateTeam(team);
        return response;
    }

}
