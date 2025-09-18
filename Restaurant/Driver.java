package Restaurant;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        orderList RestaurantOrders = new orderList();
        boolean loop = true;
        while(loop == true)
        {
            System.out.println("1-Create order");
            System.out.println("2-Delete order");
            System.out.println("3-Ready order");
            System.out.println("4-Print order");
            System.out.println("5-Print all orders");
            System.out.println("6-exit");
            int result = input.nextInt();
            System.out.println();
            if(result == 1)
            {

                String[] tempstring = new String[3];
                for(int i = 0; i < tempstring.length; i++)
                {
                    Scanner get = new Scanner(System.in);
                    System.out.println("Enter item" + (i + 1) + ": ");
                    tempstring[i] = get.nextLine();

                }
                Order neworder = new Order(tempstring);
                RestaurantOrders.addOrder(neworder);
                System.out.println("Order has been added");
            }
            else if(result == 2)
            {
                System.out.println("Please input the id of the order you would like to remove");
                RestaurantOrders.removeOrder(input.nextInt());
                System.out.println("Order has been removed");
            }
            else if(result == 3)
            {
                System.out.println("Please input the id of the order you would like to make ready");
                RestaurantOrders.ReadyOrder(input.nextInt());
                System.out.println("Order has been set to ready");
            }
            else if(result == 4)
            {
                System.out.println("Please input the id of the order you would like to print");
                int print = input.nextInt();
                String order = RestaurantOrders.printOrder(print);
                if(order == "")
                {
                    System.out.println("No order with such id");
                }
                else
                {
                    System.out.println(order);
                }
            }
            else if(result == 5)
            {
                System.out.println(RestaurantOrders.printOrders());
            }
            else if(result == 6)
            {
                System.out.println("Shutting down....");
                loop = false;
            }

        }
    }
}
