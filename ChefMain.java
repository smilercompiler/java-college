public class ChefMain {
    
        public static void main(String[] args) {
            Chef[] chefs = { new ItalianChef(), new ChineseChef(), new MexicanChef() };
            for (Chef chef : chefs) {
                chef.makeSpecialDish();
            }
        }
    }

