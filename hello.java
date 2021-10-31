import java.util.Scanner; 
class hello
{
    public static void main (String args[ ]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money you earned with youtube");
        double money = sc.nextDouble();
        System.out.println("Enter no. of views you got");
        double views = sc.nextDouble();
        double income_per_video = (money/views)*1000;
        System.out.println("You earned per video is "+ income_per_video+ "$");
        sc.close();
    }
    public static void error(){
        throw new RuntimeException("Look at brighter side 'do it again'");
    }

}  

