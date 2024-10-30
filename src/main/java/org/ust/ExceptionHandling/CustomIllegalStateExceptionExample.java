package org.ust.ExceptionHandling;

public class CustomIllegalStateExceptionExample {

    private boolean isConnected = false;

    // Method to connect to a service
    public void connect() {
        if (isConnected) {
            throw new IllegalStateException("Connection is already established. Cannot connect again.");
        }
        isConnected = true;
        System.out.println("Connected successfully.");
    }

    // Method to disconnect from the service
    public void disconnect() {
        if (!isConnected) {
            throw new IllegalStateException("Cannot disconnect as no connection was established.");
        }
        isConnected = false;
        System.out.println("Disconnected successfully.");
    }

    public static void main(String[] args) {
        CustomIllegalStateExceptionExample connectionService = new CustomIllegalStateExceptionExample();

        try {
            connectionService.disconnect();  // This will throw IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            connectionService.connect();      // Connect successfully
            connectionService.connect();      // This will throw IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
