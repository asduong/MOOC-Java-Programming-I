
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            int spaces = size - i;
            printSpaces(spaces);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int fillerCounter = -1;
        for (int i = 1; i <= height; i++) {
            int spaces = height - i;
            int starCounter = fillerCounter + 2;
            printSpaces(spaces);
            printStars(starCounter);
            fillerCounter += 2;
            if(i == height) {
                printSpaces(height - 2);
                System.out.println("***");
                printSpaces(height - 2);
                System.out.println("***");
            }
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
