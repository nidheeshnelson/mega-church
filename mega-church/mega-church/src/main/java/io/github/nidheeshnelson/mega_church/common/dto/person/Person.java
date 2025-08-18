package io.github.nidheeshnelson.mega_church.common.dto.person;

import io.github.nidheeshnelson.mega_church.common.enumeration.PersonType;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Person",description = "It is used for getting all peson types of objects")
public interface Person {
    /**
     * Method to get the DTO based on the person type
     *
     * @param personType The type of person (e.g., Pastor, Member, Volunteer)
     * @return a specific DTO based on the person type
     */
@Schema(description = "Method to retrieve the DTO based on person in the church type")
    default PersonDTO getPersonDTO(PersonType personType) {
        return switch (personType) {
            case NON_MEMBER -> new NonMemberDTO(); // Return NonMemberDTO
            case MINOR -> new MinorDTO(); // Return NonMemberDTO
            default -> null; // Return null if no matching type
        };
    }
}
