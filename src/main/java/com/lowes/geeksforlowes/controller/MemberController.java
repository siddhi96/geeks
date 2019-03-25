package com.lowes.geeksforlowes.controller;

import com.lowes.geeksforlowes.model.OrgMember;
import com.lowes.geeksforlowes.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("geeksforlowes/member")
public class MemberController {

    @Autowired
    MemberServiceImpl memberService;

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public @ResponseBody OrgMember viewMember(
            @PathVariable("memberId") Integer memberId,
            @RequestHeader("memberId") Integer loggedInMemberId) {
        OrgMember orgMember = memberService.getMemberById(memberId);
        return orgMember;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
        public @ResponseBody String addMember(
                @RequestBody OrgMember orgmember,
                @RequestHeader ("loggedInMemberId") Integer loggedInMemberId) {

        String response = memberService.addMember(orgmember);
        return response;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public @ResponseBody String updateMember(
            @RequestBody OrgMember orgmember,
            @RequestHeader ("loggedInMemberId") Integer loggedInMemberId) {

        String response = memberService.updateMember(orgmember);
        return response;
    }



}
