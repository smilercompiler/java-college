    class Chef {
        public void makeSpecialDish() {
            System.out.println("The chef is making a special dish.");
        }
    }
    
    class ItalianChef extends Chef {
        @Override
        public void makeSpecialDish() {
            System.out.println("Making pasta.");
        }
    }
    
    class ChineseChef extends Chef {
        @Override
        public void makeSpecialDish() {
            System.out.println("Making dumplings.");
        }
    }
    
    class MexicanChef extends Chef {
        @Override
        public void makeSpecialDish() {
            System.out.println("Making tacos.");
        }
    }
    
    
