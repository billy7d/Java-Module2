import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        ArrayList<Product> arrayList = new ArrayList<>();

        Product product = new Product(0, "Iphone", "Apple", 1000, null);
        Product product1 = new Product(1, "Galaxy", "Samsung", 900, null);
        Product product2 = new Product(2, "Mate20", "Huawei", 950, null);
        Product product3 = new Product(3, "Bphone pro", "Bphone", 800, null);


        productManager.addProduct(arrayList, product);
        productManager.addProduct(arrayList, product1);
        productManager.addProduct(arrayList, product2);
        productManager.addProduct(arrayList, product3);

//        System.out.println(productManager.toString() +"\n");

        for (Product i : arrayList) {
            if (i.getProductName().equals("asd")) {
                System.out.println(i);
                break;

            } else
                System.out.println("Not found");
                break;
        }


//        System.out.println(arrayList.get(2));
    }
}


