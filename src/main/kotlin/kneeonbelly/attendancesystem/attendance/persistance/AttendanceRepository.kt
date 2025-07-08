package kneeonbelly.attendancesystem.attendance.persistance

import kneeonbelly.attendancesystem.attendance.domain.Attendance
import kneeonbelly.attendancesystem.member.domain.Member
import java.time.LocalDate

interface AttendanceRepository {
    fun findAttendanceByMember(member: Member): List<Attendance>
    fun findAttendanceByDateRange(startDate: LocalDate, endDate: LocalDate): List<Attendance>
    fun attend(attendance: Attendance): Attendance
}