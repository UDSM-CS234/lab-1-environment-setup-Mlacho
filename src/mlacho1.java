public class mlacho1 {

    public static void main(String[]args){
        double a=-9.81;
        double Vi=0;
        double Xi=0;
        double Xt;
        int t=10;
        Xt= 0.5*a*t*t+Vi*t+Xi;
        System.out.println("The value of Xt is: "+Xt +"m");
    }
}
