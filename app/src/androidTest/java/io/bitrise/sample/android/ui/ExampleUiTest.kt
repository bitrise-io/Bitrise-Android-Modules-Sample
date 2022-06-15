package io.bitrise.sample.android.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import io.bitrise.sample.android.MainActivity
import org.junit.Assert.fail
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class HelloWorldEspressoTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun helloWorldIsVisible() {
        // When running tests via the `adb` utility, it is possible to pass additional arguments
        // that are then usable within the test itself.
        //
        // This test includes an option to pass an argument to explicitly fail the test, which is
        // useful to verify that Steps handle test failures correctly.
        //
        // See the `adb` documentation for more information: https://developer.android.com/studio/command-line/adb#am
        val extraArguments = InstrumentationRegistry.getArguments()
        if (extraArguments.getString("FAIL_UI_TEST") == "true") {
            fail("Failing test due to `FAIL_UI_TEST` being set to `true`")
        }
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }
}
