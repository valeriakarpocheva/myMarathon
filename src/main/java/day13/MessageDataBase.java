package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDataBase {
    public static List<Message> messageList = new ArrayList<Message>(); //инициализировать лист


    public static void addNewMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messageList.add(message);
        //этот метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text. Отправка в нашем
        // контексте означает добавление сообщения в нашу “базу данных”.
    }

    public static List<Message> getMessages() {
        return messageList;
        //возвращает список всех сообщений в “базе данных”.
    }

    public static void showDialogue(User u1, User u2) {
        for (Message message : messageList) {
            if (message.getSender() == u1 && u2 == message.getReceiver()
                    || message.getSender() == u2 && u1 == message.getReceiver()) {

                System.out.println(message.getSender() + ": " + message.getText());
                //этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2. Формат вывода должен быть таким:
                //user1: Привет!
                //user2: Привет, user1!
                //user1: Как у тебя дела?
                //user2: Все ок, спасибо :)
            }
        }
    }
}
