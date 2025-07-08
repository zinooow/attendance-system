package kneeonbelly.attendancesystem.attendance.application

import kneeonbelly.attendancesystem.attendance.domain.Attendance
import kneeonbelly.attendancesystem.member.domain.Member
import java.time.LocalDate

interface AttendanceUseCase {
    fun findAttendanceByMember(member: Member): List<Attendance>
    fun findAttendanceByDateRange(startDate: LocalDate, endDate: LocalDate): List<Attendance>
    fun attend(member: Member): Attendance

}