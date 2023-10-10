package efub.seminar.mockito.member;

import efub.seminar.mockito.domain.Member;
import efub.seminar.mockito.domain.Study;

import java.util.Optional;

public interface MemberService {
    Optional<Member> findById(Long memberId) throws MemberNotFoundException;
    void validate(Long memberId) throws InvalidMemberException;
    void notify(Study newStudy);
    void notify(Member member);
}