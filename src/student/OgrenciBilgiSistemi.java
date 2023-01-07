package student;

public class OgrenciBilgiSistemi {
    public static void main(String[] args){
        Teacher t1= new Teacher("Bahar","0555", "TRH");
        //bu t1'i course'un içindeki teacher'a atadık
        //t1.printteacher();
        Teacher t2= new Teacher("Graham", "0100" ,"FİZ");
        Teacher t3=new Teacher("Galileo", "111","COĞ" );
        Course tarih=new Course("Tarih", "101", "TRH", t1); //course sınıfından adı tarih olan yeni  bir course oluşturuyorum
                                 //yukarıda tanımladığım t1 nesnesini buraya atadım teacher olarak Bahar hocayı
        Course fizik=new Course("Fizik", "102", "FİZ", t2);
        Course cografya=new Course("Coğrafya", "103", "COĞ",t3);

        tarih.addteacher(t1);
        //tarih.addteacher(t2);//bu course'a ait teacherın bilgileri t2 olmuş oldu.
        fizik.addteacher(t2);
        cografya.addteacher(t3);

        Student s1=new Student("öğrenci 1", "101", "4", tarih, fizik, cografya);
        Student s2=new Student("öğrenci 2", "102", "4", tarih, fizik, cografya);
        Student s3=new Student("öğrenci 3", "103", "4", tarih, fizik, cografya);

        s1.addBulkExamNote(20,20,50);
        s1.addBulkVerbalNote(20,50,50);
        System.out.println("--------");
        s1.ispas();
    }
}
