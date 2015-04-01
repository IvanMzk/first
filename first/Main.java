/**
 * Created by ivann on 27.03.15.
 */
//local code review (vtegza): create separated package @ 01.04.15
//local code review (vtegza): source folder should be named as src - not first @ 01.04.15
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
        //local code review (vtegza): do code formatting @ 01.04.15
        else{System.out.println("No arguments were passed");}


    }
}
