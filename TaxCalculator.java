class TaxCalculator {
    final double gst = 18.0/100;
    final void displayGST()
    {
        System.out.println("GST is : " + gst);
    }
}

class Invoice extends TaxCalculator{
double calculateTotalWithTax(double amount)
{
 return amount + (amount*gst);
}
void displayGST() // overriding a final method
{
    System.out.println("Modified gst is : ");
}
}
