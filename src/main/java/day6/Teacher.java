package day6;

import java.util.Random;

//внутри метода случайным образом генерируется число от 2 до 5, затем в консоль выводится строка: "Преподаватель
// ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
//Все слова, написанные большими буквами, должны быть заменены соответствующими значениями. ОЦЕНКА должна принимать
// значения "отлично”, "хорошо”, "удовлетворительно" или "неудовлетворительно", в зависимости от значения случайно
// сгенерированного числа.
public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(String student) {
        Random random = new Random();
        int note = random.nextInt(3)+2;
        String note1 = null;
        switch (note){
            case 2:
                note1 = "неудовлетворительно";
                break;
            case 3:
                note1 = "удовлетворительно";
                break;
            case 4:
                note1 = "хорошо";
                break;
            case 5:
                note1 = "отлично";
                break;

        }
        System.out.println("Преподаватель " + getTeacherName() + " оценил студента с именем " + student + " по предмету " + subject + " на оценку " + note1);

    }
}



