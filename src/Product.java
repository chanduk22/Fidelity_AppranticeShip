public class Product {
    private int ProductId;
    private String ProductName;
    private String Category;
    static String StoreName="Fidelity";
    public void Initialize(int ProductId, String ProductName, String Category)
    {
        this.ProductId=ProductId;
        this.ProductName=ProductName;
        this.Category=Category;
    }
    public void Display()
    {
        System.out.println("Product ID: "+ProductId+"\nProduct Name: "+ProductName+"\nCategory: "+Category);
    }
    public static void Show()
    {
        System.out.println("Store name "+StoreName);
    }
}
