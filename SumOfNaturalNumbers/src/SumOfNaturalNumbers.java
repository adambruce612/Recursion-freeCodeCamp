public class SumOfNaturalNumbers
{
    public static int recursiveSummation(int inputNumber)
    {
        if (inputNumber <= 1) return inputNumber;

        return inputNumber + recursiveSummation(inputNumber - 1);
    }

    public static void main(String[] args)
    {
        int result = recursiveSummation(5);
        int result2 = recursiveSummation(10);
        System.out.println(result);
        System.out.println(result2);
    }
}
