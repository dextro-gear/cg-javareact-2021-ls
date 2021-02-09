package exceptionex;


public class ProductMain {

    public static void main(String[] args) {
        ProductMain app = new ProductMain();
        int productIdInput=123;//
        Product product = app.fetchProductFromServer(productIdInput);
        app.display(product);
        System.out.println("bye, see you");

    }

    Product fetchProductFromServer(int productID){
        Product product = new Product(productID,"samsung");
        return product;
    }

    void display(Product product) {
        try {
            System.out.println("inside display, before product details are to be displayed");
            System.out.println("product=" + product.getId() + " -" + product.getName());
            System.out.println("product details are displayed");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("sorry we couldn't display product details right now, check if your productid is correct");
        }
    }


}
