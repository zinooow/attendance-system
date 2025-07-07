package kneeonbelly.attendancesystem.member.domain

import kneeonbelly.attendancesystem.member.application.MemberCreateRequest

class Member private constructor(
    val name: String,
    belt: Belt,
    phoneNumber: String,

) {
    var belt = belt
        private set
    var phoneNumber = phoneNumber
        private set

    companion object {
        fun join(createRequest: MemberCreateRequest) : Member {
            return Member(
                name = createRequest.name,
                belt = Belt(enumValueOf(createRequest.beltColor.uppercase()), createRequest.grau),
                phoneNumber = createRequest.phoneNumber,
            )
        }
    }

    fun promote(belt: Belt) {
        this.belt = belt
    }

    fun updatePhoneNumber(phoneNumber: String) {
        this.phoneNumber = phoneNumber
    }

}