package lesson1

import org.junit.Assert
import kotlin.test.Test

class TaskTestsJava : AbstractTaskTests() {

    @Test
    fun testSortTimes() {
        sortTimes { inputName, outputName -> JavaTasks.sortTimes(inputName, outputName) }
    }

    @Test
    fun testSortAddresses() {
        sortAddresses { inputName, outputName -> JavaTasks.sortAddresses(inputName, outputName) }
    }

    @Test
    fun testSortTemperatures() {
        sortTemperatures { inputName, outputName -> JavaTasks.sortTemperatures(inputName, outputName) }
    }

    @Test
    fun testSortSequence() {
        sortSequence { inputName, outputName -> JavaTasks.sortSequence(inputName, outputName) }
    }

    @Test
    fun testMergeArrays() {
        val result = arrayOf(null, null, null, null, null, 1, 3, 9, 13, 18, 23)
        JavaTasks.mergeArrays<Int>(arrayOf(4, 9, 15, 20, 23), result)
        Assert.assertArrayEquals(arrayOf(1, 3, 4, 9, 9, 13, 15, 18, 20, 23, 23), result)

        run {
            val (first, second, expectedResult) = generateArrays(20000, 20000)
            JavaTasks.mergeArrays<Int>(first, second)
            Assert.assertArrayEquals(expectedResult, second)
        }

        run {
            val (first, second, expectedResult) = generateArrays(500000, 500000)
            JavaTasks.mergeArrays<Int>(first, second)
            Assert.assertArrayEquals(expectedResult, second)
        }
    }
}