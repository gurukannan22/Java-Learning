package Programs;

public class Car {
    private String companyName;
    private String color;
    private int year;
    private String modelName;

    public String getClr() { // getter Method
        return color;
    }

    public void setClr(String clr) { // Setter Method
        clr = "Grey";
        this.color = clr;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
