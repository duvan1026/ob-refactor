package removeassign.good;

import extractvariable.bad.Order;

public class Main {

    double calculateDiscount(Order order, double totalPrice ){

        double result = totalPrice;

        if(order == null || order.getPrice()  == null) // programación defensiva
            return result;

        if( order.getPrice() > 100 )
            result += order.getPrice() * order.getOfter(); // sobreescribe totalPrice

        return result;
    }
}
