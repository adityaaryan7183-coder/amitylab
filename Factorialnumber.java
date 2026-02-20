 class Factorialnumber {
    int calculateFact(int n){
    int ans=1;

    for(int i=1;i<n;i++){
        ans=ans*i;
    }
        return ans;
    
    
}
public static void main(string[]args){
    scanner sc=new scanner(system.in);
    system.out.println("enter a number:");
    int value=sc.nextint();

    Factorialprogram obj=new Factorialprogram();

    int result=obj.calculateFact(value);

    system.out.println("Factorial of"+value+"is:"+ result);
}
 }
        

    

