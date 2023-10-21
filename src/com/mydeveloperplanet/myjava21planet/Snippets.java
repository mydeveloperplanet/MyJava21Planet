package com.mydeveloperplanet.myjava21planet;

public class Snippets {

    /**
     * this is an example in Java 17
     * <pre>{@code
     *    if (success) {
     *        System.out.println("This is a success!");
     *    } else {
     *        System.out.println("This is a failure");
     *    }
     * }
     * </pre>
     * @param success
     */
    public void example1(boolean success) {
        if (success) {
            System.out.println("This is a success!");
        } else {
            System.out.println("This is a failure");
        }
    }

    /**
     * this is an example for inline snippets
     * {@snippet :
     *    if (success) {
     *        System.out.println("This is a success!");
     *    } else {
     *        System.out.println("This is a failure");
     *    }
     * }
     *
     * @param success
     */
    public void example2(boolean success) {
        if (success) {
            System.out.println("This is a success!");
        } else {
            System.out.println("This is a failure");
        }
    }

    /**
     * this is an example for external snippets
     * {@snippet file="SnippetsExternal.java" region="example3" }"
     *
     * @param success
     */
    public void example3(boolean success) {
        if (success) {
            System.out.println("This is a success!");
        } else {
            System.out.println("This is a failure");
        }
    }

    /**
     * this is an example for highlighting
     * {@snippet file="SnippetsExternal.java" region="example4" }"
     *
     * @param success
     */
    public void example4(boolean success) {
        if (success) {
            System.out.println("This is a success!");
        } else {
            System.out.println("This is a failure");
        }
    }

}
