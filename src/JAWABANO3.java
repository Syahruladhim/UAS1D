import java.util.ArrayList;

public class UASID {
    public String getMessageID() {
        return MessageID;
    }

    public void setMessageID(String messageID) {
        MessageID = messageID;
    }

    public String getMessageName() {
        return MessageName;
    }

    public void setMessageName(String messageName) {
        MessageName = messageName;
    }

    public ArrayList getContext() {
        return Context;
    }

    public void setContext(ArrayList context) {
        Context = context;
    }

    String MessageID;
    String MessageName;
    ArrayList Context;
}

