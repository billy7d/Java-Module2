public class Product {
    private int productId;
    private String productName;
    private String productBrand;
    private double price;
    private String Others;



    public Product(){

    }


    public Product(int id, String productName, String productBrand, double price, String others){
        this.productId = id;
        this.productName = productName;
        this.productBrand = productBrand;
        this.price = price;
        this.Others = others;
    }



    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOthers() {
        return Others;
    }

    public void setOthers(String others) {
        Others = others;
    }

    @Override
    public String toString() {
        return  "{"+
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productBrand='" + productBrand + '\'' +
                ", price=" + price +
                ", Others='" + Others + '\'' +
                '}'+
                "\n";
    }
}
