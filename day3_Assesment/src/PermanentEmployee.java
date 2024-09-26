public class PermanentEmployee extends Employee {
    int pf;
    public PermanentEmployee(int id, String name, float basicSalary, int pf) {
        super(id, name, basicSalary);
        this.pf = pf;
    }
    @Override
    public void calcNetSalary() {
        netSalary=basicSalary-pf;
    }
    @Override
    public void calcBonus() {
    if(pf<1000)
    {
        bonus=0.1f*basicSalary;
    }
    else if(pf>=1000 &&pf<1500)
    {
        bonus=0.115f*basicSalary;
    }
    else if(pf>=1500 &&pf<1800)
    {
        bonus=0.12f*basicSalary;
    }
    else {
        bonus=0.15f*basicSalary;
    }
    }
    @Override
    public void Display()
    {
        super.Display();
    }
}
