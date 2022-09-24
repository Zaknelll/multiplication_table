import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("Введите максимальный множитель:");

        Scanner in = new Scanner(System.in);
        int counter = in.nextInt();
        in.close();

        for (int i=1;i<= counter;i++){
            System.out.print(" ");

            double k = Math.ceil(Math.log10(counter*counter))- Math.ceil(Math.log10(i));
            for (int t=0; t<=k;t++)
            {
                System.out.print(" ");
            }
            System.out.print (i);
        }

        for (int j=1; j<=counter; j++){
            System.out.print ("\n"+j);

            for (int i=1; i<=counter; i++){
                double f = Math.ceil(Math.log10(counter*counter))- Math.ceil(Math.log10(j*i));
                if (j*i%10==0 | j*i==1)
                {
                    if (j*i==1)
                    {
                        for (int n=0; n<=Math.ceil(Math.log10(counter*counter)); n++)
                        {
                            System.out.print(" ");
                        }
                    }
                    else
                    {
                        int x=j*i;
                        int maxSkip=0;
                        while (x!=0) {
                            x=x/10;
                            maxSkip++;
                        }
                        System.out.print(" ");
                        double k = Math.ceil(Math.log10(counter*counter))- maxSkip;
                        for (int n=0; n<=k; n++){
                            System.out.print(" ");
                        }
                    }
                }
                else
                {
                    System.out.print(" ");
                    for (int n=0; n<=f; n++){
                        System.out.print(" ");
                    }
                }
                System.out.print (j*i);
            }
        }
    }
}
