package consolidateduplicate.good;

public class Main {


    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary(){

        double result = 0;

        if(isEligibleExtraSalary()){
            result = 500;
        }else{
            result = 0;
        }

        sendMessagge(); // metodo que se repite en la condicion

        return result;
    }
    
    private void sendMessagge() {
        // send email
        // connect smtp
        System.out.println("sending message");
    }

    public boolean isEligibleExtraSalary(){

        // agrupar condiciones utilizando And (&&) y OR (||)
        boolean estudios = seniority<1 || education<1;
        boolean antiguedad = incidents > 10 && !certification;

        return estudios || antiguedad;
    }



}

