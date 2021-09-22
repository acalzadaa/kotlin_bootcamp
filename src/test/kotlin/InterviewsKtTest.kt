import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class InterviewsKtTest {

    @Test
    fun loveFun() {
        Assertions.assertTrue(loveFun(4, 3))
    }

    @Test
    fun isNumberDivisible() {
        Assertions.assertTrue(isNumberDivisible(25, 5))
        Assertions.assertFalse(isNumberDivisible(25, 4))
    }

    @Test
    fun isPrime() {
        Assertions.assertTrue(isPrime(2))
        Assertions.assertTrue(isPrime(3))
        Assertions.assertTrue(isPrime(5))
        Assertions.assertTrue(isPrime(7))

        Assertions.assertFalse(isPrime(4))
        Assertions.assertFalse(isPrime(6))

    }

    @Test
    fun divideIfWhole() {
        Assertions.assertNotNull(divideIfWhole(10,5))
        Assertions.assertNull(divideIfWhole(10,6))
    }

    @Test
    fun feast() {
        assertEquals(true, feast("great blue heron", "garlic naan"))
        assertEquals(true, feast("chickadee", "chocolate cake"))
        assertEquals(false, feast("brown bear", "bear claw"))
        assertEquals(true, feast("marmot", "mulberry tart"))
        assertEquals(true, feast("porcupine", "pie"))
        assertEquals(false, feast("electric eel", "lasagna"))
        assertEquals(true, feast("slow loris", "salsas"))
        assertEquals(true, feast("ox", "orange lox"))
        assertEquals(true, feast("blue-footed booby", "blueberry"))
    }
}