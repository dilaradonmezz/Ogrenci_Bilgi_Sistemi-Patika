package student;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stNo;
    String classes;
    double avarage;
    boolean ispas;
    int so1;
    int so2;
    int so3;
    int so6;

    Student(String name, String stNo, String classes, Course c1, Course c2, Course c3){
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.name=name;
        this.stNo=stNo;
        this.avarage=0.0;
        this.ispas=false;

    }

    void addBulkExamNote(int note1, int note2, int note3){
        if(note1>=0 && note1 <=100)
            this.c1.note=note1;
        if(note2>=0 && note2 <=100)
            this.c2.note=note2;
        if(note3>=0 && note3 <=100)
            this.c3.note=note3;
    }

    void addBulkVerbalNote(int so1, int so2, int so3){
        if(so1>=0 && so1<=100)
            this.c1.verbalnote=so1;
        if(so2>=0 && so2<=100)
            this.c2.verbalnote=so2;
        if(so3>=0 && so3<=100)
            this.c3.verbalnote=so3;
        

    }
    void ispas(){
        this.avarage=((this.c1.note*0.8 + this.c1.verbalnote*0.2) + (this.c2.note*0.8 + this.c2.verbalnote*0.2) + (this.c3.note*0.8 + this.c3.verbalnote*0.2))/3; //bölü 3.0 yazınca .dan sonra uzuyor
        if(this.avarage >=50) {
            System.out.println("Sınıfı geçti!");
            this.ispas=true;
        }
        else {
            System.out.println("Sınıfta kaldı!");
            this.ispas=false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name + "notu: " + c1.note);
        System.out.println(this.c2.name + "notu: " + c2.note);
        System.out.println(this.c3.name + "notu: " + c3.note);
        System.out.println("ortalamanız: "+ this.avarage);
    }
}
