package kneeonbelly.attendancesystem.attendance.application

import kneeonbelly.attendancesystem.attendance.domain.Attendance
import kneeonbelly.attendancesystem.attendance.persistance.AttendancePersistence
import kneeonbelly.attendancesystem.member.domain.Member
import java.time.LocalDateTime

class AttendanceService(
    private val attendanceRepository: AttendancePersistence
) : AttendanceUseCase {
    override fun getAttendance(member: Member): List<Attendance> {
        return attendanceRepository.findAttendanceByMember(member)
    }

    override fun attend(member: Member) : Attendance {
        return attendanceRepository.attend(Attendance(member, LocalDateTime.now()))
    }

}