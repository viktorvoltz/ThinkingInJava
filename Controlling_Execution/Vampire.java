
public class Vampire

{

    void findVampire()

    {

        int arr[] = new int[4];

        for (int i = 1001; i < 10000; i++)

        {

            arr = getDigitCombo(i);

            rotateCombo(arr, i, 1);

        }

    }

    boolean vampireStraightCombo(int[] arr, int num)

    {

        if (checkIfVampire(arr[0], arr[1], arr[2], arr[3], num))

        {

            System.out.println(num + " = " + (arr[0] * 10 + arr[1]) + " * " + (arr[2] * 10 + arr[3]));

            return true;

        }

        else if (checkIfVampire(arr[0], arr[2], arr[1], arr[3], num))

        {

            System.out.println(num + " = " + (arr[0] * 10 + arr[2]) + " * " + (arr[1] * 10 + arr[3]));

            return true;

        }

        else if (checkIfVampire(arr[0], arr[3], arr[1], arr[2], num))

        {

            System.out.println(num + " = " + (arr[0] * 10 + arr[3]) + " * " + (arr[1] * 10 + arr[2]));

            return true;

        }

        return false;

    }

    boolean vampireReverseCombo(int[] arr, int num)

    {

        if (checkIfVampire(arr[3], arr[2], arr[1], arr[0], num))

        {

            System.out.println(num + " = " + (arr[3] * 10 + arr[2]) + " * " + (arr[1] * 10 + arr[0]));

            return true;

        }

        else if (checkIfVampire(arr[3], arr[1], arr[2], arr[0], num))

        {

            System.out.println(num + " = " + (arr[3] * 10 + arr[1]) + " * " + (arr[2] * 10 + arr[0]));

            return true;

        }

        else if (checkIfVampire(arr[3], arr[0], arr[2], arr[1], num))

        {

            System.out.println(num + " = " + (arr[3] * 10 + arr[0]) + " * " + (arr[2] * 10 + arr[1]));

            return true;

        }

        return false;

    }

    boolean checkIfVampire(int a, int b, int c, int d, int num)

    {

        int num1 = a * 10 + b;

        int num2 = c * 10 + d;

        if ((num1 * num2) == num)

            return true;

        return false;

    }

    void rotateCombo(int[] arr, int num, int count)

    {

        if (count == 5)

            return;

        if (vampireStraightCombo(arr, num))

            return;

        else if (vampireReverseCombo(arr, num))

            return;

        else

        {

            arr = rotateArray(arr);

            rotateCombo(arr, num, count + 1);

        }

    }

    int[] rotateArray(int[] arr)

    {

        int[] temp = new int[4];

        for (int i = 1; i < 4; i++)

            temp[i] = arr[i - 1];

        temp[0] = arr[3];

        return temp;

    }

    int[] getDigitCombo(int num)

    {

        int[] arr = new int[4];

        for (int i = 3; i >= 0; i--)

        {

            arr[i] = num % 10;

            num = (num - num % 10) / 10;

        }

        return arr;

    }

    public static void main(String[] args)

    {

        System.out.println("The vampire numbers are: ");

        Vampire v = new Vampire();

        v.findVampire();

    }

}
