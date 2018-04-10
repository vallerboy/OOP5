package shop;

public class MenuLogic {

    private Product[] products;
    private Category[] categories;

    private static final int MAX_PRODUCTS  = 100;
    private static final int MAX_CATEGORIES  = 100;

    public MenuLogic(){
        products = new Product[MAX_PRODUCTS];
        categories = new Category[MAX_CATEGORIES];
    }

    public void addCategory(Category category){
        for (int i = 0; i < categories.length; i++) {
            if(categories[i] == null){
                categories[i] = category;
                break;
            }
        }
    }

    public void addProduct(Product product){
        for (int i = 0; i < products.length; i++) {
            if(products[i] == null){
                products[i] = product;
                break;
            }
        }
    }

    public Category findCategoryByName(String name){
        for (Category category : categories) {
            if(category != null && category.getName().equalsIgnoreCase(name)){
                return category;
            }
        }

        return null;
    }

    public Product[] getProducts(){
        return products;
    }
}
