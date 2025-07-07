package kneeonbelly.attendancesystem.attendance.persistance

import kneeonbelly.attendancesystem.attendance.domain.Attendance
import kneeonbelly.attendancesystem.member.domain.Member

class AttendanceInMemoryRepository: AttendancePersistence {

    private val attendanceList: MutableList<Attendance> = mutableListOf()

    override fun findAttendanceByMember(member: Member): List<Attendance> {
        return attendanceList.filter{ attendance -> attendance.member == member }
    }

    override fun attend(attendance: Attendance): Attendance {
        attendanceList.add(attendance)
        return attendance
    }

}