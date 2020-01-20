package online.colaba.converter

import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import online.colaba.dto.PersonDto
import online.colaba.model.Person

@Mapper
interface PersonConverter {

    @Mapping(source = "phoneNumber", target = "phone")
    fun convertToDto(person: Person): PersonDto

    @InheritInverseConfiguration
    fun convertToModel(personDto: PersonDto): Person

}
