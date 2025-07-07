package kneeonbelly.attendancesystem.member.application

data class MemberCreateRequest(
    val name: String,
    val beltColor: String,
    val grau: Int,
    val phoneNumber: String,
)
