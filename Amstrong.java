class Amstrong{
    public static void main(String[] args) {
        int n=153;
        int t=n;
        int sum=0;
        //for count number of digits 
        //------>int d=String.valueOf(n).length();
        while(n>0){
            int r=n%10;
            //sum+=Math.pow(r,d);
            sum+=r*r*r;
            n/=10;
        }
        if(sum == t){
            System.out.println("given is amstrong");
        }
        else{
            System.out.println("not amstrong");
        }
    }
}