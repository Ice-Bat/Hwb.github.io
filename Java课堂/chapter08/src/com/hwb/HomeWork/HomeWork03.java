package com.hwb.HomeWork;

public class HomeWork03 {
    public static void main(String[] args) {
        Techer professor = new Professor("胡歌",40,"生物",13000);
        Techer associateProfessor = new AssociateProfessor("黄西", 34, "地理", 12000);
        Techer lecturer = new Lecturer("牛爱华", 23, "英语", 11000);
        professor.introduce();
        associateProfessor.introduce();
        lecturer.introduce();

    }
}

