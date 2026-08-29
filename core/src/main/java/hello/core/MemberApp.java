package hello.core;

import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.Grade;

public class MemberApp {
    public static void main(String[] args) {

        // 실제로는 클라이언트가 직접 new Member를 하지 않고, MemberService에서 createMember를 거쳐서 member 객체를 생성함
        // 클라이언트가 직접 member를 생성해버리면 보안 문제 발생 및 중복 검사나 추가 로직 작성이 어려워짐.
        
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
