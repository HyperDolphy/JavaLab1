public class Primes
{
    public static void main(String[] args) // основной метод
    {
        for (int i = 2; i <= 100; i++)
            if (isPrime(i))
                System.out.print(i + " ");
    }
    public static boolean isPrime(int n) // Проверка числа
    {
        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }
}