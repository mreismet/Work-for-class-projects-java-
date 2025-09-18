package BusSystem;

public class Person {
    private String name;
    private int ticketNumber;
    private static int nextTicketnumber = 1;

    Person()
    {
        name = "NO NAME";
        ticketNumber = nextTicketnumber - 1;
        nextTicketnumber++;
    }
    Person(String name){
        this.name = name;
        ticketNumber = nextTicketnumber - 1;
        nextTicketnumber++;

    }

    int getTicketNumber()
    {
        return ticketNumber;
    }
    String getName()
    {
        return name;
    }

    public String toString()
    {
        return ticketNumber + "\t" + name;
    }

}
