package com.example.androidtestingapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @Test
    fun test_isMainActivityDisplaying() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.constraint_layout_main_activity)).check(matches(isDisplayed()))
    }

    @Test
    fun test_isMainActivityCentralButtonDisplaying(){
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.second_activity_btn)).check(matches(isDisplayed()))

        onView(withId(R.id.second_activity_btn)).check(
            matches(withText(R.string.main_activity_central_button_launch_second_activity_text))
        )
    }

    @Test
    fun test_navigationToSecondActivity() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.second_activity_btn)).perform(click())

        onView(withId(R.id.constraint_layout_second_activity)).check((matches(isDisplayed())))
    }


}