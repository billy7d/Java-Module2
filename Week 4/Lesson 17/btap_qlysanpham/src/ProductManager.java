import java.io.*;
import java.util.ArrayList;

public class ProductManager {


    ArrayList<Product> newArrayList = new ArrayList<>();

    public void addProduct(ArrayList<Product> arrayList, Product product) {
        arrayList.add(product);
    }

    public Product searchById(ArrayList<Product> arrayList, int id){
      for (Product i: arrayList){
          if (i.getProductId() == id){
              newArrayList.add(i);
              return i;
          }

      }
      return null;
   }

    public Product searchByProductName(ArrayList<Product> arrayList, String productName){
        for (Product i: arrayList){
            if (i.getProductName().equals(productName)){
                newArrayList.add(i);
                return i;
            }

        }
        return null;
    }

    public Product searchByProductBrand(ArrayList<Product> arrayList, String productBrand){
        for (Product i: arrayList){
            if (i.getProductBrand().equals(productBrand)){
                newArrayList.add(i);
                return i;
            }

        }
        return null;
    }

    public Product searchByProductPrice(ArrayList<Product> arrayList, double price){
        for (Product i: arrayList){
            if (i.getPrice()==price){
                newArrayList.add(i);
                return i;
            }

        }
        return null;
    }

    public void printProductList(ArrayList<Product> arrayList , String destFilePath)  {

            try {
                OutputStream outputStream = new FileOutputStream(destFilePath);

                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

                for (Product i:arrayList){
                    outputStreamWriter.write(String.valueOf(i));
                }
                outputStreamWriter.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }


    }


}

