class MobileRechargeException extends Exception{

    MobileRechargeException(String msg){
        super(msg);
    }
}

class Mobile{

    static void isRechargeValid(int n){
        try{
            for(int i=1; ; i++){
                if(i<=n){
                    System.out.print(i + " ");
                }
                else{
                    System.out.println();
                    MobileRechargeException mre = new MobileRechargeException("Recharge validity Expired!!!");
                    throw mre;
                }
            }
        }
        catch(MobileRechargeException mre){
            System.out.println(mre);
        }
    }

    public static void main(String[]args){
        System.out.println("Mobile Recharge successfully for 31 days");
        isRechargeValid(31);
    }
}