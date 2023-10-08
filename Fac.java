class fact{
    public static void main(String[] args){
        int n=5;// Declaraing Variables
        int result=1;
        //Processing
        while(n>=1){
            result=result*n;
            n=n-1;
            //Display op
            System.out.println("Factorial of " +n+ " is " +result);
        }
    }
}