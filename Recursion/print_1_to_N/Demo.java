public class Demo{
    public static void main(String args[]){
        int x = 10;
        // using loop
        // printNumbers(x);
        // TC - O(n)
        // SC - O(1)
        
        
        // using recusrion print in order
        printAllNumbersStraight(x);
         // TC - O(n)
        // SC - O(n)
        
        // using recusrion opposite
        // printAllNumbers(x);
         // TC - O(n)
        // SC - O(n)
        
        
        
    }


    static void printAllNumbersStraight(int x){
        if(x==0) return ;
        
        else {
            printAllNumbersStraight(x-1);
            System.out.println(x);
        }
        
        return;
    }

    static void printAllNumbers(int x){
        if(x==0) return ;
        
        else {
            System.out.println(x);
            printAllNumbers(x-1);
        }
        return;
    }



    static void printNumbers(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        return;
    }
}
