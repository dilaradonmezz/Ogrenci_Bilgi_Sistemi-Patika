package student;

public class Course {



    Teacher teacher; // teacher sınıfından teacher adında bir nesneyi -nitelik- olarak alabiliriz.
    //hafızada teacher adında bir nesne var ve boş şuan
    //teacher teacher=new teacher(); normalde böyle yazar nesneyi tanımlardık, nesneyi tanımlamadık
    String name;                    //burada tanımladığımız şeyler aslında nitelikler, değişkenler değil
    String code;
    String prefix;
    int note;
    int verbalnote=0;

    Course(String name, String code, String prefix, Teacher teacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher; // teacher eşit benim parametre olarak aldığım teachera şeklinde
        int note=0;
    }

    void addteacher(Teacher teacher){//dışarıdan aldığımız teacher nesnesini içerideki teachera eşitlemesi gerek
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            printteacher();
        }
        else
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");

    }


    void printteacher(){
        teacher.printteacher();
    }
}
