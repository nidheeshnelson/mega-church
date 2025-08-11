package io.github.nidheeshnelson.mega_church.common.dto.person;

import io.github.nidheeshnelson.mega_church.common.enumeration.PersonType;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "PersonDTO",description = "It is used for getting all peson types of objects")
public interface PersonDTO {
    /**
     * Method to get the DTO based on the person type
     *
     * @param personType The type of person (e.g., Pastor, Member, Volunteer)
     * @return a specific DTO based on the person type
     */
@Schema(description = "Method to retrieve the DTO based on person in the church type")
    default PersonDTO getSoulDTO(PersonType personType) {
        switch (personType) {
            case PASTOR:
                return new PastorDTO(); // Return PastorDTO
            case MEMBER:
                return new MemberDTO(); // Return MemberDTO
            case NON_MEMBER:
                return new NonMemberDTO(); // Return NonMemberDTO
            case MINOR:
                return new MinorDTO(); // Return NonMemberDTO
            default:
                return null; // Return null if no matching type
        }
    }
}
