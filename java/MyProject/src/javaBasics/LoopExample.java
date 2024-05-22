package javaBasics;

public class LoopExample {
    public static void main(String[] args) {
//        we use for loop when we know the termination point of the program
//        printing numbers from 1 to 10
        System.out.println("for loop");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("-------");
        System.out.println("for loop in reverse order");
        for(int i=10;i>0;i--){
            System.out.println(i);
        }

//        while loop is also called as entry control loop
//        when you don't know how many times the loop is going to run
        System.out.println("-------");
        System.out.println("while loop");
        int i = 4;
        while(i<=10){
            System.out.println(i);
            i++;
        }

//        do while loop is also called as exit control loop
        System.out.println("-------");
        System.out.println("do-while loop");
        int j = 0;
        do{
            System.out.println(j);    //run this code block
            j++;
        }
        while(j<=10);                //while this condition holds true
//        controlling the loop at the point of exit

        System.out.println("-------");
        System.out.println("for each loop");
        int[] numArr = {12, 1, 56, 13};
//        new var x should be of the type of elements present in array
        for (int n : numArr){
            System.out.println(n);
        }
        System.out.println("-------");
        System.out.println("for-each loop");
        System.out.println("To print the sum of all the elements present in the array");
        int s = 0;
        for(int n : numArr){
            s = s + n;
        }
        System.out.println("The sum of the array is : "+ s);

        System.out.println("-------");

    }
}


