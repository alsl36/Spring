package hello.core.member;

// import hello.core.member.MemberRepository;
// import hello.core.member.MemoryMemberRepository;

public class OriginalMemberServiceImpl implements MemberService {

    MemberRepository memberRepository = new MemoryMemberRepository();

    @Override 
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override 
    public Member findMember(Long memberId) {
        Member member =  memberRepository.findById(memberId);
        return member;
    } 
    
}
