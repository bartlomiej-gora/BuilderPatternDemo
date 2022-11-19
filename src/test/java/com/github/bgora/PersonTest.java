package com.github.bgora;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    final String givenName = "givenName";
    final String givenLastName = "givenLastName";
    final String givenPesel = "84020312314";
    final String givenSecondName = "givenSecondName";
    final String givenThirdName = "givenThirdName";
    final Address givenAddress = new Address("44-110", "Gliwice", "Zwycięstwa", "1", "1");

    @Test
    public void test1() {
        var person = new Person(LocalDate.now(), givenName, givenLastName);
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isEqualTo(givenName);
        assertThat(person.getLastName()).isEqualTo(givenLastName);
    }


    @Test
    public void test2() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, givenPesel);
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isEqualTo(givenName);
        assertThat(person.getLastName()).isEqualTo(givenLastName);
        assertThat(person.getPesel()).isEqualTo(Optional.of(givenPesel));
    }

    @Test
    public void test3() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, givenPesel, givenSecondName);
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isEqualTo(givenName);
        assertThat(person.getLastName()).isEqualTo(givenLastName);
        assertThat(person.getPesel()).isEqualTo(Optional.of(givenPesel));
        assertThat(person.getSecondName()).isEqualTo(Optional.of(givenSecondName));
    }

    @Test
    public void test3WithoutPesel() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, null, givenSecondName);
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isEqualTo(givenName);
        assertThat(person.getLastName()).isEqualTo(givenLastName);
        assertThat(person.getPesel()).isEqualTo(Optional.empty());
        assertThat(person.getSecondName()).isEqualTo(Optional.of(givenSecondName));
    }

    @Test
    public void test4() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, givenPesel, givenSecondName, givenThirdName);
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isEqualTo(givenName);
        assertThat(person.getLastName()).isEqualTo(givenLastName);
        assertThat(person.getPesel()).isEqualTo(Optional.of(givenPesel));
        assertThat(person.getSecondName()).isEqualTo(Optional.of(givenSecondName));
        assertThat(person.getThirdName()).isEqualTo(Optional.of(givenThirdName));
    }

    @Test
    public void test4WithoutSecondName() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, givenPesel, null, givenThirdName);
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isEqualTo(givenName);
        assertThat(person.getLastName()).isEqualTo(givenLastName);
        assertThat(person.getPesel()).isEqualTo(Optional.of(givenPesel));
        assertThat(person.getSecondName()).isEqualTo(Optional.empty());
        assertThat(person.getThirdName()).isEqualTo(Optional.of(givenThirdName));
    }


    @Test
    public void test4WithouPeselAndSecondName() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, null, null, givenThirdName);
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isEqualTo(givenName);
        assertThat(person.getLastName()).isEqualTo(givenLastName);
        assertThat(person.getPesel()).isEqualTo(Optional.empty());
        assertThat(person.getSecondName()).isEqualTo(Optional.empty());
        assertThat(person.getThirdName()).isEqualTo(Optional.of(givenThirdName));
    }

    @Test
    public void test5() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, givenPesel, givenSecondName, givenThirdName, givenAddress);
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isEqualTo(givenName);
        assertThat(person.getLastName()).isEqualTo(givenLastName);
        assertThat(person.getPesel()).isEqualTo(Optional.of(givenPesel));
        assertThat(person.getSecondName()).isEqualTo(Optional.of(givenSecondName));
        assertThat(person.getThirdName()).isEqualTo(Optional.of(givenThirdName));
        assertThat(person.getAddress()).isEqualTo(Optional.of(givenAddress));
    }

    @Test
    public void test5withoutPesel() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, null, givenSecondName, givenThirdName, givenAddress);
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isEqualTo(givenName);
        assertThat(person.getLastName()).isEqualTo(givenLastName);
        assertThat(person.getPesel()).isEqualTo(Optional.empty());
        assertThat(person.getSecondName()).isEqualTo(Optional.of(givenSecondName));
        assertThat(person.getThirdName()).isEqualTo(Optional.of(givenThirdName));
        assertThat(person.getAddress()).isEqualTo(Optional.of(givenAddress));
    }

    @Test
    public void test5withoutPeselAndThirdName() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, null, givenSecondName, null, givenAddress);
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isEqualTo(givenName);
        assertThat(person.getLastName()).isEqualTo(givenLastName);
        assertThat(person.getPesel()).isEqualTo(Optional.empty());
        assertThat(person.getSecondName()).isEqualTo(Optional.of(givenSecondName));
        assertThat(person.getThirdName()).isEqualTo(Optional.empty());
        assertThat(person.getAddress()).isEqualTo(Optional.of(givenAddress));
    }

}