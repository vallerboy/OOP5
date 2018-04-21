package projectgrandmother;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class ProductList {

    private File productListFile;
    private List<Product> productList;
    private double[] nominals;

    public ProductList(String pathToFile, double ... nominals) throws IOException {
        productListFile = new File(pathToFile);
        productList = new ArrayList<>();
        this.nominals = nominals;

        startParsing();
    }

    private void startParsing() throws IOException, IllegalStateException {
        String content  = Utils.readFileContent(productListFile);
        if(checkFileContent(content)){
            parseProductListFromString(content);
        }else{
            throw new IllegalStateException("Incorrect content of file");
        }
    }

    private boolean checkFileContent(String content){
        //return Pattern.matches("(.+:.+:.+/?)+", content); //todo
        return true;
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


    public int getMinMonetCountToPay(){
        Arrays.sort(nominals);

        double totalPrice = getTotalPrice();
        int counter = nominals.length - 1;
        int monetCounter = 0;

        while (totalPrice != 0) {
            if(totalPrice - nominals[counter] >= 0) {
                totalPrice -= nominals[counter];
                monetCounter++;
            }else{
                counter--;
            }
        }

        return monetCounter;
    }

}
