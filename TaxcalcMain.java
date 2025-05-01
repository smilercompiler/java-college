public class TaxcalcMain {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        double x = invoice.calculateTotalWithTax(670.5);
        System.out.println(x);
        invoice.displayGST();
       double y =  invoice.gst = 55.0; // will give an error
       System.out.println(y);
       
    }
}
