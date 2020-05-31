package io.github.gianpamx.mockmakerissue

import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import io.github.gianpamx.mylibrary.DummyInterface
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    private lateinit var scenario: ActivityScenario<MainActivity>

    @Before
    fun setUp() {
        val testApp = InstrumentationRegistry.getInstrumentation()
            .targetContext
            .applicationContext as DummyInterface
        Mockito.`when`(testApp.dummyObject().dummyMethod()).thenReturn("mock")

        scenario = launchActivity()
    }

    @After
    fun tearDown() {
        scenario.close()
    }

    @Test
    fun issue() {
        onView(withId(R.id.textView)).check(matches(withText("mock")))
    }
}
