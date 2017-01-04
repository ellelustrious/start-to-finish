/**
 * Tester for the StartToFinish class
 */
public class StartToFinishTester
{
    public static void main(String[] args)
    {
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
    }

}