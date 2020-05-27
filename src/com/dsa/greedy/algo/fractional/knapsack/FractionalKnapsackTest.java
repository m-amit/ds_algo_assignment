package com.dsa.greedy.algo.fractional.knapsack;

import java.util.Arrays;
import java.util.List;

public class FractionalKnapsackTest {
  public static void main(String[] args) {
    Item item = new Item("item-1", 6,6);
    Item item1 = new Item("item-2", 10,2);
    Item item2 = new Item("item-3", 3,1);
    Item item3 = new Item("item-4", 5,8);
    Item item4 = new Item("item-5", 1,3);
    Item item5 = new Item("item-6", 3,5);
    List<Item> itemList = Arrays.asList(item, item1, item2, item3, item4, item5);
    FractionalKnapSack fractionalKnapSack = new FractionalKnapSack();
    fractionalKnapSack.fillKnapSack(itemList, 50);
  }
}
