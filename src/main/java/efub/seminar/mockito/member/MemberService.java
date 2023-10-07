package efub.seminar.mockito.member;

import efub.seminar.mockito.domain.Member;
import efub.seminar.mockito.domain.Study;

import java.util.Optional;

public interface MemberService {
    Member findById(Long memberId) throws MemberNotFoundException;
}