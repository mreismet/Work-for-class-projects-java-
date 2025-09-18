package Restaurant;

public class orderList
{
    private Order[] orderlist;
    orderList()
    {
        orderlist = new Order[3];
    }
    void addOrder(Order order)
    {

        for(int i = 0; i < orderlist.length;i++)
        {
            if(orderlist[i] == null)
            {
                orderlist[i] = order;
                break;
            }
        }
        Order[] neworder = new Order[orderlist.length * 2];
        for(int i = 0; i < orderlist.length; i++)
        {
            if(orderlist[i] != null) {
                neworder[i] = orderlist[i];
            }
        }
        neworder[orderlist.length] = order;
    }
    void removeOrder(int id) {
        for (int i = 0; i < orderlist.length; i++) {
            if(orderlist != null) {
                if (orderlist[i].getId() == id) {
                    orderlist[i] = null;
                }
            }
        }

    }

    void ReadyOrder(int id)
    {
        for (int i = 0; i < orderlist.length; i++) {
            if(orderlist[i] != null) {
                if (orderlist[i].getId() == id) {
                    orderlist[i].ready = true;
                }
            }
        }
    }

    private void sortOrders()
    {
        for(int i = 0; i < orderlist.length - 1; i++)
        {
            for(int b = 0; b < orderlist.length - 1; b++)
            {
                if(orderlist[b] != null) {
                    if (orderlist[b].getId() > orderlist[b + 1].getId()) {
                        Order temporary = orderlist[b + 1];
                        orderlist[b + 1] = orderlist[b];
                        orderlist[b] = temporary;
                    }
                }
                else
                {
                    Order temporary = orderlist[b + 1];
                    orderlist[b + 1] = orderlist[b];
                    orderlist[b] = temporary;
                }
            }
        }
    }

    String printOrder(int id)
    {
        for (int i = 0; i < orderlist.length; i++) {
            if(orderlist[i] != null) {
                if (orderlist[i].getId() == id) {
                    return orderlist[i].toString();
                }
            }

        }
        return "";
    }

    String printOrders()
    {
        sortOrders();
        String ready = "Ready";
        String notready = "Preparing";
        for(int i = 0; i < orderlist.length; i++)
        {
            if(orderlist[i] != null)
            {
                if(orderlist[i].ready == true)
                {
                    ready += "\n " + orderlist[i].getId();
                }
                else
                    notready += "\n " + orderlist[i].getId();
            }

        }
        return ready + "\n" + notready;

    }
}
