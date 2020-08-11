public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Iphone",1000);
        Product product2 = new Product(2,"Samsung",900);
        Product product3 = new Product(3,"Nokia",700);
        Product product4 = new Product(4,"Xiaomi",650);
        Product product5 = new Product(5,"Asus",750);


        ProductManager arrayList = new ProductManager();

        arrayList.add(product);
        arrayList.add(product2);
        arrayList.add(product3);
        arrayList.add(product4);
        arrayList.add(product5);


        arrayList.sort();
        arrayList.display();



    }
}
