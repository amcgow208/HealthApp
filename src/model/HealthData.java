package model;

public class HealthData implements Comparable<HealthData>, IHealthData {
    private int Age;
    private double Weight;
    private double Height;
    private double BMI;

    public HealthData() {
        this.Age = 34;
        this.Weight = 187;
        this.Height = 75;
        this.BMI = 25;
    }

    @Override
    public void setAge(int age) {
        this.Age = age;
    }

    @Override
    public int getAge() {
        return this.Age;
    }

    @Override
    public void setWeight(double weight) {
        this.Weight = weight;
    }

    @Override
    public double getWeight() {
        return this.Weight;
    }

    @Override
    public void setHeight(double height) {
        this.Height = height;
    }

    @Override
    public double getHeight() {
        return this.Height;
    }

    @Override
    public void setBMI(double weight, double height) {
        this.BMI = weight / (height * height);

    }

    @Override
    public double getBMI() {
        return this.BMI;
    }

    @Override
    public String toString() {
        String msg = "";
        msg = String.format("%d,%d,%d,%f", this.getAge(), this.getWeight(), this.getHeight(), getBMI());
        return msg;
    }

    public String CSVFormat(){
        String outputStr = this.Age + "," + this.Weight + "," + this.Height + "," + this.BMI;
        return outputStr;
    }

    @Override
    public int compareTo(HealthData healthData){
        if(this.Age == healthData.Age)
            return 0;
        else if(this.Age > healthData.Age)
            return 1;
        else
            return -1;
    }
}