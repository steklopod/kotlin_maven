package online.colaba.converter

import online.colaba.model.Person
import online.colaba.model.PersonDto
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.mapstruct.factory.Mappers
import java.time.LocalDate

internal class PersonConverterTest {
    private val person = Person(
        "Samuel",
        "Jackson",
        "0123 334466",
        LocalDate.of(1948, 12, 21)
    )

    private val personDto = PersonDto(
        "Samuel",
        "Jackson",
        "0123 334466",
        LocalDate.of(1948, 12, 21)
    )

    @Test
    fun testConvertToDto() {
        val converter = Mappers.getMapper(PersonConverter::class.java)
        val personDto = converter.convertToDto(person)

        assertNotNull(personDto)
        assertEquals(personDto.firstName, "Samuel")
        assertEquals(personDto.lastName, "Jackson")
        assertEquals(personDto.phone, "0123 334466")
        assertEquals(personDto.birthdate, LocalDate.of(1948, 12, 21))
    }

    @Test
    fun testConvertToModel() {
        val converter = Mappers.getMapper(PersonConverter::class.java)
        val person = converter.convertToModel(personDto)

        assertNotNull(person)
        assertEquals(person.firstName, "Samuel")
        assertEquals(person.lastName, "Jackson")
        assertEquals(person.phoneNumber, "0123 334466")
        assertEquals(person.birthdate, LocalDate.of(1948, 12, 21))
    }

}
