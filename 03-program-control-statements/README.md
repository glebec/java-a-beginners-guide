# 3. Program Control Statements

## IO

```java
// declaring that a method can throw, necessary for System.in.read
public static void main (String[] args) throws java.io.IOException { ... }
```

`System.in.read` appears to be a synchronous/blocking line-buffered input.

```java
// Discarding remainder of input:
do {
  ignore = (char) System.in.read();
} while (ignore != '\n');
```

## Control Flow

- null statements are empty semicolons, e.g. `for (int i = 0; i < 5; sum += i++) ;`

### Conditionals

- `if` conditions must evaluate to a Boolean, according to the book – no "truthiness"
- `switch` cases just like JS except that the expression type is restricted.

### Loops

- `for` loops seem identical to JS, except that the condition must be a Bool.
- enhanced `for` loop will be shown later in the book.
- `while` loop same as JS too…
- …and `do`-`while`.

### Unstructured Programming

- `break` similar to JS; labeled blocks (ANY block)
- labels are `identifier: { stmts; }`
  - a label before a `for` controls the entire loop
  - a label after `for`, before `{` controls just the block
    - can be used to emulate JS `continue`
- `continue` also exists
  - can also target labeled blocks
