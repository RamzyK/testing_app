package com.example.androidtestingapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class SecondActivityTest {


    @Test
    fun test_isActivityInView() {
        val activityScenario: ActivityScenario<SecondActivity> = ActivityScenario.launch(SecondActivity::class.java)
        onView(withId(R.id.constraint_layout_second_activity)).check(matches(isDisplayed()))
    }
}