package com.dsa.greedy.algo.fractional.knapsack;

public class Item {
  private String itemName;
  private int weight;
  private int value;
  private double density;

  public Item(String itemName, Integer weight, Integer value){
    this.itemName = itemName;
    this.weight = weight;
    this.value = value;
    this.density = (double) value / (double) weight;
  }

  public String getItemName() {
    return itemName;
  }

  public int getWeight() {
    return weight;
  }

  public int getValue() {
    return value;
  }

  public double getDensity() {
    return density;
  }

  @Override public String toString() {
    final StringBuilder sb = new StringBuilder("Item{");
    sb.append("itemName='").append(itemName).append('\'');
    sb.append(", weight=").append(weight);
    sb.append(", value=").append(value);
    sb.append(", density=").append(density);
    sb.append('}');
    return sb.toString();
  }
}
