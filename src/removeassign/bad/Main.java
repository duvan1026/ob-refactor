package removeassign.bad;

import extractvariable.bad.Order;

public class Main {

    double calculateDiscount(Order order, double totalPrice ){

        if(order == null || order.getPrice()  == null) // programación defensiva
            return totalPrice;

        if( order.getPrice() > 100 )
            totalPrice += order.getPrice() * order.getOfter(); // sobreescribe totalPrice

        return totalPrice;
    }
}
