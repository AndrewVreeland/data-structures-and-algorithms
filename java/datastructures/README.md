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
WHITE BOARD ONLY CHALLENGE





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
