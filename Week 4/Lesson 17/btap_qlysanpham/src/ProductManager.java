import java.util.ArrayList;

public class ProductManager {
    ArrayList<Product> arrayList = new ArrayList<>();


    public void addProduct(Product product){
       arrayList.add(product);
   }

   public Object searchById(int id){
       Product product = new Product();
       if (product.getProductId() == id){
           return arrayList.get(id);
       } else
           return -1;
   }

    @Override
    public String toString() {
        return "ProductManager{" +
                "arrayList=" +
                "\n"+
                arrayList +
                '}';
    }
}
