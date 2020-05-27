package com.dsa.greedy.algo.coin.change;

import java.util.Arrays;
import java.util.List;

public class CoinChangeTest {

  public static void main(String[] args) {
    List<Integer> coinCollection = Arrays.asList(1,2,5,10,20,50,100,200,500,1000);
    int amount = 395;
    CoinChange coinChange = new CoinChange();
    coinChange.getMeCoinNeeded(coinCollection, amount, true);
  }
}
