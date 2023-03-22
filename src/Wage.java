public class Wage {
    private double wage;

    public Wage(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public double socialSecurity() {
        double socialSecurity = wage * 0.265;
        double rest = wage - socialSecurity;
        return rest;
    }

    public double socialSecurityWorker() {
        double socialSecurityWorker = wage * 0.105;
        double rest = wage - socialSecurityWorker;
        return rest;
    }

    private double aguinaldo(){
        double aguinaldo = wage * 0.083;
        double rest = wage - aguinaldo;
        return rest;
    }
}
