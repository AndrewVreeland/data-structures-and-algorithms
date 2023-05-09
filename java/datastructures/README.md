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
123123
