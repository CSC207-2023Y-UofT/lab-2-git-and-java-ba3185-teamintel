/**
 * This file contains a few exercises to familiarize you with Java.
 * <p>
 */

public class IntroLab {

    /**
     * Returns a message depending on the given greeting, name, message, and
     * whether the caller likes cats or dogs more.
     * Do NOT change this method!
     *
     * @param greeting   A string with a greeting (e.g. "Hello", "Hey")
     * @param name       A string with a name (e.g. "Jonathan", "Lindsey")
     * @param likes_cats A boolean: true if they like cats more than dogs,
     *                   false otherwise.
     * @param message    A message to be printed out.
     * @return A message using the given parameters.
     */
    public static String printLabMessage(String greeting, String name,
                                  boolean likes_cats, String message) {
        String message_to_print = greeting + "! My name is " + name + "! ";

        if (likes_cats) {
            message_to_print += "I like cats more than dogs! ";
        } else {
            message_to_print += "I like dogs more than cats! ";
        }

        return message_to_print + message;
    }

    public static String chopra75(boolean likes_dogs) {
        if (likes_dogs) {
            return printLabMessage("Hello there!", "\"the Professor\"", false, "Do you have any reservations?");
        } else {
            return printLabMessage("Hello there!", "\"the Professor\"", true, "Deal with it.");
        }
    }

    public static void main(final String[] args) {
        String a = chopra75(true);
        String b = chopra75(false);
        System.out.println(a); // runs case a - true
        System.out.println(b); // runs case b - false

    }
}
