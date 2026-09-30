package hello.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemberRepository;

@Configuration
public class AppConfig {
    
    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    } 

    // 굳이 이렇게 메서드로 만들어주는 이유는 
    // AppConfig만 보더라도 한 눈에 전체 설계에 대한 그림을 파악할 수 있기 때문
    // 가독성이 좋아지고 중복도 제거됨. 리펙토링
    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        // return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}

