# Recursion

We can think about recursion as a special technique for problems that may be hard to solve using loops.

A recursive method calls itself.


**Examples from *"Java Programming"* 10th edition by Y.Daniel Liang**

## Factorial

*Base case*, or *stopping condition*:

  0! = 1;

and, *recursive call*

  n! = n x (n - 1)!; n > 0


And so, we can describe the **factorial(n)** as follows:

```java
if (n == 0)
    return 1;
else
    return n * factorial(n - 1);
 ```


## Fibbonacci

The Fibonacci series begins with 0 or 1, and each subsequent number is the sum of the preceding two.

```java
public static long fib(long index){
    if (index == 0)
        return 0; // base case
    else if (index == 1) 
        return 1; // base case
    else
        return fib(index-1) + fib(index-2);

}
```

## Problem solving 
* The implementation involves using *if-else* are *switch* with different cases
* The implementation uses one or more *base cases*
* Every recursive call involves a recursive call on a smaller problem

And so, problems are broken into subproblems.

# The Last Ship Binge
```java
public static void watchLastShip(Series lastShip) {
    if (!lastShip.isEmpty()) {
        lastShip.watchOneEpisode();
        watchLastShip(lastShip);
    }
}
```

We have two problems to solve:
* watch one episode
* watch the rest of the series

The base case is when there are no more episodes to watch.


# Palindrome problem

The string is a palindrome if it reads the same from left and right, like "aha", or "a";

The problem can be divided as:
* Look at the first and the last character of the string. Compare, if they are the same continue
* Ignore the two characters you just checked, continue
```java
public class PalindromeCheck {
    public static boolean isPalindrome(String str){
        if (str.length() <= 1) return true;
        else if (str.charAt(0) != str.charAt(str.length() - 1)) return false;
        else return isPalindrome(s.substring(1, s.length() -1 ));
    }

}
```

