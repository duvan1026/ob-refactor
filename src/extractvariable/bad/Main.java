package extractvariable.bad;

public class Main {

    void printProductprice(Order order){

        Double totalPrioce = order.getPrice() * order.getQuantity() - order.getOfter() + order.getShipping() * 2;


        System.out.println(totalPrioce);

    }

}
