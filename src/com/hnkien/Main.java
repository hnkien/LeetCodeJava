package com.hnkien;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

import com.hnkien.Heap;

public class Main {
    public static void main(String[] args) {
//        LeetCode63_MaxSubArray.runTest();
        LeetCode122_BestTimeBuySellStock2.runTest();
//        LeetCode121_BestTimeBuySellStock.runTest();
//        Parser.runTest();
////        Create dequeue as Stack
//        // Creating Deque using the ArrayDeque class
//        Deque<Integer> numbers = new ArrayDeque<>();
//
//        // add elements to the Deque
//        numbers.offer(1);
//        numbers.offerLast(2);
//        numbers.offerFirst(3);
//        System.out.println("Deque: " + numbers);
//
//        // Access elements of the Deque
//        int firstElement = numbers.peekFirst();
//        System.out.println("First Element: " + firstElement);
//
//        int lastElement = numbers.peekLast();
//        System.out.println("Last Element: " + lastElement);
//
//        // Remove elements from the Deque
//        int removedNumber1 = numbers.pollFirst();
//        System.out.println("Removed First Element: " + removedNumber1);
//
//        int removedNumber2 = numbers.pollLast();
//        System.out.println("Removed Last Element: " + removedNumber2);
//
//        System.out.println("Updated Deque: " + numbers);

//        // Creating a priority queue
//        PriorityQueue<Integer> numbers = new PriorityQueue<>(new CustomComparator());
//        numbers.add(4);
//        numbers.add(2);
//        numbers.add(1);
//        numbers.add(3);
//        System.out.print("PriorityQueue: " + numbers);


//        // Creating a priority queue
//        PriorityQueue<Integer> numbers = new PriorityQueue<>();
//        numbers.add(4);
//        numbers.add(2);
//        numbers.add(1);
//        System.out.print("PriorityQueue using iterator(): ");
//
//        //Using the iterator() method
//        Iterator<Integer> iterate = numbers.iterator();
//        while(iterate.hasNext()) {
//            System.out.print(iterate.next());
//            System.out.print(", ");
//        }

//        // Creating a priority queue
//        PriorityQueue<Integer> numbers = new PriorityQueue<>();
//
//        // Using the add() method
//        numbers.add(4);
//        numbers.add(2);
//        System.out.println("PriorityQueue: " + numbers);
//
//        // Using the offer() method
//        numbers.offer(1);
//        System.out.println("Updated PriorityQueue: " + numbers);



//        // Creating Queue using the LinkedList class
//        Queue<Integer> numbers = new LinkedList<>();
//
//        // offer elements to the Queue
//        numbers.offer(1);
//        numbers.offer(2);
//        numbers.offer(3);
//        System.out.println("Queue: " + numbers);
//
//        // Access elements of the Queue
//        int accessedNumber = numbers.peek();
//        System.out.println("Accessed Element: " + accessedNumber);
//
//        // Remove elements from the Queue
//        int removedNumber = numbers.poll();
//        System.out.println("Removed Element: " + removedNumber);
//        System.out.println("Updated Queue: " + numbers);
//


//        // create ArrayList
//        ArrayList<String> languages = new ArrayList<>();
//
//        // add() method without the index parameter
//        languages.add("Java");
//        languages.add("C");
//        languages.add("Python");
//        System.out.println("ArrayList: " + languages);
//
//        // add() method with the index parameter
//        languages.add(1, "JavaScript");
//        System.out.println("Updated ArrayList: " + languages);


//        String s = "Hello World Everyone";
//        String s1= s.substring(6,12);
//        System.out.println(s1);
//        System.out.println(s.length());

//        String s = "Hello World";
//        char[] arr_c = new char[s.length()];
//        for (int i=0; i<s.length(); i++) arr_c[i]=s.charAt(i);
//        for (char c: arr_c) System.out.println(c);

//        int[] arr = {2,3,1,6,4,7};
//        Sorting.insertionSort(arr);
//        for(int a : arr) {
//            System.out.print(a);
//            System.out.print(" ");
//        }
//        System.out.println();

//        int[] arr = {2,3,1,6,4,7};
//        Sorting.quickSort(arr,0,arr.length-1);
//        for(int a : arr) {
//            System.out.print(a);
//            System.out.print(" ");
//        }
//        System.out.println();

//        int[] arr = {2,3,1,6,4,7};
//        Sorting.selectionSort(arr);
//        for(int a : arr) {
//            System.out.print(a);
//            System.out.print(" ");
//        }
//        System.out.println();



//        ArrayList<Integer> array = new ArrayList<Integer>();
//        int size = array.size();
//
//        Heap h = new Heap();
//        h.insert(array, 3);
//        h.insert(array, 4);
//        h.insert(array, 9);
//        h.insert(array, 5);
//        h.insert(array, 2);
//
//        System.out.println("Max-Heap array: ");
//        h.printArray(array, size);
//
//        h.deleteNode(array, 4);
//        System.out.println("After deleting an element: ");
//        h.printArray(array, size);


//        System.out.println("Hello World!");
//        int a = 5 / 2;
//        float b = (float) 10 / 3;
//        float c = -2.345f;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

//        int myarray[][] = new int[][]{
//                            new int[]{1, 2, 3},
//                            new int[]{4, 5, 6, 7},
//                            new int[]{8, 9},
//                            };
//
//        for (int i=0; i < myarray.length; i++) {
//            for (int j=0; j< myarray[i].length; j++) {
//                System.out.print(myarray[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//
//        // Declaring 2-D array with 4 rows
//        int intArray[][] = new int[4][];
//        // create a jagged array
//        intArray[0] = new int[3];
//        intArray[1] = new int[2];
//        intArray[2] = new int[1];
//        intArray[3] = new int[4];
//
//        // Initializing array with values
//        for (int i=0; i< intArray.length; i++)
//        for(int j=0; j < intArray[i].length; j++)
//        intArray[i][j] = (i+1) * (j+1);         //initial values for each row,column
//
//        // display the contents of 2-D jagged array
//        System.out.println("Two-dimensional Jagged Array:");
//        for (int i=0; i<intArray.length; i++)
//        {
//            for (int j=0; j<intArray[i].length; j++)
//            System.out.print(intArray[i][j] + " ");
//            System.out.println();
//        }

//        String s = "Cộng Hoà";
//        char c = s.charAt(0);
//        System.out.println(c);

//        char d = s.charAt(13);
//        System.out.println(d);

//        byte[] a = s.getBytes(StandardCharsets.UTF_8);
//        System.out.println(a);
//        System.out.println(a.length);
//        for (byte b : a) {
//            System.out.print(b);
//            System.out.print(" ");
//        }
//        String string = new String(a);
//        System.out.println(string);


//        String str = "geekss@for@geekss";
//        String[] arrOfStr = str.split("@", 2);
//
//        for (String a : arrOfStr)
//            System.out.println(a);





    }
}
