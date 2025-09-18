package BusSystem;

import java.util.ArrayList;

public class Bus {

    ArrayList<Person> passengers;
    private static int nextID = 1;
    private int busId;

    Bus() {
        passengers = new ArrayList<Person>();
        busId = nextID - 1;
        nextID++;
    }

    int getId()
    {
        return busId;
    }
    void addPerson(Person person)
    {
        passengers.add(person);
    }
    boolean removePerson(Person person)
    {
        for(int i = 0; i< passengers.size();i++)
        {
            if(person.getTicketNumber() == passengers.get(i).getTicketNumber())
            {
                passengers.remove(i); // checks if the person getting removed is the correct one via ticket numbers
                return true;
            }
        }
        return false;
    }
    Person findPerson(String name)
    {
        for(int i =0 ; i < passengers.size(); i++)
        {
            if(passengers.get(i).getName().equals(name))
            {
                return passengers.get(i); // finds a passenger based on their name
            }
        }
        return null;
    }

    static boolean transferPerson(Bus bus1, Bus bus2,Person person) {
        for (int i = 0; i < bus1.passengers.size(); i++)
        {
            if(person.getName().equals(bus1.passengers.get(i).getName()) )
            {
                bus2.addPerson(bus1.passengers.get(i)); // transfers passengers from buses
                bus1.passengers.remove(i);
                return true;
            }
        }
        return false;

    }

    String getPassengers()
    {
        String temp = "";
        for(int i = 0; i< passengers.size(); i++)
        {
            temp += passengers.get(i).getTicketNumber() + " " + passengers.get(i).getName() + "\n"; // gets all of the passengers
        }
        return temp;
    }

    public String toString(){
        return busId + "";
    }
}
