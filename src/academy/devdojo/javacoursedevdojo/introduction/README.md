## Java Course - Introduction

### Topics 
>
    Class 00-07: Introduction to Java 
    Class 08-09: Packages, Comments and Output
    Class 10-14: Primitive Data Type and Reference Type String
    Class 15-19: Operators (Arithmetic, Relational, Logical, Assignment)
    Class 20-26: Conditional Statements
    Class 27-31: Loop statements (for, while, do-while)
    Class 32-35: Arrays
    Class 36-38: Multidimensional Arrays


### Install Java
Download java jdk in *[Azul JDKs](https://www.azul.com/downloads/?package=jdk)*.
Follow this steps to *[Install Java JDK 17 on Windows](https://www.youtube.com/watch?v=QekeJBShCy4)*.
Choose and install one of *[Top 10 popular Java IDE](https://www.edureka.co/blog/top-10-java-ide/)*.

### How Java Works

![Java](./assets/img/howJavaWorks.PNG)

**JVM (Java Virtual Machine)** = JVM is the runtime engine of the Java Platform, which allows any program written in Java or other language compiled into Java bytecode to run on any computer that has a native JVM. The JVM is specific to each OS.

**JDK (Java Development Kit)** = The JDK has a JVM, a compiler and debugging tools. It is used for development.

**JRE (Java Runtime Environment)** = The JRE is just for executing.

We will compile the `.java` source file and turn it into a `.class` file. This `.class` we call byteCode that will be executed by the JVM. The JVM will interpret and worry about working with the OS.

### Packages
The package structure is a directory structure. Packages serve to organize and group project classes that have things in common.

The convention for naming packages is:
> your inverted website domain -> project name -> what you want to have in your package.

**For example:** 
`academy.devdojo.javacoursedevdojo.introduction`
 
<sub>academy.devdojo = your inverted website domain
javacoursedevdojo = project name
introduction =  what you want to have in your package</sub>

### Comments
> Multiple lines
/**/ 

> Inline
// 

> Javadoc
/* * /* 

> Vs Code Shortcut 
Ctrl + ;

### Usefull Shortcuts
> sout
    `System.out.println();`

> psvm
    `public static void main(String[] args) {}`

### Variable
Variables are containers for storing data values.
![Variable](https://www.masterincoding.com/wp-content/uploads/2019/09/Variables_Java.png)
![Variable Code](http://www.atnyla.com/library/images-tutorials/int-data-type-in-java-3a.PNG)

### Primitive Data Types
![Data Types Table](http://3.bp.blogspot.com/-KmFAkdqT9zQ/VgK_r-KU8aI/AAAAAAAAIik/KbW2AghUtqE/s1600/Java+Tutorial+-+Java+Data+Types+%2528Table%2529.jpg)

#### Casting
Type casting is when you assign a value of one primitive data type to another type.

- **Widening Casting:**
Converting a smaller type to a larger type size. Is done automatically.
`byte -> short -> char -> int -> long -> float -> double`
</br>

  ``` 
  public class Main {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
  }
   ```

- **Narrowing Casting:**
Converting a larger type to a smaller size type. Is done manually by placing the type in parentheses in front of the value.
`double -> float -> long -> int -> char -> short -> byte`
</br>

  ``` 
    public class Main {
        public static void main(String[] args) {
            double myDouble = 9.78d;
            int myInt = (int) myDouble;

            System.out.println(myDouble);   // Outputs 9.78
            System.out.println(myInt);      // Outputs 9
    }
    }
   ```
### Reference Type String

String is a reference type and not a primitive type. String is a Class.

### Operators
![Operators](https://javagoal.com/wp-content/uploads/2019/10/21.png)

### Conditional Statements

#### If, Else:
![If, Else](https://www.kirupa.com/cdn-cgi/mirage/5b98c9bce50d51371353da0e31e357abd3025ffac26c90d1618f0ab762e089ed/1280/html5/images/if_else_200_v2.png)

**Else if:** 
![Conditional Statements](https://www.examtray.com/sites/default/files/2019-06/java-if-else-if-control-statements-syntax.jpg)

**How it works:**
![Switch](https://cdn.programiz.com/sites/tutorial2program/files/java-if-else-if-statement.png)

#### Ternary Operator: 
![Conditional Statements](https://media.geeksforgeeks.org/wp-content/uploads/20191122171059/Conditional-or-Ternary-Operator-__-in-Java.jpg)

**Truth Tables:**
![Truth Tables](https://content.codecademy.com/practice/art-for-practice/new-pngs/Boolean-operators-dk.png)

#### Switch Case:
![Switch](https://xperti.io/blogs/wp-content/uploads/2021/06/SwitchCaseStatement.png)


### Loop Statements

#### For:
![For](https://introcs.cs.princeton.edu/java/11cheatsheet/images/for.png)

#### While and do-while:
![While and do while](https://studyopedia.com/wp-content/uploads/2018/05/Difference-between-while-and-do-while-loop-in-Java.png)

#### Break
![Break](https://howtodoinjava.com/wp-content/uploads/2023/01/Java-break-keyword.svg)

#### Continue
![Continue](https://www.scientecheasy.com/wp-content/uploads/2021/05/java-continue-statement.png)

### Arrays

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

![Arrays and Variable.png](https://jenkov.com/images/java/java-arrays-1.png)

![One Dimensional Array](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/02/one-dimensional-array-in-java.jpg)

An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed.

![Array Code](https://linuxhint.com/wp-content/uploads/2022/04/word-image-773.png)

#### Java Data Type Default Initialization Values 
![Data Type Default Initialization](https://www.baeldung.com/wp-content/uploads/2017/12/init1.png)

### Multidimensional Arrays

A multidimensional array is an array of arrays. Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.
![Multidimensional Arrays](./assets/img/multidimensionalArrays.png)
![](https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/01/Representation-of-a-jagged-array.png)
![](http://www.trytoprogram.com/images/c-multidimensional-array.jpg)