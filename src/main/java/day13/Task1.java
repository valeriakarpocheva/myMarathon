package day13;

import static day13.MessageDataBase.showDialogue;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Juan");
        User u2 = new User("Angela");
        User u3 = new User("Dana");

        u1.sendMessage(u2, "Hello");
        u1.sendMessage(u2, "What's `up?");

        u2.sendMessage(u1, "Hey");
        u2.sendMessage(u1, "Working");
        u2.sendMessage(u1, "You?");

        u3.sendMessage(u1, "Привет");
        u3.sendMessage(u1, "Как ты");
        u3.sendMessage(u1, "Что нового");

        u1.sendMessage(u3, "Привет");
        u1.sendMessage(u3, "Нормально");
        u1.sendMessage(u3, "Ничего нового, у тебя?");

        u3.sendMessage(u1, "Тоже");

        showDialogue(u3, u1);
    }
}
