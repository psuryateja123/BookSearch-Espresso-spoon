package com.booksearch.com;

import android.os.SystemClock;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.KeyEvent;

import com.codepath.android.booksearch.R;
import com.codepath.android.booksearch.activities.BookListActivity;
//import com.squareup.spoon.Spoon;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringStartsWith.startsWith;

/**
 * Created by surya on 11/09/2016.
 */

@RunWith(AndroidJUnit4.class)
public class SearchTest {


    @Rule
    public ActivityTestRule<BookListActivity> activityRule = new ActivityTestRule<>(BookListActivity.class);
    BookListActivity activity = activityRule.getActivity();


    @Test
    public void ClickingSearch() {
        onView(withId(R.id.search_button)).perform(click()); // to perform click on the search icon
        SystemClock.sleep(5000); // wait

        // below is for entering the title of the book (test) and pressing on ENTER from the device keyboard to search the book.
        onView(withId(R.id.search_src_text)).check(matches(isDisplayed())).perform(typeText("test"), click(), ViewActions.pressKey(KeyEvent.KEYCODE_ENTER));

        // clicking on the book with title Test ISBN
        onView(withText("Test ISBN")).check(matches(isDisplayed())).perform(click());
        SystemClock.sleep(5000);


    }

    }



