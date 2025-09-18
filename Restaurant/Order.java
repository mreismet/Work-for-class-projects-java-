package Restaurant;

public class Order {
    private int id;
    private static int nextid = 1;
    public boolean ready;
    public String[] items;
    Order()
    {
        id = nextid;
        nextid++;
        ready = false;
        items = new String[3];
    }
    Order(String[] items)
    {
        id = nextid;
        nextid++;
        ready = false;
        this.items = items;
    }

    int getId()
    {
        return id;
    }
    public String toString()
    {
        String order = "Order number: " + id;
        if(ready == true) {
            order+= "\n Ready";
        }
        else {
            order+= "\n Not Ready";
        }

        for(int i = 0; i < items.length; i++)
        {
            order+= "\n " + items[i];
        }
        return order;

    }


}