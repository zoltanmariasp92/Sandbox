/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Sandbox;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public String getFarewell() {
        return "Good bye!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(new App().getFarewell());
    }
}
