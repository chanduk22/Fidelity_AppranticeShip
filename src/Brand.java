public class Brand extends Category{
    String BrandName;
    @Override
    public void Display() {
        super.Display();
        System.out.println("BrandName: " + BrandName);
    }
}
