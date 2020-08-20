public class ProxyImage implements Image {
    private Image realImage;
    private String url;

    public ProxyImage(String url){
        this.url = url;
        System.out.println("Image uploaded " + this.url);
    }

    @Override
    public void showImage() {
        if (realImage == null){
            realImage = new RealImage(this.url);
        } else {
            System.out.println("Da co anh duoc tao r");
        }
        realImage.showImage();
    }
}
