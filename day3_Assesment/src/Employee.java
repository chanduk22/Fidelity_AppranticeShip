public class Employee {
    int id;
    String name;
    float basicSalary;
    float bonus;
    float netSalary;
    public Employee(int id, String name, float basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public void calcNetSalary() {

    }
    public void calcBonus() {

    }
    public void Display()
    {
        System.out.println("id :"+id+"\nname :"+name+"\nbasicSalary :"+basicSalary+"\nbonus :"+bonus+"\nnetSalary :"+netSalary);
    }
}
