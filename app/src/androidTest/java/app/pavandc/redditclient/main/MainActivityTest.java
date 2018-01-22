package app.pavandc.redditclient.main;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.IdlingRegistry;
import android.support.test.espresso.IdlingResource;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import app.pavandc.redditclient.R;
import app.pavandc.redditclient.activities.MainActivity;
import app.pavandc.redditclient.utils.ViewVisibilityIdlingResource;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by pavandc on 2018-01-21.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class, true, true);

    @Test
    public void checkIfListIsSeen() {
        assertViewDisplayed(R.id.recycler_view_posts);
    }

    @Test
    public void scrollList() {
        assertViewDisplayed(R.id.recycler_view_posts);
        Espresso.onView(withId(R.id.recycler_view_posts))
                .perform(RecyclerViewActions.scrollToPosition(6));
    }


    private void assertViewDisplayed(int id) {
        IdlingResource idlingResource = new ViewVisibilityIdlingResource(id);
        IdlingRegistry.getInstance().register(idlingResource);
        Espresso.onView(withId(id)).check(matches(isDisplayed()));
        IdlingRegistry.getInstance().unregister(idlingResource);
    }
}
