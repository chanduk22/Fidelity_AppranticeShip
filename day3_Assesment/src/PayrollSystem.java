public class PayrollSystem {
    public static void main(String[] args) {
        PermanentEmployee pe=new PermanentEmployee(101,"Esther",25000,1500);
        pe.calcBonus();
        pe.calcNetSalary();
        pe.Display();
        TemporaryEmployee te=new TemporaryEmployee(102,"Ganesh",0,1500,20);
        te.calcNetSalary();
        te.calcBonus();
        te.Display();
    }
}
