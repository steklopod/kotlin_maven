package online.colaba.model

import java.time.LocalDate

data class PersonDto(
    var firstName: String?,
    var lastName: String?,
    var phone: String?,
    var birthdate: LocalDate?
) {
    constructor() : this(null, null, null, null)
}
