package day6;

public class Car {
    private int yearOfIssue;
    private String colour;
    private String model;

    public void setYearOfIssue(int yearOfIssue1) {
        yearOfIssue = yearOfIssue1;
    }

    public void setColour(String carColour) {
        colour = carColour;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        int difference = 0;
        if (inputYear >= yearOfIssue) {
            difference = inputYear - yearOfIssue;
        }
        if (yearOfIssue > inputYear) {
            difference = yearOfIssue - inputYear;
        }
        return difference;
    }
}
