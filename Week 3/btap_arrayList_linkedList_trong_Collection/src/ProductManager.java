import java.util.ArrayList;
import java.util.Collections;

public class ProductManager {
    ArrayList<Product> arrayList;

    public ProductManager(){
        arrayList = new ArrayList<>();
    }



    public void add(Product element){
        arrayList.add(element);
    }

    public void add(int index, Product element) {
        arrayList.add(index, element);
    }

    public Product remove(int id) {
       for (Product i: arrayList){
           if (i.getId()==id)
               arrayList.remove(i);
       }
            return arrayList.get(id);
    }

    public void edit(int id,String newProduct,double newPrice){
        for (Product i:arrayList) {
            if (i.getId() == id) {
                i.setPrice(newPrice);
                i.setProduct(newProduct);
            }
        }
    }

    public void display(){
        for (Product i: arrayList){
            System.out.println(i);
        }
    }

    public Product search(String product){
        for(Product i: arrayList){
            if (i.getProduct().equals(product)){
                return i;
            }
        } return null;
    }

    public  void sort(){
        Collections.sort(arrayList);
    }

}
