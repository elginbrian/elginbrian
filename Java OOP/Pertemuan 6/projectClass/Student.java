public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private boolean status;

    public Student(){
        name = "";
        address = "";
        age = 0;
    }
    public Student(String n, String a, int ag, double mathGrade, double englishGrade, double scienceGrade){
        name = n;
        address = a;
        age = ag;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
    }
    public void setName(String n){    
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setAge(int ag){
        age = ag;
    }
    public void setMath(int math){
        mathGrade = math;
    }
    public void setEnglish(int english){
        englishGrade = english;
    }
    public void setScience(int science){
        scienceGrade = science;
    }
    private double getAverage(){
        this.average = (this.mathGrade+this.scienceGrade+this.englishGrade)/3;
        return this.average;
    }

    public boolean statusAkhir(){
        if(this.average >= 61){
            this.status = false;
        } else if(this.average <= 60){
            this.status = true;
        } else {
            this.status = true;
        }
        return this.status;
    }
    public void displayMessage(){
        System.out.println("Siswa dengan nama: "+name);
        System.out.println("beramalat di: "+address);
        System.out.println("berumur: "+ age);
        System.out.println("mempunyai nilai rata rata: " + getAverage());
        System.out.println("Apakah remidi: "+ statusAkhir());
    }
}
