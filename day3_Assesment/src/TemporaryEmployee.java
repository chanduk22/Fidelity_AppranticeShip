public class TemporaryEmployee extends Employee {
    int dw;
    int noDays;
    public TemporaryEmployee(int id,String name,float basicSalary, int dw, int noDays) {
        super(id,name,basicSalary);
        this.dw = dw;
        this.noDays = noDays;
    }
    @Override
    public void calcNetSalary() {
        netSalary = dw * noDays;
    }
    @Override
    public void calcBonus() {
        if(dw<1000)
        {
            bonus=0.15f*netSalary;
        }
        else if(dw>=1000 && dw<1500)
        {
            bonus=0.12f*netSalary;
        }
        else if(dw>=1500 && dw<1750)
        {
            bonus=0.11f*netSalary;
        }
        else {
            bonus=0.08f*basicSalary;
        }

    }
    @Override
    public void Display()
    {
        super.Display();
    }
}
