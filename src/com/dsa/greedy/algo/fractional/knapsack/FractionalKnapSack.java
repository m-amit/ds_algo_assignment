package com.dsa.greedy.algo.fractional.knapsack;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapSack {

  public void fillKnapSack(List<Item> items, int knapsackCapacity){
    Comparator<Item> itemComparator = Comparator.comparingDouble(Item::getDensity);
    Collections.sort(items, itemComparator);
    int itemPointer = 0;
    int totalValue = 0;
    while (knapsackCapacity != 0){
      Item item = items.get(itemPointer);
      if(item.getWeight() < knapsackCapacity){
        System.out.println("Added item to knnapSack is "+ item.getItemName() + "Of weight "+ item.getWeight());
        knapsackCapacity = knapsackCapacity - item.getWeight();
        totalValue += item.getValue();
      }else{
        int weight = knapsackCapacity;
        totalValue += weight * item.getDensity();
        knapsackCapacity = knapsackCapacity - weight;
        System.out.println("Added item to knnapSack is "+ item.getItemName() + "Of weight "+ weight);
      }
      System.out.println("Total value present in knapsack is "+ totalValue);
    }

  }
}
