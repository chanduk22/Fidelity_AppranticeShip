public class BankingApplication {
    int acNo;
    String name;
    double bal;
    public BankingApplication(int acNo, String name, double bal) {
        this.acNo = acNo;
        this.name = name;
        this.bal = bal;
    }
    public void PerformTransaction(int amt)
    {
        bal=bal+amt;
        System.out.println("Amount Deposited Rs. "+amt);
    }
    public void PerformTransaction(int amt,boolean Wd)
    {
        if(Wd){
            if(bal>=amt)
            {
                bal=bal-amt;
                System.out.println("Withdrawl amount "+amt+" is successfull");
            }
            else {
                System.out.println("Insufficient Funds");
            }
        }
    }
    public void PerformTransaction(String fromAccount,String toAccount,int amt)
    {
        if(bal>=amt)
        {
            bal-=amt;
            System.out.println("Tranfer of Amount "+amt+" from Account "+fromAccount+" to Account "+toAccount+" is successfull");
        }
        else {
            System.out.println("Insufficient Funds to transfer");
        }
    }
    public void printDetails()
    {
        System.out.println("Account No. : "+acNo+"\nName : "+name+"\nBalance : "+bal);
    }
}
