class student{
    String name;
    int academicScore;

    public student(String name,int acadamicScore){
        this.name=name;
        this.academicScore=acadamicScore;
    }

    public void displayAcadamecScore(){
        System.out.println("Student Name:" +name);
        System.out.println("Acadamic Score:" +academicScore);
    }
}

interface Sports{
    int getSportsScore();
    void dispalySportsScore();
}

class Result extends student implements Sports{
    int sportsScore;
    public Result(String name,int acadamicScore,int sportsScore){
        super(name,acadamicScore);
        this.sportsScore=sportsScore;
    }

    public int getSportsScore(){
        return sportsScore;
    }
    public void dispalySportsScore(){
        System.out.println("Sports Score:" +sportsScore);
    }
    
    public void displayResult(){
        displayAcadamecScore();
        dispalySportsScore();
    }
}

public class Main{
    public static void main(String[] args){
        Result student1 = new Result("Alice", 88, 92);
        student1.displayResult();
    }
}