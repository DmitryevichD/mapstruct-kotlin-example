package by.dm13y.example.kotlin.mapstruct.listener

import by.dm13y.example.kotlin.mapstruct.converter.PersonConverter
import by.dm13y.example.kotlin.mapstruct.model.Person
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class StartAppListener(val personConverter: PersonConverter) {

    @EventListener(ApplicationReadyEvent::class)
    fun startApp() {
        val person = Person();
        val personDto = personConverter.convertToDto(person)
        println(personDto)
    }
}
