package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions; //лист не инициализирован


    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>(); //лист инициализирован
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user); //this !!!
    }

    public boolean isSubscribed(User user) {
        if (this.subscriptions.contains(user)) { //this !!!
            return true;
        }
        return false;
    }

    public boolean isFriend(User user) {
        if ((this.isSubscribed(user)) == (user.isSubscribed(this))) { //this!!!!!
            return true;
        }
        return false;
    }

    public void sendMessage(User user, String text) {
        MessageDataBase.addNewMessage(this, user, text);
        //отправляет сообщение с текстом text пользователю user. Здесь
        // должен использоваться статический метод из MessageDatabase.

    }
}

