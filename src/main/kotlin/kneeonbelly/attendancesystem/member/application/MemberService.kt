package kneeonbelly.attendancesystem.member.application

import kneeonbelly.attendancesystem.member.domain.Member

class MemberService(
    memberRepository: MemberPersistant
) {
    fun joinMember(createRequest: MemberCreateRequest): Member {


    }
}