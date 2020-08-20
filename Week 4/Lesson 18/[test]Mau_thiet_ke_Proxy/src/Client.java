public class Client {
    public static void main(String[] args) {
        System.out.println("Khoi tao image: ");
        ProxyImage proxyImage = new ProxyImage("https://gpcoder.com/favicon.ico");

        System.out.println("----");
        System.out.println("Goi real service 1: ");
        proxyImage.showImage();

        System.out.println("----");
        System.out.println("Goi real service 1: ");
        proxyImage.showImage();
    }
}
