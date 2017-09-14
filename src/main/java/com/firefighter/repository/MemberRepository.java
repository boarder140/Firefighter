package com.firefighter.repository;

import com.firefighter.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by Andrew on 6/8/2017.
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

    List<Member> findByFirstName(String firstName);

    List<Member> findByLastName(String lastName);

}
