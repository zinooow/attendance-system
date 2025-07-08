package kneeonbelly.attendancesystem.attendance.application

import kneeonbelly.attendancesystem.attendance.domain.Attendance
import kneeonbelly.attendancesystem.attendance.persistance.AttendanceRepository
import kneeonbelly.attendancesystem.member.domain.Member
import java.time.LocalDate
import java.time.LocalDateTime

class AttendanceService(
    private val attendanceRepository: AttendanceRepository
) : AttendanceUseCase {
    override fun findAttendanceByMember(member: Member): List<Attendance> {
        return attendanceRepository.findAttendanceByMember(member)
    }

    override fun findAttendanceByDateRange(startDate: LocalDate, endDate: LocalDate): List<Attendance> {
        return attendanceRepository.findAttendanceByDateRange(startDate, endDate)
    }

    override fun attend(member: Member) : Attendance {
        return attendanceRepository.attend(Attendance(member, LocalDateTime.now()))
    }

}