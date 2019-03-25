package com.lowes.geeksforlowes.service;

import com.lowes.geeksforlowes.model.OrgMember;

public interface MemberService {
    String updateMember(OrgMember orgmember);

    String addMember(OrgMember orgmember);

    OrgMember getMemberById(Integer memberId);
}
