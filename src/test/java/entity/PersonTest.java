package entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    @DisplayName("Create Person with valid fields")
    void creationPerson() {
        // given
        Person person = new Person();

        // when
        person.setName("John");
        person.setAge(1);

        // then
        Assertions.assertEquals("John", person.getName());
        Assertions.assertEquals(1, person.getAge());
    }

}