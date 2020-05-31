package io.github.gianpamx.mylibrary

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito

@RunWith(AndroidJUnit4::class)
class MainFragmentTest {
    @Before
    fun setUp() {
        val testApp = InstrumentationRegistry.getInstrumentation()
            .targetContext
            .applicationContext as DummyInterface
        Mockito.`when`(testApp.dummyObject().dummyMethod()).thenReturn("mock")
    }


    @Test
    fun issue() {
        launchFragmentInContainer<MainFragment>(themeResId = R.style.Theme_AppCompat)

        onView(withId(R.id.textView)).check(matches(withText("mock")))
    }
}
