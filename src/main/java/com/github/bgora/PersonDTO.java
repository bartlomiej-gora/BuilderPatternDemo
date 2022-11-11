package com.github.bgora;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * PersonDTO
 * Class to send Person data over network
 * Required fields are PESEL, First Name, Last Name
 * TODO: Refactor this class to use Builder Pattern
 */
public class PersonDTO {

    @Size(max = 11, min = 11)
    @Pattern(regexp = "[\\d]{11}")
    private final String pesel;
    private final String firstName;
    private final String lastName;

    private String secondName;
    private String thirdName;
    private Set<PersonDTO> siblings;
    private Set<PersonDTO> kids;


    public PersonDTO(final String pesel, final String firstName, final String lastName) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonDTO(final String pesel, final String firstName, final String lastName, final String secondName) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
    }

    public PersonDTO(final String pesel, final String firstName, final String lastName,
                     final String secondName, final String thirdName) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

    public PersonDTO(final String pesel, final String firstName, final String lastName, final String secondName,
                     final String thirdName, final Set<PersonDTO> siblings) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.siblings = siblings;
    }

    public PersonDTO(final String pesel, final String firstName, final String lastName, final String secondName,
                     final String thirdName, final Set<PersonDTO> siblings, final Set<PersonDTO> kids) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.siblings = siblings;
        this.kids = kids;
    }

    public String getPesel() {
        return pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public Set<PersonDTO> getSiblings() {
        return siblings;
    }

    public Set<PersonDTO> getKids() {
        return kids;
    }
}
