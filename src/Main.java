public class Main
{
    public static void main(String[] args)
    {
        //Задание 1
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

        //Задание 2
        short agePr=2016;
        numOs=0;
        if(numOs==0&&agePr<2015)
        {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if(numOs==0&&agePr>=2015)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if(numOs==1&&agePr<2015)
        {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if(numOs==1&&agePr>=2015)
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (numOs!=0&&numOs!=1)
        {
            System.out.println("Введите корректный номер ОС");
        }

        //Задание 3
        short god=1584;

        if((((god%4)==0&&(god%100)!=0)||(god%400)==0)&&god>1584)
        {
            System.out.println("Этот год високосный");
        }
        else
        {
            System.out.println("Этот год не високосный");

        }





    }



}

