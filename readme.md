# Data Types in Java 

### Description:
A *Data Type* is a term used in programming to describe the context given to information in our program. As humans, we typically understand information when given some context. For example, `10` and `"ten"`, represent the same idea, but we would use the number representation and the word representation in different contexts. Similarly, we can provide this type of context in our programs.

In the repo, we will create a number of different variables. Below are a list of naming rules and conventions to keep in mind when creating variables:
  - reserved keywords cannot be used. See list of keywords in references section below.
  - names cannot start with a digit (but can be used after the first character)
  - names can start with a letter, an underscore `_` or a dollar sign `$`
  - names cannot user other symbols or spaces
  - you cannot re-use the same variable name within the same scope (more on scopes later!).
  - variable names should meaningfully describe or relate to the context of your data
  - variable names should always begin with a lowercase letter
  - if a variable name is made up of multiple words, then each subsequent word should start with a capital letter
  - no two variables can have the same name

In Java, there are two categories of variables that can be created, *primitives* and *references*. Java has eight (8) primitive datatypes as follows:
1. `byte`
2. `short`
3. `int`
4. `long`
5. `char`
6. `float`
7. `double`
8. `boolean`

If a variable is created using a datatype other than the eight (8) specified above, the variable is a *reference* variable, based on a class that has either been defined within the ***JRE*** or by another developer.

#### Sample output of the Main.Java file:
```
127
-128
32767
-32768
2147483647
-2147483648
9223372036854775807
3839.34839
3839.3484
3.14
false
true
a
z
the quick brown fox jumps over the lazy dog
I mastered Java data types!
```

  ## References
[Java Reserved Words](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)