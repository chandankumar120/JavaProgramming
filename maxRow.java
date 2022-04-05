import java.util.Scanner;

public class maxRow {

  public static void main(String[] args) {
    int count = 0, maxrow = 0, max = 0;
    int ar[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("This is 3*3 matrix");
    System.out.println("Enter Element of the array in 0 1 Format");

    //User Input
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        ar[i][j] = sc.nextInt();
      }
    }
    sc.close();

    //Checking Conditions
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (ar[i][j] == 1) {
          count++;
        }
      }
      if (count > maxrow) {
        maxrow = count;
        count = 0;
        max = i + 1;
      }
    }
    System.out.println("largest 1 element in " + max + " row");
  }
}
