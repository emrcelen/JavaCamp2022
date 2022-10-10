public class ProductValidator {

    static { // birden fazla static blok açabilirsin fakat yaygın değil.
        System.out.println("Static yapıcı blok çalıştı.");
    }

    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı.");
    }
    public static boolean isValid (Product product){
        if(product.getPrice() > 0 && !product.getName().isEmpty())
            return true;
        else
            return false;
    }
    public void notStatic (){

    }
}
