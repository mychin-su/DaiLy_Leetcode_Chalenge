package _SourceCode;

public class Grumpy_Bookstore_Owner_1052 {
  public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
    int n = grumpy.length;
    int current = 0;

    // Calculate the initially satisfied customers
    for(int i = 0; i < n; i++){
      if(grumpy[i] == 0){
        current += customers[i];
      }
    }

    // Calculate the maximum additional customers that can be satisfied
    int additionalSatisfied = 0;
    int maxAdditionalSatisfied = 0;

    // Initial window
    for(int i = 0; i < minutes; i++) {
      if(grumpy[i] == 1) {
        additionalSatisfied += customers[i];
      }
    }
    maxAdditionalSatisfied = additionalSatisfied;

    // Slide the window
    for(int i = minutes; i < n; i++) {
      if(grumpy[i] == 1) {
        additionalSatisfied += customers[i];
      }
      if(grumpy[i - minutes] == 1) {
        additionalSatisfied -= customers[i - minutes];
      }
      maxAdditionalSatisfied = Math.max(maxAdditionalSatisfied, additionalSatisfied);
    }

    return current + maxAdditionalSatisfied;
  }

  public static void main(String[] args) {
    int customers[] = {1, 0, 1, 2, 1, 1, 7, 5};
    int grumpy[] = {0, 1, 0, 1, 0, 1, 0, 1};
    int minutes = 3;
    System.out.println(maxSatisfied(customers, grumpy, minutes));
  }
}

