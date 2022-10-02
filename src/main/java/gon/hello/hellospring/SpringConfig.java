package gon.hello.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gon.hello.hellospring.repository.MemberRepository;
import gon.hello.hellospring.repository.MemoryMemberRepository;
import gon.hello.hellospring.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
