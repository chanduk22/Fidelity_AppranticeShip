public class SmartWatch extends Product1 {
    int WatchId;
    String WatchName;
    @Override
    public void Display()
    {
        super.Display();
        System.out.println("Watch Id: " + WatchId+"\nWatch Name: " + WatchName);
    }
}
