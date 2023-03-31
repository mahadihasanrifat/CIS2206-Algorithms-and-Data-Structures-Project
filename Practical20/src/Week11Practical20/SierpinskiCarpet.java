package Week11Practical20;

import java.util.Scanner;

public class SierpinskiCarpet {
    static String [][] sierpinskiCarpet;
    static int size;

    // Constructor to initialize the 2D array of size "carpetSize" with "*" characters
    public SierpinskiCarpet(int carpetSize) {
        this.size = carpetSize;
        sierpinskiCarpet = new String[size][size];
        int i = 0;
        int j = 0;

        while(i<carpetSize) {
            j = 0;
            while(j<carpetSize) {
                this.sierpinskiCarpet[i][j]=" * ";
                j++;
            }
            i++;
        }
    }

    // Method to make an empty place at the center of the given 2D array "carpet"
    public static void makeEmptyPlace(int carpetSize, int a, int b) {
        int i = b+carpetSize/3;
        int j = 0;
        while(i <= b+2*(carpetSize/3)-1) {
            j = a+carpetSize/3;
            while(j <= a+2*(carpetSize/3)-1) {
                sierpinskiCarpet[i][j]="   ";
                j++;
            }
            i++;
        }
    }

    // Recursive method to create the Sierpinski Carpet pattern in the given 2D array "carpet"
    public static void create(String[][] carpet, int a,int b, int carpetSize)
    {
        makeEmptyPlace(carpetSize,a,b);

        if(carpetSize<=1) {
            return;
        }
        int i = 0;
        int j = 0;
        while(i<carpetSize) {
            j = 0;
            while(j<carpetSize) {
                create(carpet,i+b,j+a,carpetSize/3);
                j+=(carpetSize/3);
            }
            i+=(carpetSize/3);
        }

    }

    // Method to print the given 2D array "carpet"
    public static void print(int size){
        int i = 0;
        int j = 0;
        String printScreen="";
        while(i<size) {
            j = 0;
            printScreen="";
            while(j<size) {
                printScreen+=sierpinskiCarpet[i][j];
                j++;
            }
            System.out.println(printScreen);
            i++;
        }
    }

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the size of the Sierpinski Carpet from the user
        System.out.println("Enter a number to create the Sierpinski Carpet : ");
        int carpetSize = scanner.nextInt();

        // Print the size of the Sierpinski Carpet
        System.out.println("The size for creating the Sierpinski Carpet is "+carpetSize);

        // Print message indicating that the carpet is being initialized with "*" characters
        System.out.println("\nStar initialization is used to build the carpet.");

        // Print a line of Xs to separate the output
        System.out.println("----------X----------X----------X----------");

        // Create a new SierpinskiCarpet object with the specified size
        SierpinskiCarpet sierpinskiCarpetBoard = new SierpinskiCarpet(carpetSize);

        // Print the initial state of the Sierpinski Carpet
        print(carpetSize);

        // Print a line of Xs to separate the output
        System.out.println("----------X----------X----------X----------");

        // Print a message indicating that the Sierpinski Carpet is being created
        System.out.println("Making Sierpinski Carpet out of it");

        // Print another line of Xs to separate the output
        System.out.println("----------X----------X----------X----------");

        // Call the 'create' function to create the Sierpinski Carpet
        create(sierpinskiCarpet,0,0,carpetSize);

        // Print the final state of the Sierpinski Carpet
        print(carpetSize);

        // Print another line of Xs to separate the output
        System.out.println("----------X----------X----------X----------");
    }
}