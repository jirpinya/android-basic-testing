package cc.somkiat.basicunittesting;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import cc.somkiat.basicunittesting.Controller.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    ViewInteraction saveButton = onView(withId(R.id.saveButton));
    ViewInteraction revertButton = onView(withId(R.id.revertButton));
    ViewInteraction userNameInput = onView(withId(R.id.userNameInput));
    ViewInteraction emailInput = onView(withId(R.id.emailInput));

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    //RevertClick
    @Test
    public void revertClickTest() {
        revertButton.perform(click());
        onView(withId(R.id.userNameInput)).check(matches(withText("")));
        onView(withId(R.id.emailInput)).check(matches(withText("")));
    }

    //Valid Name and Email
    @Test
    public void success() {
        userNameInput.perform(replaceText("JIRAPINYA"), closeSoftKeyboard());
        emailInput.perform(replaceText("eiei@gmail.com"), closeSoftKeyboard());
        saveButton.perform(click());
        onView(withText("Success!!")).
                inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).
                check(matches(isDisplayed()));
    }

    //------------------------- SAVE FAIL -------------------------//

    //Name is empty.
    @Test
    public void saveFailNameIsEmpty(){
        userNameInput.perform(replaceText(""), closeSoftKeyboard());
        emailInput.perform(replaceText("eiei@gmail.com"), closeSoftKeyboard());
        saveButton.perform(click());
        onView(withText("Fail!!! Name is empty.")).
                inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).
                check(matches(isDisplayed()));
    }

    //Name is specials alphabet.
    @Test
    public void saveFailNameHaveSpecialsAlphabet() {
        userNameInput.perform(replaceText("@>N.S<@"), closeSoftKeyboard());
        emailInput.perform(replaceText("eiei@gmail.com"), closeSoftKeyboard());
        saveButton.perform(click());
        onView(withText("Fail!!! Name is specials alphabet.")).
                inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).
                check(matches(isDisplayed()));
    }

    //Name contain number.
    @Test
    public void saveFailNameContainNumber(){
        userNameInput.perform(replaceText("12123saii12121"), closeSoftKeyboard());
        emailInput.perform(replaceText("eiei@gmail.com"), closeSoftKeyboard());
        saveButton.perform(click());
        onView(withText("Fail!!! Name contain number.")).
                inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).
                check(matches(isDisplayed()));
    }

    //Name is less than 5.
    @Test
    public void saveFailNameIsLessThanFive(){
        userNameInput.perform(replaceText("Hii"), closeSoftKeyboard());
        emailInput.perform(replaceText("eiei@gmail.com"), closeSoftKeyboard());
        saveButton.perform(click());
        onView(withText("Fail!!! Name is less than 5.")).
                inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).
                check(matches(isDisplayed()));
    }

    //Name is more than 20.
    @Test
    public void saveFailNameIsMoreThanTwenty(){
        userNameInput.perform(replaceText("abcdefghijklmnopqrstwvxyz"), closeSoftKeyboard());
        emailInput.perform(replaceText("eiei@gmail.com"), closeSoftKeyboard());
        saveButton.perform(click());
        onView(withText("Fail!!! Name is more than 20.")).
                inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).
                check(matches(isDisplayed()));
    }

    //------------------------- EMAIL FAIL -------------------------//

    //Email is empty.
    @Test
    public void saveFailEmailIsEmpty(){
        userNameInput.perform(replaceText("MOBILE"), closeSoftKeyboard());
        emailInput.perform(replaceText(""), closeSoftKeyboard());
        saveButton.perform(click());
        onView(withText("Fail!!! Email is empty.")).
                inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).
                check(matches(isDisplayed()));
    }

    //Email is not pattern.
    @Test
    public void saveFailEmailIsNotPattern(){
        userNameInput.perform(replaceText("MOBILE"), closeSoftKeyboard());
        emailInput.perform(replaceText("---%%%555@gmail.com"), closeSoftKeyboard());
        saveButton.perform(click());
        onView(withText("Fail!!! Email is not pattern.")).
                inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).
                check(matches(isDisplayed()));
    }
}

