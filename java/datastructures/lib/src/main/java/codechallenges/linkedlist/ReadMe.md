# Challenge Title
1. Can successfully instantiate an empty linked list
2. Can properly insert into the linked list
3. The head property will properly point to the first node in the linked list
4. Can properly insert multiple nodes into the linked list
5. Will return true when finding a value within the linked list that exists
6. Will return false when searching for a value in the linked list that does not exist
7. Can properly return a collection of all the values that exist in the linked list
8. Create a Linked List class
9. Within your Linked List class, include a head property.
   1. Upon instantiation, an empty Linked List should be created.

   2. The class should contain the following methods

      1. insert
        Arguments: value
        Returns: nothing
        Adds a new node with that value to the head of the list with an O(1) Time performance.
      2. includes
         Arguments: value
         Returns: Boolean
         Indicates whether that value exists as a Node’s value somewhere within the list.
         to string
         Arguments: none
         Returns: a string representing all the values in the Linked List, formatted as:
           "{ a } -> { b } -> { c } -> NULL"


## Whiteboard Process
[LinkedList_WhiteBoards.png](LinkedList_WhiteBoards.png)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
1. To add a new node to the linked list I first created a new node then I checked to see if the head was null
2. if the head did not equal null then it was asigned the value of the new node.
3. this gave us an 0(1) for space as the size of the node is the saame each time the code runs. and an 0(n) for timeb because there could be infinite nodes in the linked list that the expression has to itterate over to see if the value is there.

## Solution
<!-- Show how to run your code, and examples of it in action -->
LinkedList.insertFront(1);
LinkedList.insertFront(2);
LinkedList.insertFront(3);
