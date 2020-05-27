package com.dsa.greedy.algo.activity.selection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

  public void doActivitySelection(List<Activity> activityList){
    Comparator<Activity> activityComparator = Comparator.comparingInt(Activity::getFinishTime);
    Collections.sort(activityList, activityComparator);

    Activity act = activityList.get(0);

    System.out.println("Recommended activity to start "+ act);

    for (int i = 1; i < activityList.size(); i++) {
      Activity nextActivity = activityList.get(i);
      if(act.getFinishTime() < nextActivity.getStartTime()){
        System.out.println("Next activity would be "+nextActivity);
        act = nextActivity;
      }
    }
  }
}
