package lesson1.task2.tests

import lesson1.task2.*
import kotlin.test.*
import org.junit.Test
import org.junit.Assert

class TestFunctions() {
    @Test fun collection() {
        Assert.assertEquals("[1, 2, 3, 42, 555]", toJSON(listOf(1, 2, 3, 42, 555)))
    }
}