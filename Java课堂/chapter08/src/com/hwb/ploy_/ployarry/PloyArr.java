package com.hwb.ploy_.ployarry;

public class PloyArr {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("zz",89);
        person[1] = new Student("xx",15,89);
        person[2] = new Student("ss",21,69);
        person[3] = new Techer("ff",45,5678);
        person[4] = new Techer("gg",75,56708);

        for (int i = 0; i < person.length; i++) {
            //System.out.println(person[i].say());
            if(person[i] instanceof Student){
                Student student = (Student)person[i];
                student.study();
            } else if(person[i] instanceof Techer){
                Techer techer = (Techer)person[i];
                techer.teach();
            } else{
                System.out.println("里外不是人");
            }
        }
    }
}
