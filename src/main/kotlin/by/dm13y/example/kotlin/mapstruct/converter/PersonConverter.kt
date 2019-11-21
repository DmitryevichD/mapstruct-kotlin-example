package by.dm13y.example.kotlin.mapstruct.converter

import org.mapstruct.Mapper
import org.mapstruct.Mapping
import by.dm13y.example.kotlin.mapstruct.dto.PersonDto
import by.dm13y.example.kotlin.mapstruct.model.Person

@Mapper(componentModel = "spring")
interface PersonConverter {
    @Mapping(source = "phoneNumber", target = "phone")
    fun convertToDto(person: Person): PersonDto
}
