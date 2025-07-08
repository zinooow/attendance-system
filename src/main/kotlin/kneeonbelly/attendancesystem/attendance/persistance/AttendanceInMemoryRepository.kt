package kneeonbelly.attendancesystem.attendance.persistance

import kneeonbelly.attendancesystem.attendance.domain.Attendance
import kneeonbelly.attendancesystem.member.domain.Member
import java.time.LocalDate

class AttendanceInMemoryRepository: AttendanceRepository {

    private val attendanceList: MutableList<Attendance> = mutableListOf()

    override fun findAttendanceByMember(member: Member): List<Attendance> {
        return attendanceList.filter{ attendance -> attendance.member == member }
    }

    override fun findAttendanceByDateRange(
        startDate: LocalDate,
        endDate: LocalDate
    ): List<Attendance> {
        return attendanceList.filter { attendance ->
            attendance.date >= startDate.atStartOfDay()
            && attendance.date <= endDate.atTime(23,59,59)
        }
    }

    override fun attend(attendance: Attendance): Attendance {
        attendanceList.add(attendance)
        return attendance
    }

}