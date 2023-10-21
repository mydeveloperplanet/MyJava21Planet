public class SnippetsExternal {

    public void example3(boolean success) {
        // @start region=example3
        if (success) {
            System.out.println("This is a success!");
        } else {
            System.out.println("This is a failure");
        }
        // @end
    }

    public void example4(boolean success) {
        // @start region=example4
        if (success) {
            System.out.println("This is a success!"); // @highlight substring="println"
        } else {
            System.out.println("This is a failure");
        }
        // @end
    }

}
