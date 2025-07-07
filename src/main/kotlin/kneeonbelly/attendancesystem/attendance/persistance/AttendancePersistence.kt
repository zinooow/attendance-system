package kneeonbelly.attendancesystem.attendance.persistance

import kneeonbelly.attendancesystem.attendance.domain.Attendance
import kneeonbelly.attendancesystem.member.domain.Member

interface AttendancePersistence {
    fun findAttendanceByMember(member: Member): List<Attendance>
    fun attend(attendance: Attendance): Attendance
}