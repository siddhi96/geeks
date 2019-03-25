package com.lowes.geeksforlowes.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Organization {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @OneToMany
    private List<OrgMember> OrgMemberList = new ArrayList<OrgMember>();

    @OneToOne
    private OrgMember orgAdmin;


    public List<OrgMember> getOrgMemberList() {
        return OrgMemberList;
    }

    public void setOrgMemberList(List<OrgMember> OrgMemberList) {
        this.OrgMemberList = OrgMemberList;
    }


}
