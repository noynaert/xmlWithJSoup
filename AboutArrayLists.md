# ArrayLists in Java

## First Points

* Similar to regular indexed arrays, but more flexible.
* ArrayList is a class
* Can only contain objects
  * Primitive classes may be used in "Wrapper Classes"
    * Interger is the wrapper class for int
    * Double is the wrapper class for double
* Can use indexes, but often we don't have to.
* Normally supply the data type in the < >

[Java 11 API documentation for ArrayList\<E>](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html)

\<E> is the datatype for one element on the list

## Constructors

* ArrayList()  -- Creates an ArrayList with an initial size of 10.
* ArrayList(int initialCapacity) -- Creates an array with a custom Array size.
* ArrayList(collection) -- There are other groups of data that are collections.  You can make an ArrayList directly from one of the collections.

### "Growing" ArrayLists

* If the initial capacity is exceeded, then the capacity is doubled.
* Increasing the capacity is a **slow** operation

## ArrayList problems

* ArrayList operations can be slow.
* ArrayLists are not "thread safe."  Advanced Java programs often run multiple threads.  (Up until now we have only written methods that run sequentially.  Advanced programs can run multiple methods concurrently.  That can cause problems if they try to use a common ArrayList structure.)