package Demo;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Chat System");
        ChatObserver c1 = new ChatObserver();
        c1.addChatBox(new ChatWindow("Tharindu", c1));
        c1.addChatBox(new ChatWindow("Rasika", c1));

    }
}
