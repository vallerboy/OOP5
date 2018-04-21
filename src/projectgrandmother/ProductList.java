package projectgrandmother;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ProductList {

    private File productListFile;
    private List<Product> productList;

    public ProductList(String pathToFile){
        productListFile = new File(pathToFile);
        productList = new ArrayList<>();
    }




}
