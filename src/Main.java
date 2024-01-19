public class Main {
    public static void main(String[] args)
    {
        byte numOs=1;
        if (numOs!=0&&numOs!=1)
        {
            System.out.println("Введите корректный номер ОС");
        }
        else if (numOs==0)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


    }
}