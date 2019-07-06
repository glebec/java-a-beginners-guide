# 1. Java Fundamentals

## Jargon

Term | Notes
----:|:-----
compilation unit | source file, 1+ class defs
access modifier | privilege level, e.g. `public`

## Notes

- compilation units
    - class case should match file case
        - one reason: so compilation artifacts (`x.class`) have the same name
    - `javac` compiles src file to `.class` bytecode
    - `java` interprets bytecode, takes name (without ext) as arg
    - in JDK 11+, can use `java Example.java` to JIT compile and run without outputting `.class` file
        - single-file program only
        - uses first class it finds
- datatypes
    - `int` (supports truncated division)
    - `float` (32 bit)
    - `double` (64 bit, more common)
- control flow
    - `if (condition) statement` / `if (condition) statement1 else statement2`
    - `for (init; cond; iter) statement`
- operators
    - `==` and `!=` for equality checks, typical`<` / `<=` etc.
    - `++` and `--`

> "Java supports three styles of comments"
