package com.lowes.geeksforlowes.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    private int teamId;

    @NotNull
    private String teamName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private List<OrgMember> OrgMemberList = new ArrayList<OrgMember>();

    @OneToOne(cascade = CascadeType.ALL ,mappedBy = "team")
    private OrgMember teamAdmin ;

    public OrgMember getTeamAdmin() {
        return teamAdmin;
    }

    public void setTeamAdmin(OrgMember teamAdmin) {
        this.teamAdmin = teamAdmin;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<OrgMember> getOrgMemberList() {
        return OrgMemberList;
    }

    public void setOrgMemberList(List<OrgMember> OrgMemberList) {
        this.OrgMemberList = OrgMemberList;
    }


}
