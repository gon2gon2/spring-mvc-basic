package gon.hello.hellospring;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gon.hello.hellospring.repository.JdbcMemberRepository;
import gon.hello.hellospring.repository.JdbcTemplateMemberRepository;
import gon.hello.hellospring.repository.MemberRepository;
import gon.hello.hellospring.repository.MemoryMemberRepository;
import gon.hello.hellospring.service.MemberService;

@Configuration
public class SpringConfig {
    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
