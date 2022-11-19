package com.github.bgora;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

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
    }


    @Test
    public void test2() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, givenPesel);
        assertThat(person).isNotNull();
    }

    @Test
    public void test3() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, givenPesel, givenSecondName);
        assertThat(person).isNotNull();
    }

    @Test
    public void test3WithoutPesel() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, null, givenSecondName);
        assertThat(person).isNotNull();
    }

    @Test
    public void test4() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, givenPesel, givenSecondName, givenThirdName);
        assertThat(person).isNotNull();
    }

    @Test
    public void test4WithoutSecondName() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, givenPesel, null, givenThirdName);
        assertThat(person).isNotNull();
    }

    @Test
    public void test5() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, givenPesel, givenSecondName, givenThirdName);
        assertThat(person).isNotNull();
    }

    @Test
    public void test5WithouPeselAndSecondName() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, null, null, givenThirdName);
        assertThat(person).isNotNull();
    }

    @Test
    public void test6() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, givenPesel, givenSecondName, givenThirdName, givenAddress);
        assertThat(person).isNotNull();
    }

    @Test
    public void test6withoutPesel() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, null, givenSecondName, givenThirdName, givenAddress);
        assertThat(person).isNotNull();
    }

    @Test
    public void test6withoutPeselAndThirdName() {
        var person = new Person(LocalDate.now(), givenName, givenLastName, null, givenSecondName, null, givenAddress);
        assertThat(person).isNotNull();
    }

}