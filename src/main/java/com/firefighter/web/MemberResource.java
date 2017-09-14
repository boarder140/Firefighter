package com.firefighter.web;

import com.firefighter.model.Member;
import com.firefighter.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by aweiner on 6/19/2017.
 */
@RestController
@RequestMapping("/members")
public class MemberResource {

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "id/{id}",method = RequestMethod.GET)
    public ResponseEntity<Member> getById(@PathVariable("id") Long id){

        Member m = memberService.getById(id);
        if(m == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(m, HttpStatus.OK);
        }
    }

    @RequestMapping(value = "firstName/{name}", method = RequestMethod.GET)
    public  ResponseEntity<List<Member>> getByFirstName(
            @PathVariable("name") String name)
    {

        List<Member> members = memberService.getByFirstName(name);
        if (!members.isEmpty()) {
            return new ResponseEntity<List<Member>>(members, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Member>>(members, HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public ResponseEntity<List<Member>> getAll() {

        List<Member> members = memberService.getAllMembers();
        if (!members.isEmpty()) {
            return new ResponseEntity<List<Member>>(members, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Member>>(members, HttpStatus.NOT_FOUND);
        }
    }

}
