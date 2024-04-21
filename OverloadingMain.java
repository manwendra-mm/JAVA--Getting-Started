//Overloading of main method

class OverloadingMain{
    public static void main(String s[]) //This Method will be called by Default, if main method is Overloaded 
    {
        System.out.println("ENTRY POINT TO THE PROGRAM");
        main(12, 12.5);
        main(15);
        main(10, 11);
    }
    public static void main (int x){
        System.out.println("main() method with one int parmeter");
    }
    public static void main (int x, int y){
        System.out.println("main() method with two int parmeter");
    }

    public static void main(int x, double y){
        System.out.println("main() method with an int and a double parameter");
    }
}