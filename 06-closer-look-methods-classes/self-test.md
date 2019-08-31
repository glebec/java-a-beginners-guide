# Chapter 6 Self Test

1. No, cannot access private member of class externally.
2. Precede
3. See [`Stack.java`](Stack.java).
4. See [`Swappable.java`](Swappable.java).
5. No, cannot differentiate overloaded methods by return type.
6. See [`RecRev.java`](RecRev.java).
7. `static`
8. To do some initialization / side effect before the constructor runs.
9. A class defined within a class, has access to outer instance's values.
10. `private`
11. Signature (at least by Java's standards).
12. Value.
13. See addendum below.
14. Yes.
15. `method(int x, int[] ... xs){...}` and `method(int[] ... xs)`.

```java
// 13. `sum(1, 2, 3) == 6`
static sum (int ... ints) {
    int sum = 0;
    for (int i : ints) {
        sum += i;
    }
    return sum;
}
```
