package com.dsa.greedy.algo.coin.change;

import java.util.Collections;
import java.util.List;

public class CoinChange {

  public void getMeCoinNeeded(List<Integer> coinsAvailable, int amount, boolean coinsAreSorted){
    if(amount <= 0){
      System.out.println("Amount is zero or negative");
      return;
    }
    if(!coinsAreSorted){
      Collections.sort(coinsAvailable);
    }
    int biggestCoinNearToAmount = coinsAvailable.size()-1;
    System.out.println("Required coins are ==>> ");
    while (amount != 0){
      if(coinsAvailable.get(biggestCoinNearToAmount) <= amount){
        amount = amount - coinsAvailable.get(biggestCoinNearToAmount);
        System.out.print(coinsAvailable.get(biggestCoinNearToAmount) + ", ");
        continue;
      }
      biggestCoinNearToAmount--;
    }
  }
}
