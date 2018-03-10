import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MatrixSort {

  public static void main(String[] args) {
    System.out.println("Starting...");
    teste1();
  }

  private static void teste1() {
    int[][] matrix = {
        { 1, 3, 2, 5, 4, 0, 6, 9, 8, 7}
    };
    int[][] sort = new int [1][10];

    long begin = System.currentTimeMillis();
    int total = 9;
    int add = 1;

    sort = matrix;
    for (int i = 0; i < total ; i++) {
      add = 1;

      for (int x = 0; x < total; x++) {
          if (sort[0][add] < sort[0][x]) {
            int less;
            int bigger;
            less = sort[0][x];
            bigger = sort[0][add];
            sort[0][x] = bigger;
            sort[0][add] = less;
            add++;
          }else{
            add++;
          }
        }

    }

    long end = System.currentTimeMillis();
    double time = (end - begin) / 1000.0;
    for (int x = 0; x < 10; x++) {
      System.out.println("Sort out:	" + sort[0][x]);
    }
    System.out.println("Time ArrayListSort:	" + time);
  }
}