package BusSystem;

import java.util.ArrayList;

public class Dispatcher {
    ArrayList<Bus> busQueue = new ArrayList<Bus>();

    int addBus(Bus bus)
    {
        int temp = busQueue.size();
        busQueue.add(bus);
        int after = busQueue.size();
        return after - temp;
    }

    int addBus(Bus bus, int position)
    {
        if(busQueue.size() < position)
        {
            busQueue.add(bus);
            return busQueue.size() - 1;
        }

        busQueue.add(position,bus);
        return position;
    }
    Bus findBus(int id) {
        for (int i = 0; i < busQueue.size(); i++)
        {
            if(id == busQueue.get(i).getId())
            {
                return busQueue.get(i);
            }
        }
        return null;
    }

    Bus removeBus(int id)
    {
        for (int i = 0; i < busQueue.size(); i++)
        {
            if(id == busQueue.get(i).getId())
            {
                busQueue.remove(i);
                return busQueue.get(i);
            }
        }
        return null;
    }
    Bus dispatchBus()
    {
        if(busQueue.size() == 0)
        {
            return null;
        }
        Bus temp = busQueue.get(0);
        busQueue.remove(0);
        return temp;

    }

    public String toString(){

        String temp = "";
        for(int i = 0; i < busQueue.size();i++)
        {
            temp += busQueue.get(i).toString() + " ";
        }
        return temp;
    }
}
