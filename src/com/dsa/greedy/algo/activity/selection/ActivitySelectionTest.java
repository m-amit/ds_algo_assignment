package com.dsa.greedy.algo.activity.selection;

import java.util.Arrays;
import java.util.List;

public class ActivitySelectionTest {
  public static void main(String[] args) {
    Activity activity1 = new Activity("activity1", 0,6);
    Activity activity2 = new Activity("activity2", 3,4);
    Activity activity3 = new Activity("activity3", 1,2);
    Activity activity4 = new Activity("activity4", 5,8);
    Activity activity5 = new Activity("activity5", 5,7);
    Activity activity6 = new Activity("activity6", 8,9);

    List<Activity> activities = Arrays.asList(activity1, activity2, activity3, activity4, activity5, activity6);

    ActivitySelection activitySelection = new ActivitySelection();
    activitySelection.doActivitySelection(activities);

  }
}
