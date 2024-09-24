public class Category extends Product1 {
    int CatId;
    String CatName;
    @Override
    public void Display() {
        super.Display();
        System.out.println("Category ID: " + CatId+"\nCategory Name: " + CatName);
    }
}
