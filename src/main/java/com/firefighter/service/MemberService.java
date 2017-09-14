package com.firefighter.service;

import com.firefighter.model.Member;
import com.firefighter.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Andrew on 6/9/2017.
 */

@Service
public class MemberService {

    @Autowired
    private MemberRepository repository;

    public Member getById(Long id) {
        return repository.findOne(id);
    }

    public List<Member> getByFirstName(String firstName) {
        return repository.findByFirstName(firstName);
    }

    public List<Member> getByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    public List<Member> getAllMembers() {
        return  repository.findAll();
    }
}
