# 6. A Closer Look at Methods and Classes

## Access Modifiers

| Scope                   | `public` | `protected` | Default | `private` |
| ----------------------- | -------- | ----------- | ------- | --------- |
| Class                   | Yes      | Yes         | Yes     | Yes       |
| Subclass                | Yes      | Yes         | Yes     | No        |
| Other                   | Yes      | Yes         | Yes     | No        |
| Different Pkg. Subclass | Yes      | Yes         | No      | No        |
| Different Pkg. Other    | Yes      | No          | No      | No        |

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
