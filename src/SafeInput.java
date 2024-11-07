import java.util.Scanner;

public class SafeInput {


    /**
     * gets a string from the user using the console, and it must be at least one character in length
     *
     * @param pipe   a scanner use to get input
     * @param prompt the prompt that tells the user what to enter
     * @return a string of at least 1 character in length
     */
    public static String getNonZeroLensString(Scanner pipe, String prompt) {
        String retVal = "";
        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if (retVal.isEmpty())
                System.out.println("You must enter at least character...");


        } while (retVal.isEmpty());

        return retVal;
    }

    /**
     * gets an input value from the user at the console with no restraint
     *
     * @param pipe   a scanner use to get input
     * @param prompt the prompt that tells the user what to enter
     * @return
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not " + trash);
            }


        } while (!done);

        return retVal;
    }


    /**
     * gets an double value from the user at the console with no restraint
     *
     * @param prompt the prompt that tells the user what to enter
     * @return a double of any value
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double, not " + trash);
            }


        } while (!done);

        return retVal;
    }


    /**
     * get an int from the user via the console within a specified range
     *
     * @param pipe   the scanner to use for input
     * @param prompt the prompt to tell the user what is required
     * @param low    the low inclusive low bound
     * @param high   the inclusive high bound
     * @returnan int withing the specified bounds
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    ;
                    done = true;
                } else {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]: ");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not " + trash);
            }


        } while (!done);

        return retVal;
    }


    /**
     * Gets a Y or N from the user (yes or no) and returns the equivalent
     *
     * @param pipe   scenner to use for input
     * @param prompt tells the user what to enter
     * @return true or false based on Y or N
     */

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String YNResponse = "";
        Boolean retVal = false;
        Boolean done = false;
        do {
            System.out.print(prompt + ": ");
            YNResponse = pipe.nextLine();

            if (!YNResponse.matches("[YyNn]"))
                System.out.println("You must enter [Y/N]: ");
            else {
                done = true;
                switch (YNResponse) {
                    case "Y":
                    case "y":
                        retVal = true;
                        break;
                    case "N":
                    case "n":
                        retVal = false;
                        break;
                }
            }


        } while (!done);

        return retVal;
    }


    /**
     * get an int from the user via the console within a specified range
     *
     * @param pipe   the scanner to use for input
     * @param prompt the prompt to tell the user what is required
     * @param low    the low inclusive low bound
     * @param high   the inclusive high bound
     * @returnan double within the specified bounds
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    ;
                    done = true;
                } else {
                    System.out.println("You must enter a double within the range [" + low + " - " + high + "]: ");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not " + trash);
            }


        } while (!done);

        return retVal;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retVal = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.matches(regEx)) {
                done = true;
            }
            else {
                System.out.println("You must enter a matching expression buddy, not " + retVal);
            }
        } while (!done);
        return retVal;

    }
}

