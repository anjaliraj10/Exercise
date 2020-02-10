import java.util.Scanner;

public class ExeOne
{
    public static double pe =0, p1=0,price=0,ex=0;
    public static String car,extra;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose which car you want to buy : ");
        System.out.println("Sno  Car        Price");
        System.out.println(" 1   HATCHBACK  5.35 Lac");
        System.out.println(" 2   SALOON     4.95 Lac");
        System.out.println(" 3   ESTATE     6.25 Lac");
        System.out.print("Enter your choice : ");
        int n = sc.nextInt();
            switch (n) {
                case 1: {
                    car = "HATCHBACK";
                    price = 535000;
                    break;
                }
                case 2: {
                    car = "SALOON";
                    price = 495000;
                    break;
                }
                case 3: {
                    car = "ESTATE";
                    price = 625000;
                    break;
                }
                default: {
                    car = "Invalid";
                    break;
                }
            }
        if(n>3)
        {
            System.out.println("You Made An Invalid Choice.");
            System.exit(0);
        }
        else
        {
            System.out.println("You have chosen : "+car);
            System.out.println("The price of "+car+ " : " +price);

        }

        System.out.println("You can choose Optional extra\n Press 1 to choose" );
        int i =sc.nextInt();
        if(i==1)
        {
            System.out.println("Sno  Optional Extra          Price");
            System.out.println(" 1   Set of luxury seats     45000");
            System.out.println(" 2   Satellite Navigation    5500");
            System.out.println(" 3   Parking Sensors         10000");
            System.out.println(" 4   Bluetooth Connectivity  350");
            System.out.println(" 5   System Sound            1000");
            System.out.println("Choose any of your choice.");
            int choice = sc.nextInt();
            switch(choice) {
                case 1: {
                    extra = "Set of luxury seats";
                    pe = 45000;
                    break;
                }
                case 2: {
                    extra = "Satellite Navigation";
                    pe = 5500;
                    break;
                }
                case 3: {
                    extra = "Parking Sensors";
                    pe = 10000;
                    break;
                }
                case 4: {
                    extra = "Bluetooth Connectivity";
                    pe = 350;
                    break;
                }
                case 5: {
                    extra = "System Sound";
                    pe = 1000;
                    break;
                }
                default: {
                    extra = "Invalid choice";
                    pe = 0;
                    System.exit(0);
                }
            }
            System.out.println("You choose : "+extra);
            System.out.println("The price of extra is : "+pe);
        }
        else
        {
            System.out.println("No Extras Selected");
        }
        p1=price+pe;
        System.out.println("The price of car and extra will be : "+p1);
        System.out.println("Are you the Existing customer \nEnter 1 for yes and any other for no");
        int n1=sc.nextInt();
        if(n1==1)
        {
            System.out.println("So you are the existing customer from Snazzy Autos.");
            System.out.println("Press 1 if you want to trade the car");
            int n2=sc.nextInt();
            if(n2==1)
            {
                System.out.println("You Choose to trade your old car.");
                double offer = 70000;
                System.out.println("The discount offered for you is " + offer);
                System.out.println("Is it okay?! then Press 1 to continue");
                int n3 = sc.nextInt();
                if (n3 == 1) {
                    double price1 = p1 - offer;
                    System.out.println("The total price after trade will be : " + price1);
                    price1 = price1-(price1*0.1);
                    System.out.println("The total price after trade with discount will be : " + price1);
                    task2(price1);
                } else {
                    double price1 = p1;
                    System.out.println("The total price without trade will be : " + price1);
                    price1 = price1-(price1*0.05);
                    System.out.println("The total price without trade after 5% discount will be : " + price1);
                    task2(price1);
                }
            }
            else
            {
                System.out.println("You Choose not to trade your old car.");
                double price1 = p1;
                System.out.println("The total price without trade  will be : "+price1);
                price1 = price1-(price1*0.05);
                System.out.println("The total price without trade after 5% discount will be : "+price1);
                task2(price1);
            }
        }
        else
        {
            System.out.println("So you are not the Existing customer.");
            double price1 = p1;
            System.out.println("The total price without trade will be : "+price1);
            price1 = price1-(price1*0.05);
            System.out.println("The total price without trade will be after 5% discount : "+price1);
            task2(price1);
            System.out.println("The car You selected is : "+car);
            System.out.println("The optional extra you selected is : "+extra);
        }
    }
    public static int task2(double price)
    {
        System.out.println(".....Payment Section.....");
        Scanner sc = new Scanner(System.in);
        System.out.println("You are offered these payment modes : ");
        System.out.println("1. Full payment at once.");
        System.out.println("2. Four years of Installment.");
        System.out.println("3. Seven years of Installment.");
        System.out.println();
        System.out.println("Press 1 to see the payment methods.");
        int n1=sc.nextInt();
        if(n1==1)
        {
            System.out.println("1. Full amount paid customer will get 1% cash back.");
            System.out.println("2. In 4 year installment customer will not pay any extra charges.");
            System.out.println("3. In 7 year installment customer will pay 5% extra of total price.");
            System.out.println("Select your mode");
            int a = sc.nextInt();
            if (a == 1)
            {
                System.out.println("Your Payment is : "+price);
                System.out.println("You want to go for cash back then press 1 and if you want to see free optional offer then press 2 ");
                int b=sc.nextInt();
                if(b==1)
                {
                    double cash_back = price*0.01;
                    System.out.println("You will get cash back of : "+cash_back);
                    price = price - cash_back;
                    System.out.println("Total amount you will be paying is : "+price);
                }
                else if(b==2)
                {
                    task3(price);
                }
                else
                {
                    System.out.println("Invalid choice");
                    System.exit(0);
                }
            }
            else if (a == 2)
            {
                System.out.println("You don't have to pay extra.");
                System.out.println("So Your Payment is : "+price);
                double installment = price/(4*12);
                System.out.println("Your monthly installment for 4 years will be : "+installment );
            }
            else if (a == 3)
            {
                System.out.println("In 7 years installment you have to pay 5% extra");
                price = price*1.05;
                System.out.println("Your total payment will be : "+price);
                double installment = price/(7*12);
                System.out.println("Your 7 year monthly installment will be : "+installment);
            }
            else
            {
                System.out.println("Invalid choice.");
                System.exit(0);
            }
        }
        return 1;
    }
    public static int task3(double price)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have 2 options for one time payment");
        System.out.println("      1. You can avail 1% cash back      ");
        System.out.println("                   or                   ");
        System.out.println(" 2. You can get optional extra for free ");
        System.out.println("press 1 to see the offer");
        int n1= sc.nextInt();
        if(n1==1)
        {
            double cash_back = price*0.01;
            System.out.println("You will get cash back of : "+cash_back);
            double price1 = price - cash_back;
            System.out.println("The price after cash back you will be paying will be : "+price1);
            double price2=price1+cash_back-pe;
            System.out.println("The price you will be paying after getting free optional extra will be :"+price2);
            if(price1<price2)
            {
                price = price1;
                System.out.println("1% cash back is more relevant");
            }
            else if(price1 == price2)
            {
                price=price1;
                System.out.println("You can choose any of them because they worth same");
            }
            else
            {
                price=price2;
                System.out.println("Free optional extra is more relevant ");
            }
            System.out.println("The best price will be : "+price);
        }
        else
        {
            System.out.println("You choose incorrect option.");
            System.out.println("Exiting...........");
            System.exit(0);
        }
        return 1;
    }
}
/*  public static int displayExtra(int n)
    {
        String Extra;
        int price1 = 0;
        if(n==1)
        {
          Extra="Set of Luxury Seats";
          price1=45000;
        }
        else if(n==2)
        {
            Extra="Satellite Navigation";
            price1=5500;
        }
        else if(n==3)
        {
            Extra="Parking Sensors";
            price1=10000;
        }
        else if(n==4)
        {
            Extra="Bluetooth Connectivity";
            price1=350;
        }
        else if(n==5)
        {
            Extra="Sound System";
            price1=1000;
        }
        else
        {
            Extra="none";
            price1=0;
        }
        return price1;
    }*/

