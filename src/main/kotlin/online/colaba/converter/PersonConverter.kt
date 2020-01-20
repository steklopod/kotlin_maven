package online.colaba.converter

import online.colaba.model.Person
import online.colaba.model.PersonDto
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface PersonConverter {

    @Mapping(source = "phoneNumber", target = "phone")
    fun convertToDto(person: Person): PersonDto

    @InheritInverseConfiguration
    fun convertToModel(personDto: PersonDto): Person

}
