package kneeonbelly.attendancesystem.attendance.application

import kneeonbelly.attendancesystem.attendance.domain.Attendance
import kneeonbelly.attendancesystem.member.domain.Member

interface AttendanceUseCase {
    fun getAttendance(member: Member): List<Attendance>
    fun attend(member: Member): Attendance
}