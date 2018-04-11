package br.santos;

public class InsertionSort implements Sort {

  @Override
  public int[] sorter(int[] inputArray) {
    if (inputArray.length == 0) {
      return inputArray;
    }

    int total = inputArray.length - 1;
    int add;

    for (int i = 0; i < total; i++) {
      add = 1;
      for (int x = 0; x < total; x++) {
        if (inputArray[add] < inputArray[x]) {
          int less;
          int bigger;
          less = inputArray[x];
          bigger = inputArray[add];
          inputArray[x] = bigger;
          inputArray[add] = less;
          add++;
        } else {
          add++;
        }
      }
    }
    return inputArray;
  }
}