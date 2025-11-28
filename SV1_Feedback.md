
1.3 Close. k, i, l are the *references* to Objects. The Objects are 'the things referenced by' i, k, l.

1.9 Yes.

2.1 Yes. (Although in practice there are also good cases where you don't want to have everything private, not least to avoid the Java curse of boilerplate code)

2.2 Yes. Flexibility is both a curse and a blessing, depending on context.

2.3 a)
Your code won't actually compile - for example, you have `public Vector(_x, _y) {` which does not specify the type of the two parameters.
Always write code in an IDE (IntelliJ being the best I have found for Java, but vscode is also fine). This is very helpful in highlighting these compilation issues. I can also then comment on the code *in situ*.

Your add/subtract/dot methods in the example are in fact quite good *immutable* examples. Will discuss in supervision.

b) final is the important bit, as the compiler then stops anyone changing them after construction. At this point private is much less important (if they are primitives).

c) Yes. For ii) there is actually an ambiguity in the signature. It might very well change *this*. Will discuss in supervision.

d) Yes. There is no formal enforceable way to mark a class as immutable.


2.4 
Good - making the OOPLinkedElement an inner class means the implementation detail is not visible. Howeevr, you shoul dnot be using static methods here; we want to call something like:

```java
OOPLinkedList list = new OOPLinkedList(67);   // we also want to be able to create an empty list

list.insert(int nextItem);
```

2.5 Yes.

2.6 a/b) Yes

c) There is a lot going on in this question. We'll cover it in the supervision.

3.1 Yes - excellent summary. I would rephrase, "always either a valid object or null" to "always either a valid object of a known type or null"; typing of references gives us more safety.

3.2 [In future for images, you should be able to just add them to the repository as png/jpg files.] Yes. The key point is that null is a special value that is held by p (it is still a reference variable, but one that clearly states, "I do not refer to anything".)

3.3 Yes.

3.4 No ;-). It is missing any direct manipulation of xy in either of the methods.

4.1 Yes. However, it would be absolutely fine to have Vector2D inherit from Vector3D.

4.2 In your example, Person and Student are by definition both in the same package, so it will compile. If it would be helpful to discuss what java packages are in the supervision, then remind me to discuss it.

4.4 Yes. As a follow-on question that we can discuss in the supervision, what would happen is we promote a ShopAssistant to Manager?

[One of my favourite Cambridge quotes is that, "we have vacations, not holidays: you vacate the premises but carry on working"]

