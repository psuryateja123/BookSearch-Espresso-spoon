package com.booksearch.com;

import android.os.SystemClock;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.codepath.android.booksearch.R;
import com.codepath.android.booksearch.activities.BookDetailActivity;
import com.codepath.android.booksearch.activities.BookListActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.pressKey;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by surya on 11/09/2016.
 */


@RunWith(AndroidJUnit4.class)

@Suite.SuiteClasses({SearchTest.class})
public class ApplicationTest {

}


