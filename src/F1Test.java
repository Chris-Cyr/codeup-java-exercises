import java.util.ArrayList;
import java.util.Arrays;

public class F1Test {
    public static void main(String[] args) {
        printFooBarBaz();
        System.out.println(reverseCharacters("Popeye the sailor Man"));
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        inputList.add(5);
        inputList.add(6);
        inputList.add(7);
        System.out.println(balancedTree((inputList)));
    }

    //
//    problem 0 
//            -----------------------------------
//    produce a system that can vary its output based upon a specific count.  This output should vary depending on if the count is current at 2, 3 or 6 any number divisible thereby.  If the count is not at a number divisible by 2, 3 or 6 it should print the counter, otherwise print foo when the count is divisible by 2, print bar when its divisible by 3 or print baz when its divisible by 6.  This cannot be hard coded, please generate a function that does this.  The system in theory counts forever printing values, but you don’t have to worry about memory management or anything like that.
//
//    expected output:
//            1
//    foo
//            bar
//    foo
//5
//    baz
//7
//    foo
//            bar
//    foo
//11
//        .
//        .
//        .
//    //method to implment
    //TIME STAMP: 21:35 -- 21:42
    public static void printFooBarBaz() {
        for (int i = 1; i < 100; i++) {
            if (i % 6 == 0) {
                System.out.println("baz");
            } else if (i % 3 == 0) {
                System.out.println("bar");
            } else if (i % 2 == 0) {
                System.out.println("foo");
            } else {
                System.out.println(i);
            }
        }
    }

    //   
//
//
//
//
//
//         problem 1 
//            -----------------------------------
//    given a sentence, please reverse the characters within the sentence while leaving the words in the sentence. You can assume all characters are standard UTF-8 and you can ignore punctuation.  You can also assume for simplicity that you can fit the entire sentence in memory.  Lastly for simplicity, you can assume that there will only ever be one space between each word (so you don't have to worry about mismatched amounts of white space).
//
//            example
//            input: "the cat is fat"
//            output: "eht tac si taf"
//
//            input: "band camp is great!"
//            output: "dnab pmac si !taerg"
//
////method to implment
    //TIMESTAMP 21:44-21:47
    public static String reverseCharacters(String input) {
        char[] in = input.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

//
//    problem 2
//            -----------------------------------
//    given a sorted array list of integers, please create a balanced binary tree.  note that you can use the following helper class if you would like.  You should return the root of the tree as your result.
//
//    input: [1,2,3,4,5,6,7]
//    output: 4
//                      /   \
//                     2    6
//                    / \    / \
//                   1  3 5   7 
//               (you would return the node with a value of 4)
//
////helper class   
//    public Node {
//        public int value;
//        public Node left;
//        public Node right;
//
//public Node(int v, Node l, Node r) {
//            this.value = v;
//            this.left = l;
//            this.right = r;
//        }
//    }
//
//    //method to implement
    //TIMESTAMP 21:48-22:35
    public static class Node {

        public Node left;
        public Node right;
        int data;

        Node(int d) {
            data = d;
        }
    }

    public static Node balancedTree (ArrayList<Integer> inputList) {
        return helper(inputList, 0, inputList.size() - 1);
    }

     public static Node helper(ArrayList<Integer> inputList, int low, int high){
        if (low > high) {
            return null;
        }

        int mid = low + (high - low) / 2;

        Node root = new Node(inputList.get(mid));

        root.left = helper(inputList, low, mid - 1);

        root.right = helper(inputList, mid + 1, high);

        return root;

    }


}
