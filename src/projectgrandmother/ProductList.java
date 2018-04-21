package projectgrandmother;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductList {

    private File productListFile;
    private List<Product> productList;

    public ProductList(String pathToFile) throws IOException {
        productListFile = new File(pathToFile);
        productList = new ArrayList<>();

        parseProductListFromString(Utils.readFileContent(productListFile));
    }


    private void parseProductListFromString(String productsString){
        String[] products = productsString.split("/");
        for (String product : products) {
            String[] oneProduct = product.split(":");

            productList.add(new Product(oneProduct[0], Double.parseDouble(oneProduct[2]), Integer.parseInt(oneProduct[1])));
        }
    }

    public Product getMaxProduct() {
        Product productMaxCount = productList.get(0);
        for (Product product : productList) {
            if(productMaxCount.getCount() < product.getCount()){
                productMaxCount = product;
            }
        }

        return productMaxCount;
    }

    public double getTotalPrice(){
        double price = 0;
        for (Product product : productList) {
            price += product.getPrice() * product.getCount();
        }

        return price;
    }

    public boolean hasListDoubleProduct(){
        for (Product product : productList) {
            for (Product product1 : productList) {
                if(product.getName().equals(product1.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

}
