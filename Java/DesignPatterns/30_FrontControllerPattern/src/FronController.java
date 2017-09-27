public class FronController {
    private Dispatcher dispatcher;

    public FronController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page Requested:" + request);
    }

    public void dispatchRequest(String request) {
        trackRequest(request);
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
