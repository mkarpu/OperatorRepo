//import java.util.*;

/*import java.util.Scanner;

public class FirstMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int a = sc.nextInt();
        System.out.println("Enter second integer: ");
        int b = sc.nextInt();

        FirstProgram FP = new FirstProgram(a, b);
        System.out.println("add is" +FP.add());
        System.out.println("sub is" +FP.sub());
    }
}

public class FirstMain{

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        if(x>y){
            System.out.println("x is greater than y");
        }
        else{
            System.out.println("x is less than y");
        }
    }
}
public class FirstMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Entered number is even");
        }
        else if (number % 3 == 0) {
            System.out.println("Entered number is odd");
        }
        else {
            System.out.println("Entered number is not even");
        }
    }
}

class FirstMain{
    public static void main(String[] args) {
        for( int i = 1; i <= 5; i++){
            System.out.println("Number : " +i);
        }
    }
}

public class FirstMain {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}

import java.util.Scanner;

public class FirstMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my LIST");
        System.out.println("1 . Breaking Bad");
        System.out.println("2 . Prison Break");
        System.out.println("3 . LOST");
        System.out.println("4 . Walking dead");

        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Welcome to Breaking Bad");
                break;
            case 2:
                System.out.println("Welcome to Prison Break");
                break;
            case 3:
                System.out.println("Welcome to LOST");
                break;
            case 4:
                System.out.println("Welcome to Walking Dead");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }
}
public class FirstMain{
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        System.out.println(list[0]);
        System.out.println(list[4]);
    }
}

public class FirstMain{
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};

            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        }
    }
public class FirstMain {
    public static void main(String[] args) {
        System.out.println("This is 2D array");
        int[][] numbers = {{1,2},{3,4},{5,6}};

        for(int i=0;i<numbers.length; i++){
        for(int j=0;j<numbers[i].length;j++){
            System.out.println(numbers[i][j] +"Arrays");
        }
        //System.out.println(Arrays.deepToString(numbers));
    }
}}

public class FirstMain {
    public static void main(String[] args) {
        int[][][] numbers = {
                {
                        {1,2,3}
                },
                {
                    {4,5,6},
                }
        };
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                for(int k=0;k<numbers[i][j].length;k++){
                    System.out.println(numbers[i][j][k] + " 3d array");
                }
            }
        }
    }
}
public class FirstMain{
    public static void main(String[] args){
        ArrayList<Integer> Types = new ArrayList<>();

        Types.add(10);
        Types.add(20);
        Types.add(30);
        //System.out.println("ArrayList is " + Types.deepToString(Types));
        System.out.println(Arrays.toString(Types.toArray()));

        int first = Types.get(0);
        System.out.println(first +"  First element");

        Types.add(1,90);
        System.out.println(Arrays.toString(Types.toArray()));

        Types.remove(2);
        System.out.println(Arrays.toString(Types.toArray()));

    }
}
public class FirstMain {
    public static void main(String[] args) {
        // Creating a LinkedList to store Integer values
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        // Iterating through the LinkedList using a traditional for loop
        System.out.println("Iterating through the LinkedList with a for loop:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));

            Collections.reverse(linkedList);
            System.out.println();// Access each element by index
        }
    }
}
public class FirstMain{
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
        list.add("hi");
        list.add("hello");
        list.add("how");
        list.add("why");

        for(String i : list){
            System.out.println(i);
        }
    }
}

public class FirstMain{
    public static void main(String[] args){
        HashMap<String, Integer> list = new HashMap<>();
        list.put("a", 1);
        list.put("b", 2);
        list.put("c", 3);

        System.out.println(list);

        list.put("d" , 3);
        System.out.println(list);

        list.remove("d");
        System.out.println(list);

        System.out.println(list.size() +"  This is the size of the list");
    }
}

import java.util.TreeMap;

public class FirstMain {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Bob", 30);
        map.put("Alice", 30);
        map.put("Bob", 35);

        System.out.println(map);  // Sorted order based on keys
    }
}

class First {
    private int[] stack;
    private int top;
    private int capacity;

    public First(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot add " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed onto stack");
        }
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }
    public boolean isEmpty() {
        return top == -1;
    }
}

public class FirstMain {
    public static void main(String[] args) {
        First stack = new First(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Top element after pop: " + stack.peek());
    }
}*/
//public class FirstMain {
//    int stack[];
//    int capacity;
//    int top;
//
//    public FirstMain(int capacity) {
//        this.stack = new int[capacity];
//        this.capacity = capacity;
//        this.top = -1;
//    }
//    public static void main(String[] args) {
//        FirstMain firstMain = new FirstMain(4);
//        firstMain.stack[0] = 1;
//        firstMain.stack[1] = 2;
//        firstMain.stack[2] = 3;
//        firstMain.stack[3] = 4;
//
//        System.out.println(firstMain.stack[firstMain.top]);
//    }
//}

/*public class FirstMain {
    private int[] stack;
    private int capacity;
    private int top;

    public FirstMain(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }
    public void push(int value){
        if(top == capacity-1){
            System.out.println("Stack is full");
        }
        else{
            stack[++top] = value;
            System.out.println("Stack is still accepting the values");
        }
    }
}
import java.util.PriorityQueue;
import java.util.Comparator;

public class FirstMain {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(3);
        maxHeap.add(2);
        maxHeap.add(4);

        System.out.println("Max-Heap PriorityQueue: " + maxHeap);
        System.out.println("Polled: " + maxHeap.poll()); // 5
        System.out.println("Polled: " + maxHeap.poll());
        System.out.println("Polled: " + maxHeap.poll());
    }
}

class First {
//    int a, b, c;

    public int add(int a, int b) {
        return a + b;
    }
    public void add2(int a, int b, int c) {
        System.out.println("Three parameters   " +  (  a + b + c));
    }
    public void add(int a, int b, int c, int d) {
        System.out.println("Fourth parameters " +  (a + b + c + d));
    }
}
public class FirstMain{
        public static void main(String[] args) {
            First first = new First();
            int result = first.add(1, 2);
            System.out.println(result);
            first.add2(3, 4, 5);
            first.add(5, 6, 7, 4);
        }
}

//Same method name but different parameters can perform Operator Overloading
public class FirstMain{
    public void calc(int a, double b){
        double c=a+b;
        System.out.println("Two datatypes" +c);
    }
    public void  calc(double a, int b){
        double c=a+b;
        System.out.println("Two opposite datatypes" +c);
    }
    public static void main(String[] args) {
        FirstMain obj = new FirstMain();
        obj.calc(2.2,2);
        obj.calc(3.6,5);
        obj.calc(3,2.0);
    }
}
class Animal{
    public void Dog(){
        System.out.println("BOW BOW");
    }
}
class Cat extends Animal{
    @Override
    public void Dog(){
        System.out.println("This Dog is dangerous");
    }
}
class Mouse extends Animal{
    public void Rat(){
        System.out.println("This is Rat");
    }
    public void Dog(){
        System.out.println("This Dog is not dangerous");
    }
}
public class FirstMain{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.Dog();
        Mouse m = new Mouse();
        m.Rat();
        m.Dog();
        Cat c = new Cat();
        c.Dog();

    }
}*/




