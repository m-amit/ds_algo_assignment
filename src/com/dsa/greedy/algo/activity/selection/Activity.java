package com.dsa.greedy.algo.activity.selection;

public class Activity {
  private String name;
  private int startTime;
  private int finishTime;

  public Activity(String name, int startTime, int finishTime){
    this.name = name;
    this.startTime = startTime;
    this.finishTime = finishTime;
  }

  public String getName() {
    return name;
  }

  public int getStartTime() {
    return startTime;
  }

  public int getFinishTime() {
    return finishTime;
  }

  @Override public String toString() {
    final StringBuilder sb = new StringBuilder("Activity{");
    sb.append("name='").append(name).append('\'');
    sb.append(", startTime=").append(startTime);
    sb.append(", finishTime=").append(finishTime);
    sb.append('}');
    return sb.toString();
  }
}
