package sol;

import java.util.PriorityQueue;
import java.util.Comparator;

/**
 * A class that works with priority queues.
 */
public class PQ {

    /**
     * Helper to print a PriorityQueue
     * @param queue A Priority Queue
     */
    public static void printPQ(PriorityQueue queue) {
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " " );
        }
        System.out.println();
    }

    /**
     * Main method with sample priority queues and comparators
     * @param args Unused
     */ 
    public static void main(String[] args) {
        // basic priority queue on numbers
        PriorityQueue<Integer> numsLowToHigh = new PriorityQueue<Integer>();

        // order numbers decreasing
        Comparator<Integer> numHigher = (int1, int2) -> {
            return Integer.compare(int1, int2) * -1;
        };
        // uses the numHigher comparator to prioritize larger numbers
        PriorityQueue<Integer> numsHightoLow = new PriorityQueue<Integer>(numHigher);

        // order strings by length
        Comparator<String> stringShorter = (str1, str2) -> {
            return Integer.compare(str1.length(), str2.length());
        };
        // priority queue that gives highest priorities to shorter strings
        PriorityQueue<String> stringsByLength = new PriorityQueue<String>(stringShorter);
    }
}
