package kneeonbelly.attendancesystem.attendance.domain

import kneeonbelly.attendancesystem.member.domain.Member
import java.time.LocalDateTime

class Attendance(
    val member: Member,
    val date: LocalDateTime
) {
}