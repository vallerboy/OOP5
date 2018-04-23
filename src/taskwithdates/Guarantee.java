package taskwithdates;

import java.time.LocalDate;

public class Guarantee {
    private LocalDate guarantee;
    private Product product;

    public Guarantee(LocalDate guarantee, Product product) {
        this.guarantee = guarantee;
        this.product = product;
    }

    public boolean isValid(){
        if(LocalDate.now().isAfter(guarantee)){
            product = null;
            return false;
        }
        return true;
    }
}
