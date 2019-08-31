# 6. A Closer Look at Methods and Classes

## Access Modifiers

Mod \ Scope | Class | Sub. | Other | Ext. Sub. | Ext. Other
----------- | ----- | ---- | ----- | --------- | ----------
`private`   | OK    |      |       |           |
Default     | OK    | OK   | OK    |           |
`protected` | OK    | OK   | OK    | OK        |
`public`    | OK    | OK   | OK    | OK        | OK

## Calling Behavior

- Everything but primitives is call-by-reference
- Boxed primitives also call-by-reference
  - `Double`
  - `Float`
  - `Byte`
  - `Short`
  - `Integer`
  - `Long`
  - `Character`

## Method Overloading

- Different input type signatures can dispatch to different method definitions
- Return type difference does not suffice to overload a method (though it is permitted)
- Automatic type widening can occur (e.g. a `float` argument will trigger a method taking `double`) unless there is a specific method for that type defined.
- Constructors can also be overloaded

```java
class Foo {
    private int i;

    Foo (int num) { i = num; }
    Foo (Foo foo) { i = foo.i; } // privacy by class, not instance
}
```

## Static

Java classes have:

- static instance variables
- static methods
- static blocks (run when class is first loaded)

```java
class HasStaticBlock {

    static int saved;

    static {
        System.out.println("Running on init, before constructor")
        saved = SomeClass.someExpensiveComputation();
    }

    // ...
}
```

## Nesting

- Nested classes are members of their enclosing class.
  - Non-static nested classes are called _inner classes_.
  - Inner classes can be anonymous (will see more in Ch. 16).
- Can also nest a class within a block scope. Will be scoped to the block.

```java
class Foo {
    int num = 5;

    example () {
        var bar = new Bar();
        System.out.println(bar.barMethod()); // 6
    }

    class Bar {
        int barMethod () {
            return num + 1;
        }
    }
}
```

## Varargs

Essentially the same as JS "rest" syntax.

- Declared via `...`.
- Results in an array.
- Must be last argument.
- Can only be one.
- Can be overloaded by type and/or preceding single args.
  - Ambiguities can arise, e.g. `overloadedMethod()`
  - Overlapping e.g. `someFn(1, 2, 3)`: 1 + vararg, or just vararg?

```java
// someMethod(4, 0, 9);
someType someMethod (int x, int ... args) {
    System.out.println(x); // 4
    System.out.println(args.length); // 2
}
```
