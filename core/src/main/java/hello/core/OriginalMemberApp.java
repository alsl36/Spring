package hello.core;


import hello.core.member.Member;
import hello.core.member.Grade;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.OriginalMemberServiceImpl;

// MemberService 잘 돌아가는지 테스트
public class OriginalMemberApp {
    public static void main(String[] args) {
        MemberService memberService = new OriginalMemberServiceImpl();
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);
        System.out.println("memberA : " + memberService.findMember(1L).getName());
    }
    
}
