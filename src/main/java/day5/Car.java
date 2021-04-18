package day5;

public class Car {
    private int yearOfIssue;
    private String colour;
    private String model;

    public void setYearOfIssue (int yearOfIssue1){
        yearOfIssue = yearOfIssue1;
    }
    public void setColour (String carColour){
        colour = carColour;
    }
    public void setModel (String carModel){
        model = carModel;
    }
    public int getYearOfIssue(){
        return yearOfIssue;
    }
    public String getColour(){
        return colour;
    }
    public String getModel(){
        return model;
    }
}
