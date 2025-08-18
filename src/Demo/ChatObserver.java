package Demo;

public class ChatObserver {

    private ChatObservable[] chatObservable = new ChatObservable[100];
    private int nextIndex;

    public void addChatBox(ChatObservable obj) {
        chatObservable[nextIndex++] = obj;
    }

    public void setMessage(String msg) {
        for (int i = 0; i < nextIndex; i++) {
            chatObservable[i].sendMessage(msg);
        }
    }
    
    public boolean userNameCheck(String userName){
        for (int i = 0; i < nextIndex; i++) {
            if (chatObservable[i].getUserName().equalsIgnoreCase(userName)) {
                return false;
            }
        }
        return true;
    }
}
