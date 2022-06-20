package io.bitrise.sample.android.instrumentation

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // When running tests via the `adb` utility, it is possible to pass additional arguments
        // that are then usable within the test itself.
        //
        // This test includes an option to pass an argument to explicitly fail the test, which is
        // useful to verify that Steps handle test failures correctly.
        //
        // See the `adb` documentation for more information: https://developer.android.com/studio/command-line/adb#am
        val extraArguments = InstrumentationRegistry.getArguments()
        if (extraArguments.getString("FAIL_UNIT_TEST") == "true") {
            fail("Failing test due to `FAIL_UNIT_TEST` being set to `true`")
        }

        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("io.bitrise.sample.android", appContext.packageName)
    }
}
