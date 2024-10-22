package lesson.lesson_29.persons;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

    @BeforeEach
    void setUp() {
        System.out.println("Method @BeforeEach");
    }

    /*
    @BeforeAll
    @AfterEach
    @AfterAll
    @Disabled
    */
    @Test
    public void testAddition() {
        System.out.println("Test Addition");

        int result = 2 + 2;

        Assertions.assertEquals(4, result);
        Assertions.assertNotEquals(5, result);
        Assertions.assertTrue(result >= 4);
        assertFalse(result > 5);
        assertNull(null);
        assertNotNull("String");
    }

    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Empty Test");
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    public void testFruits(String fruit) {
        System.out.println(fruit);
        assertTrue(fruit.length() > 2);
    }

}