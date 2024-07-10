import java.util.Scanner;
class string_reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = sc.next();
        String rev=" ";
        int length=a.length();
        for(int i=length-1;i>=0;i--)
        {
            rev=rev+a.charAt(i);
        }
        System.out.println(rev);
    }
}