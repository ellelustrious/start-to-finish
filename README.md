## Start to Finish
Processes first and last letters of words.

### Examples:
```java
StartToFinish processor = new StartToFinish("One day at a time");
System.out.println(processor.firstLetters());
System.out.println("Expected: O");

processor = new StartToFinish("Java Rules!");
System.out.println(processor.firstLetters());
System.out.println("Expected: J");

processor = new StartToFinish("Zebras, foxes, and monkeys, too. Oh, my.");
System.out.println(processor.firstLetters());
System.out.println("Expected: Z");

processor = new StartToFinish("");
System.out.println("empty string: " + processor.firstLetters());
System.out.println("Expected: ");
```

### Outputs:
```
Odaat
Expected: Odaat

eytae
Expected: eytae

JR
Expected: JR

as
Expected: as

ZfamtOm
Expected: ZfamtOm

ssdsohy
Expected: ssdsohy

empty string:
Expected:
```
