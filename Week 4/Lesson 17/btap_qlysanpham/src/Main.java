public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Product product = new Product(0, "Iphone", "Apple", 1000, null);
        Product product1 = new Product(1, "Galaxy", "Samsung", 900, null);
        Product product2 = new Product(2, "Mate20", "Huawei", 950, null);
        Product product3 = new Product(3, "Bphone pro", "Bphone", 800, null);


        productManager.addProduct(product);
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);

        System.out.println(productManager.toString() +"\n");


    }
}
