import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        ArrayList<Product> arrayList = new ArrayList<>();

        Product product = new Product(0, "Iphone", "Apple", 1000, null);
        Product product1 = new Product(1, "Galaxy", "Samsung", 900, null);
        Product product2 = new Product(2, "Mate20", "Huawei", 950, null);
        Product product3 = new Product(3, "Bphone1", "Bphone", 800, null);


        productManager.addProduct(arrayList, product);
        productManager.addProduct(arrayList, product1);
        productManager.addProduct(arrayList, product2);
        productManager.addProduct(arrayList, product3);


        System.out.println(productManager.searchByProductPrice(arrayList,800));

        productManager.printProductList(productManager.newArrayList, "C:\\Users\\PC\\Desktop\\2.txt");


    }
}


