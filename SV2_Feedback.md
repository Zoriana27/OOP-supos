5.1 Yes. An interface may also contain default method implementations.

5.2 Dynamic polymorphism is the ability of a program to resolve method calls at runtime based on the actual object type, rather than the reference type. 

5.3 Yes, exactly. If you want to quote something fancy, this violates the Liskov Substitution Principle.

5.4 [No need to put code in pdf, it;s much easier for me to annotate it directly in the source files. Although, when you do please make sure they are actually .java source files and compile :-)]. Code is all good here.

5.5 Yes (just missing the implementing code).

5.8 Almost - you also need to ensure that Ninja implements NinjaInterface. Will discuss in supervision.

6.1 Very good answers to a), b). Can discuss c) in supervision: this halves the memory available, but does mean that marking and copying can be done in parallel.

6.2 Actually, with immutable objects we have many *more* short-lived objects sitting in memory that need to be GC'd, so garbage collection may be doing much more work. Will discuss in supervision.

6.4 Yes.

6.5 Yes. The key point is that we may not (or rather, will not) have cloned any data initialised within the parent class.

6.6 Good.

```java
        // wierd syntax explanation
            copy.mData = mData != null ? mData.clone() : null;

        // is use of the 'ternary' operator and is the same as:

            if (mData != null) {
                copy.mData = mData.clone();
            } else {
                copy.mData = null;
            }
            
        // [if statement] ? [return value if true] : [return value if false]
```

c) The problem is a little deeper than that, consider the code:

```java 
Animal a = new Dog();
Animal aCopy = new Animal(a);

// How do we ensure aCopy is actually a Dog, not just an Animal?
```

d) To be totally safe the class must be `final`, which means it *cannot* be subclassed. This ensures that no subclass can add mutable state that would not be copied correctly. (And also, formally, inheriting only from Object)

6.7 Yes. But you then need to explain why this causes a problem. When we run super.clone() we will now have an empty mtData field (of the default length of 100) that we cannot reassign because it is final.

7.1 Yes. 

7.5 Yes.