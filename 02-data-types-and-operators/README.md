# 2. Introducing Data Types and Operators

- OO types defined by classes
- eight non-OO (primitive) types, aka elemental/simple

## The Eight Primitives

| Role  | Type      | Bits  | Notes                               |
| ----- | --------- | ----- | ----------------------------------- |
| float | `double`  | 64    | common                              |
| float | `float`   | 32    |                                     |
| int   | `long`    | 64    |                                     |
| int   | `int`     | 32    | common                              |
| int   | `short`   | 16    |                                     |
| int   | `byte`    | 8     | sometimes used for raw binary       |
| char  | `char`    | 16–32 | UTF-16; an unsigned "integral" type |
| bool  | `boolean` | ?     |                                     |

- All int types are signed

### Characters

```java
char ch = 'x';
```

- `char` being "integral" means you can perform arithmetic on it (sigh)
- backslash for escape

### Bools

- reserved keywords `true` and `false`
- does not appear to be a notion of "truthy/falsy" (good)

### Numeric Literals

- default-`int` numeric literals can be assigned to `char`, `byte`, `short`, and `long` type vars.

| Feature     | Syntax    | Alt.       | Notes                   |
| ----------- | --------- | ---------- | ----------------------- |
| Scientific  | `1e6`     | `1E6`      |                         |
| Long        | `15l`     | `15L`      |                         |
| Float       | `3.14f`   | `3.14F`    |                         |
| Underscores | `123_456` | `1_23_456` | convenient for IDs etc. |
| Hex         | `0xff`    | `0Xff`     |                         |
| Octal       | `051`     |            |                         |
| Binary      | `0b101`   | `0B101`    |                         |


## Misc

- `Math.sqrt :: Double -> Double`
- both chars and bools have automatic string coercion when used with `+` concatenation (meh) – wonder if this is true for all datatypes, or if there is a `Show` class à la Haskell / `.toString` method à la JS?


## Variables

### Scope

- class, method, and block scopes (maybe others?)
- Variables can only be used after their declaration point (no hoisting)
- The book implies (perhaps unintentionally) that there are no closures Obviously this cannot be the case with respect to lambdas, will have to see how this plays out once I see Java's lambda syntax.
- Seems like there is no local variable shadowing at the language level? Thumbs up for that.


## Operators

- Same arithmetic ops as in JS (including dividend-sign `%`, but also there is `Math.floorMod` for divisor-sign). Can also be used on `char`.
- `/` is truncated division.
- pre- and post-increment/decrement, same as JS.
- relational operators like `<` can only be applied to certain types.

15 precedence levels, here highest to lowest:

1. postfix `++`/`--`
1. prefix `++`/`--`, `!`, unary `+` and `-`, casts, `~`
1. `*`, `/`, `%`
1. binary `+` and `-`
1. `>>`, `>>>`, `<<`
1. inequalities, `instanceof`
1. `==`, `!=`
1. `&`
1. `^`
1. `|`
1. `&&`
1. `||`
1. `?:`
1. `->`
1. `=`, `(op)=`

Operator | Meaning
---------|--------
`&`      | AND (including bitwise)
`|`      | OR (including bitwise)
`^`      | XOR (including bitwise)
`||`     | OR (short-circuiting)
`&&`     | AND (short-circuiting)
`!`      | NOT

### Aside: Bitwise or Logical?

> "For the logical operators, the operands must be of type boolean"

- This appears to be incorrect? I can perform `1 | 2` and get `3` as I would expect from a bitwise op.
- So in Java 12 at least, the `&` / `|` ops are also bitwise ops and can take numbers or bools, whereas `&&` and `||` do not compile for e.g. numbers.
- [Spec §15.22](https://docs.oracle.com/javase/specs/jls/se12/html/jls-15.html#jls-15.22) has clarified: `&` and `|` are basically polymorphic literals. When used on bools, they are "logical operators". When used on numbers (or types promotable to numbers), they are "bitwise operators". Mystery solved.

### Assignment

- can chain assignments
- typical mutating shorthands like `+=` and `/=`, but also `&=` and `%=` etc.


## Type Conversion

An automatic _widening conversion_ occurs when a value `x :: X` is assigned to a variable `v :: V` and:

- `X` and `V` are "compatible"
- `V` is "larger" than `X`

Numbers are compatible with each other. Integer literals can be assigned to chars. `long` (int) can be converted to `double` (float), but not the other way around.

### Casts

Explicit type conversions via _(target type) expr_, allow for e.g. _narrowing conversions_.

```java
double x = 12, y = 7;
int z = (int) (x / y);
```

- high-order bits removed first (for ints)
- fractional component truncated (float to int)
- can cast from e.g. byte to char (incompatible but castable types)

### Promotion

In expressions of ~~mixed~~ (actually, can even be same(!)) types, values are "promoted" to a single type (without affecting the original binding).

1. `char`, `byte`, `short` -> `int`
1. if an operand is `long`, expression becomes `long`
1. if an operand is `float`, exp -> `float`
1. if any operands is `double`, exp -> `double`

Doing a mathematical operation on two `byte` values yields an `int`? Oh dear.
