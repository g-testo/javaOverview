class Main {
    public static String word = "Hello ";

    static class NestedClass{
        public static String nestedWord = "World";
        public void getCombinedWords(){
            System.out.println(word + nestedWord);
        }
    }

    public static void main(String[] args) {
        // List<Integer> listy = new ArrayList<>();
        // listy.add(100);
        // listy.add(20);
        // listy.add(50);
        // listy.add(80);
        // listy.add(25);
        // Collections.sort(listy);
        // System.out.println(listy);
        Main.NestedClass nestedClass = new Main.NestedClass();

        nestedClass.getCombinedWords();
    }
}

// class Main 
// {  
//     public static void main(String[] args) 
//     { 
//         // accessing an inner class 
//         Main main = new Main(); 
//         InnerClass innerObject = main.new InnerClass(); 
        
//         innerObject.display(); 
        
//     } 

//     // static member 
//     static int outer_x = 10; 
      
//     // instance(non-static) member 
//     int outer_y = 20; 
      
//     // private member 
//     private int outer_private = 30; 
      
//     // inner class 
//     class InnerClass 
//     { 
//         void display() 
//         { 
//             // can access static member of outer class 
//             System.out.println("outer_x = " + outer_x); 
              
//             // can also access non-static member of outer class 
//             System.out.println("outer_y = " + outer_y); 
              
//             // can also access private member of outer class 
//             System.out.println("outer_private = " + outer_private); 
          
//         } 
//     } 
// }