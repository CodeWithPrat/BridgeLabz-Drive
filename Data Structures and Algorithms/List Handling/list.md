## List Handling:
- a. Desc -> Read the Text from a file, split it into words and arrange it as Linked List. Take a user input to search a Word in the List. If the Word is not found then add it to the list, and if it found then remove the word from the List. In the end save the list into a file
- b. I/P -> Read from file the list of Words and take user input to search a Text
- c. Logic -> Create a Unordered Linked List. The Basic Building Block is the Node Object. Each node object must hold at least two pieces of information. One ref to the data field and second the ref to the next node object.
- d. O/P -> The List of Words to a File.


```java
import java.io.*;
import java.util.*;

// Node class to represent each node in the linked list
class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to manage the linked list operations
class LinkedList {
    Node head;

    // Method to add a word to the linked list
    public void addWord(String word) {
        Node newNode = new Node(word);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to search and remove a word from the linked list
    public void removeWord(String word) {
        Node current = head;
        Node prev = null;

        // If head node itself holds the word to be deleted
        if (current != null && current.data.equals(word)) {
            head = current.next;
            return;
        }

        // Search for the word to be deleted, keep track of the previous node
        while (current != null && !current.data.equals(word)) {
            prev = current;
            current = current.next;
        }

        // If the word is present, unlink it from the linked list
        if (current != null) {
            prev.next = current.next;
        }
    }

    // Method to save the linked list to a file
    public void saveToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            Node current = head;
            while (current != null) {
                writer.println(current.data);
                current = current.next;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class ListHandling {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Read words from file and add to the linked list
        try (BufferedReader reader = new BufferedReader(new FileReader("wordlist.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.addWord(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // User input to search a word
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to search: ");
        String searchWord = scanner.nextLine();

        // Search word in the list and perform add/remove operations
        if (!listContains(list.head, searchWord)) {
            list.addWord(searchWord);
            System.out.println("Word added to the list.");
        } else {
            list.removeWord(searchWord);
            System.out.println("Word removed from the list.");
        }

        // Save the updated list to a file
        list.saveToFile("updated_wordlist.txt");
        System.out.println("Updated word list saved to file.");

        scanner.close();
    }

    // Helper method to check if a word exists in the linked list
    public static boolean listContains(Node head, String word) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(word)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

```
