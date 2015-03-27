/**
 * Created by ivann on 27.03.15.
 */
public class Main {

    public static void main(String[] argv)
    {
        //printing values of argv array and number of array elements
        if (argv.length > 0) {
            for (String arg : argv)
            {
                System.out.println(arg);
            }
            System.out.printf("%d parameters passed", argv.length);
        }
        else{System.out.println("No arguments were passed");}


    }
}
