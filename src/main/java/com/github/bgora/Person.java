package com.github.bgora;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Optional;

/**
 * PersonDTO
 * Class to send Person data over network
 * Required fields are birthDate, First Name, Last Name
 * TODO: Refactor this class to use Builder Pattern
 */
public class Person {


    private final LocalDate birthDate;
    private final String firstName;
    private final String lastName;

    @Size(max = 11, min = 11)
    @Pattern(regexp = "[\\d]{11}")
    private String pesel;
    private String secondName;
    private String thirdName;
    private Address address;

    public Person(final LocalDate birthDate, final String firstName, final String lastName) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(final LocalDate birthDate, final String firstName, final String lastName, final String pesel) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public Person(final LocalDate birthDate, final String firstName, final String lastName, final String pesel, final String secondName) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.secondName = secondName;
    }

    public Person(final LocalDate birthDate, final String firstName, final String lastName,
                  final String pesel, final String secondName, final String thirdName) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

    public Person(final LocalDate birthDate, final String firstName, final String lastName,
                  final String pesel, final String secondName, final String thirdName, Address address) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Optional<String> getPesel() {
        return Optional.ofNullable(pesel);
    }

    public Optional<String> getSecondName() {
        return Optional.ofNullable(secondName);
    }

    public Optional<String> getThirdName() {
        return Optional.ofNullable(thirdName);
    }

    public Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }
}

