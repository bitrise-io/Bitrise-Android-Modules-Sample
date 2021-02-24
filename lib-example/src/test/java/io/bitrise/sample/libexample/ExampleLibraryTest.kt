package io.bitrise.sample.libexample

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleLibraryTest {

    @Test
    fun testLibraryEmptyInput() {
        val lib = ExampleLibrary()
        val output = lib.processInput("")
        assertFalse(output)
    }

    @Test
    fun testLibraryRealInput() {
        val lib = ExampleLibrary()
        val output = lib.processInput("test input")
        assertTrue(output)
    }

}