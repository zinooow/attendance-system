package kneeonbelly.attendancesystem.member.domain

import kneeonbelly.attendancesystem.member.application.MemberCreateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import java.time.LocalDate
import kotlin.test.Test

class MemberTest(
) {
    private lateinit var member : Member

    @BeforeEach
    fun setup() {
       member = Member.join(
           MemberCreateRequest(
               name = "jinho",
               beltColor = "white",
               grau = 0,
               phoneNumber = "",
           )
       )
    }


    @Test
    fun join() {
        val member1 = Member.join(
            MemberCreateRequest(
                name = "jinho",
                beltColor = "white",
                grau = 0,
                phoneNumber = "",
            )
        )
        assertThat(member1.name).isEqualTo("jinho")
        assertThat(member1.belt.beltColor).isEqualTo(BeltColor.WHITE)
    }

    @Test
    fun promote() {
        assertThat(member.belt.beltColor).isEqualTo(BeltColor.WHITE)
        assertThat(member.belt.grau).isEqualTo(0)

        member.promote(Belt(BeltColor.BLUE,1))

        assertThat(member.belt.beltColor).isEqualTo(BeltColor.BLUE)
        assertThat(member.belt.grau).isEqualTo(1)
    }

}