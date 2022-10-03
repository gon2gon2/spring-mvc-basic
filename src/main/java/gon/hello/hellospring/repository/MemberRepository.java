package gon.hello.hellospring.repository;

import java.util.List;
import java.util.Optional;

import gon.hello.hellospring.domain.Member;

public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findById(Long id);         // 리턴이 Null일 수도 있어서

    Optional<Member> findByName(String name);

    List<Member> findAll();

}
