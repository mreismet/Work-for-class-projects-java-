package BusSystem;

import java.util.Scanner;
public class BusDriver {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Dispatcher object = new Dispatcher();
        boolean loop = true;
        while(loop == true)
        {
            int temp = 0;
            System.out.println("1. Add bus");
            System.out.println("2.Add BusSystem.Person to bus");
            System.out.println("3. Remove bus");
            System.out.println("4. Remove person");
            System.out.println("5. List passengers");
            System.out.println("6. List buses");
            System.out.println("7. Requeue bus");
            System.out.println("8. Transfer person");
            System.out.println("9. Calls the BusSystem.Dispatcher");
            System.out.println("0. Terminates the program");
            temp = input.nextInt();
            if(temp == 1)
            {
                Bus temp1 = new Bus();
                int current = object.busQueue.size();
                object.addBus(temp1);
                System.out.println("BusSystem.Bus" + temp1.getId() + "added to position" + current);
            }
            else if(temp ==2)
            {
                System.out.println("Please type the id of the bus you want to add someone to");
                int temp1 = input.nextInt();
                if(object.findBus(temp1) == null)
                {
                    System.out.println("no bus with id " + temp1);
                }
                else
                {
                    System.out.println("What is the name of the person being added?");
                    Scanner input2 = new Scanner(System.in);
                    String name = input2.nextLine();
                    System.out.println(name + " has been added to bus " + temp1);
                    object.findBus(temp1).addPerson(new Person(name));
                }
            }
            else if(temp == 3)
            {
                System.out.println("Please type the id of the bus you would like removed");
                int temp1 = input.nextInt();
                if(object.findBus(temp1) == null)
                {
                    System.out.println("no bus with id " + temp1);
                }
                else
                {
                    object.removeBus(temp1);
                    System.out.println("BusSystem.Bus " + temp1 + " removed");
                }
            }
            else if(temp ==4)
            {
                System.out.println("Please type the bus id of this person");
                int temp1 = input.nextInt();
                if(object.findBus(temp1) == null)
                {
                    System.out.println("No bus with id " + temp1);
                }
                else
                {
                    System.out.println("Please type the name of the person you would like to remove");
                    Scanner input2 = new Scanner(System.in);
                    String tempname = input2.nextLine();
                    if(object.findBus(temp1).findPerson(tempname) == null)
                    {
                        System.out.println("No such person found in bus " + temp1 );
                    }
                    else
                    {
                        System.out.println(tempname + " has been removed from bus " + temp1);
                        object.findBus(temp1).removePerson(object.findBus(temp1).findPerson(tempname));
                    }
                }
            }
            else if(temp == 5)
            {
                System.out.println("Please say the bus that you would like to know the passengers of");
                int temp1 = input.nextInt();
                if(object.findBus(temp1) == null)
                {
                    System.out.println("no bus with id " + temp1);
                }
                else
                {
                    System.out.println("BusSystem.Bus " + temp1 + "\n " + object.findBus(temp1).getPassengers());
                }
            }
            else if(temp ==6)
            {
                System.out.println("BUS QUEUE " + object.toString());
            }
            else if(temp == 7)
            {
                System.out.println("Please type a bus id");
                int temp1 = input.nextInt();
                if(object.findBus(temp1) == null)
                {
                    System.out.println("No bus with id " + temp1);
                }
                else
                {
                    System.out.println("What position would you like the bus to be instead");
                    int position = input.nextInt();
                    Bus temp2 = object.findBus(temp1);
                    object.removeBus(temp1);
                    if(position > object.busQueue.size())
                    {
                        System.out.println("BusSystem.Bus " + temp2.getId() + " added to position " + (object.busQueue.size()));
                        object.addBus(temp2,position);
                    }
                    else
                    {
                        System.out.println("BusSystem.Bus " + temp2.getId() + " added to position " + position);
                        object.addBus(temp2,position);
                    }
                }
            }
            else if(temp == 8)
            {
                Scanner input1 = new Scanner(System.in);
                System.out.println("Type the person you would like transfered");
                String tempname = input1.nextLine();
                System.out.println("Type the id of a bus");
                int tempbus1 = input.nextInt();
                System.out.println("Type the id of a bus");
                int tempbus2 = input.nextInt();
                String result = "no bus with id ";
                int tempperson = 1000000000;
                if(object.findBus(tempbus1) == null)
                {
                    result += tempbus1;
                }
                else {
                    if(object.findBus(tempbus1).findPerson(tempname) != null)
                    {
                        tempperson = tempbus1;
                    }
                }

                if(object.findBus(tempbus2) == null)
                {
                    result +=tempbus2;
                }
                else {
                    if(object.findBus(tempbus2).findPerson(tempname) != null)
                    {
                        tempperson = tempbus2;
                    }
                }

                if(tempperson == tempbus1)
                {
                    boolean boom = Bus.transferPerson(object.findBus(tempbus1),object.findBus(tempbus2),object.findBus(tempbus1).findPerson(tempname));
                    if(boom == true)
                    {
                        System.out.println("BusSystem.Person transferred successfully");
                    }
                    else
                    {
                        System.out.println("BusSystem.Person transferred failed");
                    }

                }
                else if(tempperson == tempbus2)
                {
                    boolean boom = Bus.transferPerson(object.findBus(tempbus2),object.findBus(tempbus1),object.findBus(tempbus2).findPerson(tempname));
                    if(boom == true)
                    {
                        System.out.println("BusSystem.Person transferred successfully");
                    }
                    else
                    {
                        System.out.println("BusSystem.Person transferred failed");
                    }
                }
                else
                {
                    result += "No person named " + tempname + " for person";
                    System.out.println(result);
                }

            }
            else if(temp == 9)
            {
                Bus tempbus = object.dispatchBus();
                if(tempbus == null)
                {
                    System.out.println("BusSystem.Bus queue is empty");
                }
                else
                {
                    System.out.println("BusSystem.Bus " + tempbus.getId() + " has been dispatched");
                }
            }
            else if(temp == 0)
            {
                System.out.println("Shutting down.");
                loop = false;
            }

        }
    }
}
