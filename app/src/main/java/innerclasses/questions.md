
#### When to use static inner classes?

- When there is one to many relation between the outer class and the inner class
- For example in the HashMap implementation, One HashMap class can have multiple.
  You use static nested classes if you just want to keep your classes together if they belong topically together or if the nested class is exclusively used in the enclosing class. There is no semantic difference between a static nested class and every other class.