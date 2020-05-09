import java.util.Scanner;

class Main {
    private static final int SIZE = 0;

    public static void main(String[] args) throws Exception {

        System.out.println("Please give me a String");

        Scanner scan = new Scanner(System.in);
        String stringFromUser = scan.next();

        if(stringFromUser.equals("exit")){
            System.out.println("Exception!");
            throw new Exception();
        }

        System.out.println(stringFromUser);

        scan.close();
        // int inty = 10/0;

        // System.out.println("After Exception");

        // int inty;
        // try {
        //     inty = 10/0;
        // } catch(ArithmeticException ae) {
        //     System.out.println("You can't divide by zero");
        //     inty = 0;
        // }
        // System.out.println(inty);
        // Main main = new Main();
        // try {
        //     main.writeList();
        // } catch (Exception e) {

        // }
        
    }

    // public void writeList() throws IOException{
    //     PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
    //     out.close();
    // }
    
}