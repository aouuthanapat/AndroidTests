package com.example.apiapplication;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class DetailsActivityUITest {

    @Before
    public void setUp() {
        // Запускаем активити MainActivity
        ActivityScenario.launch(MainActivity.class);
    }

    @Test
    public void testScreenDetailsActivityOpens() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Espresso.onView(ViewMatchers.withId(R.id.recycler_main))
                .perform(RecyclerViewActions.actionOnItemAtPosition(0, ViewActions.click()));

        // Проверка, что поля отображаются
        Espresso.onView(ViewMatchers.withId(R.id.text_detail_author))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.text_detail_detail))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.text_detail_content))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.text_detail_title))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}