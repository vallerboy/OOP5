package shop;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {
    private Scanner scanner;
    private MenuLogic logic;

    public Menu() {
        scanner = new Scanner(System.in);
        logic = new MenuLogic();
    }

    public void start() {
        System.out.println("Witaj! Co chcesz zrobić?");

        String answer;
        do {
            printChooseList();

            System.out.print("Wybór: ");

            checkAnswer(answer = scanner.nextLine());
        }while (!answer.equalsIgnoreCase("exit"));
    }

    private void checkAnswer(String s) {
        switch (s){
            case "1": {
                getProductDataFromConsole();
                break;
            }
            case "2": {
                getCategoryDataFromConsole();
                break;
            }
            case "3":{
                printProductList();
            }
        }
    }

    private void printProductList() {
        for (Product product : logic.getProducts()) {
            System.out.println(product.toString());
        }
    }

    private void getCategoryDataFromConsole() {
        Category newCategory = new Category();

        System.out.print("Podaj nazwę: ");
        newCategory.setName(scanner.nextLine());

        if(isCategoryCorrect(newCategory.getName())){
            System.out.println("Ta jest zła");
        }

        logic.addCategory(newCategory);
        System.out.println("~~~~~Dodano nową kategorie~~~~");
    }

    private boolean isCategoryCorrect(String name) {
        if(!Pattern.matches("[A-Z].+", name)){
            return false;
        }
        return logic.checkIfCategoryExist(name);
    }

    private void getProductDataFromConsole() {
        Product newProduct = new Product();

        System.out.print("Podaj nazwę: ");
        newProduct.setName(scanner.nextLine());

        System.out.print("Podaj wagę: ");
        newProduct.setWeight(Float.valueOf(scanner.nextLine()));

        System.out.print("Podaj kategorię: ");
        Category category = logic.findCategoryByName(scanner.nextLine());
        if (checkCategory(category)) return;

        newProduct.setCategory(category);

        logic.addProduct(newProduct);
        System.out.println("~~~~~Dodano nowy produkt~~~~");
    }

    private boolean checkCategory(Category category) {
        if(category == null){
            System.out.println("Nie ma takiej kategori!");
            return true;
        }
        return false;
    }


    private void printChooseList() {
        System.out.println("1 - Dodaj produkt");
        System.out.println("2 - Dodaj kategorie");
        System.out.println("3 - Pokaż produkty");
        System.out.println("exit - Aby wyjść");
    }
}
