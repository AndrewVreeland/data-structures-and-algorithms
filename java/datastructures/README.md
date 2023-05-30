# Lab 10

implement a Stack and Queue that utilizes all of their own methods. they must live in separate classes.


## Whiteboard proccess


## Approach & Efficiency
Had to go back and rework alot of this code due to issues with linter not working.
not very effcient as this should have been done days ago


## solution
queue.enqueue(1);
isQueueEmpty();
queue.dequeue();

stack.push(1);
stack.isEmpty();
stack.pop();

# Lab 11
Lab 11 two stacks working in tandum to be a queue

## Whiteboard Process
![codeChallenge11PseudoCode.png](images%2FcodeChallenge11PseudoCode.png)

## Approach & Efficiency
The Big O for my functions would be O(1) for space as you are not  creating new nodes
and for time would be 0(2n) because you have to iterate twice over the separate stacks. however, this simplify down to O(n)
due to the fact that n is infinity and 2 times infinity is negligible.

I created two separate stacks inorder to pop and push the new nodes into their correct locations. inorder to get to the front of the queue
you have to pop everything off and push it into the other queue. a similar process needs to happen for both equations.

## Solution
<!-- Show how to run your code, and examples of it in action -->

PseudoQueue queue = new PseudoQueue();
queue.enqueue(1); ---> currently not funcitoning the values are not being added to the stack when this method is called.
queue.dequeue();




# Lab 12
## enqueue
Arguments: animal
animal can be either a dog or a cat object.
It must have a species property that is either "cat" or "dog"
It must have a name property that is a string.
## dequeue
Arguments: pref
pref can be either "dog" or "cat"
Return: either a dog or a cat, based on preference.
If pref is not "dog" or "cat" then return null.
## Whiteboard Process
<!-- Embedded whiteboard image -->
![code challange 12.png](images%2Fcode%20challange%2012.png)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I spent about an hour and a half on this one. I just couldnt wrap my head around the dequeue functionality. looking forward to the review of this tomorrow
## Solution
<!-- Show how to run your code, and examples of it in action -->
did not reach a solution

# Lab 13
Write a function called validate brackets  representing whether or not the brackets in the string are balanced

There are 3 types of brackets:
Round Brackets : ()
Square Brackets : []
Curly Brackets : {}

Input   	Output
 {}	       TRUE
{(})       FALSE
## WhiteBoard Process
![codeChallenege13.png](..%2Fimages_for_lab%2FcodeChallenege13.png)
## Solution
I went with a hash map for the solution to this problem.

# Lab 15
Create a Binary Search Tree class
This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:
Add
Arguments: value
Return: nothing
Adds a new node with that value in the correct location in the binary search tree.
Contains
Argument: value
Returns: boolean indicating whether or not the value is in the tree at least once.

## WhiteBoard Process
![Code Challenege 15.png](images%2FCode%20Challenege%2015.png)

## Solution
I couldn't figure out a solution to todays problem.

# Lab 16
Write the following method for the Binary Tree class

find maximum value
Arguments: none
Returns: number
Find the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.

## WhiteBoard Process
![codeChallange16.png](images%2FcodeChallange16.png)

## Solution
I couldn't figure out a solution to today's problem. kind of at a loss with trees currently I am not really understanding how to traverse them.

<<<<<<< HEAD
# CC 30
I'm not sure what the deal is but I had to comment all of my tests out from previous CCs becuase they kept giving me errors.
This is not the first time this has happened but I am stumped. Anyways after commenting everything else out I could get my new tests to pass.

Anyways I implemented A hasmap with its own functionality today and tested each functionality

Set, Get, Has, Keys, and hash.
=======
# Lab 16
Write a function called fizz buzz tree
Arguments: k-ary tree
Return: new k-ary tree
Determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:

If the value is divisible by 3, replace the value with “Fizz”
If the value is divisible by 5, replace the value with “Buzz”
If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
If the value is not divisible by 3 or 5, simply turn the number into a String.

## WhiteBoard Process
![CC18.png](images%2FCC18.png)

## Solution
iterate through the tree and enqueue the nodes into a queue.
step 1 would be to enqueue the root
step 2 would be to dequeue the root and then enqueu the roots connected nodes. as this is happening the logic for the fizz buzz would go here
step 3 check to see if the new trees root is null if it is the dequeue node will be the root. else follow through with normal tree building logic
this would be done in a breadth iteration styled approach

## CC26
![cc26.png](images%2Fcc26.png)
>>>>>>> 90afe4cb9441d36b7047b6646376d3c06222fc54


## CC28

we are reviewing this code in our drawing below!

class Main {
public static void main(String[] args) {
int[] unsortedArr = {5, 2, 1, 4, 0, 3};
System.out.println("unsorted array: " + java.util.Arrays.toString(unsortedArr));
quickSort(unsortedArr, 0, unsortedArr.length - 1);
System.out.println("sorted array: " + java.util.Arrays.toString(unsortedArr));
}
static void quickSort(int[] arr, int low, int high) {
if(low < high) {
int pivotLocation = partition(arr, low, high);
quickSort(arr, low, pivotLocation - 1);
quickSort(arr, pivotLocation + 1, high);
}
}
static int partition(int[] arr, int low, int high) {
int pivot = arr[high];
int leftwall = low;
for(int i = low; i < high; i++) {
if(arr[i] <= pivot) {
int temp = arr[i];
arr[i] = arr[leftwall];
arr[leftwall] = temp;
leftwall+=1;
}
}
int temp = arr[leftwall];
arr[leftwall] = arr[high];
arr[high] = temp;
return leftwall;
}
}
![CC28.png](images%2FCC28.png)
