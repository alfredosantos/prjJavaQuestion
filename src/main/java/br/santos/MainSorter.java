package br.santos;

import static java.util.concurrent.TimeUnit.MICROSECONDS;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainSorter {

  public static void main(String... args) {

    // TODO, increase size as needed
    // TODO later improve to read it from a resource file
    int[] inputArray = { 99, 100, 210, 1, 3, 2, 5, 4, 0, 6, 9, 8, 7};

    // print only in debug mode.
    if(log.isDebugEnabled() == true) {
      for (int x = 0; x < inputArray.length; x++) {
        log.debug("Sort input:	" + inputArray[x]);
      }
    }

    runBubbleSort(inputArray);
    //  TODO other styles
    // runOtherSort2(inputArray);
    // runOtherSort3(inputArray);

  }

  /**
   * Runs bubble sort and logs time it took to run
   * @param inputArray contains array of integers
   */
  private static void runBubbleSort(final int[] inputArray) {

    BubbleSort bubbleSort = new BubbleSort();
    // start clocking
    Stopwatch stopwatch = Stopwatch.createStarted();
    // bubble sort
    int[] outputArray = bubbleSort.sorter(inputArray);
    stopwatch.stop(); // stop clocking, optional
    for (int x = 0; x < inputArray.length; x++) {
      log.info("Sort output: " + outputArray[x]);
    }
    log.info(String.format("It took: %d microseconds to run bubble sort for array size of %d",
        stopwatch.elapsed(MICROSECONDS),
        inputArray.length));
  }
}