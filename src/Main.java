import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();

        // we can use the var keyword for typed linkedlists or any type list or collection
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        var firstTimeList = new LinkedList<String>(List.of("1","2","3","4","5"));


        gettingElements(placesToVisit);

    }

    public static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue Methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // Stack Methods
        list.push("Alice Springs");

    }

    public static void removeElements(LinkedList<String> list) {

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");
        String s2 = list.removeFirst(); // removes first element, this is clearer
        System.out.println(s2 + " was removed");
        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");
        // Queue/Deque poll methods
        String p1 = list.poll(); // removes first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst(); // removes first element, this is clearer
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast(); // removes last element
        System.out.println(p3 + " was removed");


        // push elements down into the 'pile' or back into the stack
        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // removes first element
        System.out.println(p4 + " was removed");

    }

    private static void gettingElements(LinkedList<String> list) {

        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Elemnent = " + list.getFirst());
        System.out.println("Last Elemnent = " + list.getLast());

        // The big O notation for these methods is the same as it is for an ArrayList
        // O(n)
        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at positon: " + list.indexOf("Melbourne"));

        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());
        // Stack Retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());



    }


}