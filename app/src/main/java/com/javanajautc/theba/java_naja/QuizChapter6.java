package com.javanajautc.theba.java_naja;

public class QuizChapter6 {

    private String mQuizs [] = {
            "โครงสร้างของข้อมูลที่รวมคุณลักษณะและเมธอดไว้เรียกว่าอะไร ",
            "เมธอดที่มีชื่อเดียวกับคลาสเรียกว่าอะไร ",
            "ข้อใดเป็นสมาชิกของคลาสที่ใช้เก็บข้อมูลได้ ",
            "คําใดที่ใช้สําหรับสร้างออบเจ็กต์ในหน่วยความจํา ",
            "เมธอดในลักษณะใดที่มักใช้สําหรับกําหนดข้อมูลเริ่มต้นให้กับออบเจ็กต์ ",
            "คลาสที่มีคอนสตรัคเตอร์หลายตัวเมธอดที่เป็นคอนสตรัคเตอร์มักต่างกันที่จุดใด ",
            "คลาสที่มีคอนสตรัคเตอร์หลายตัวเรียกว่าอะไร ",
            "ข้อใดไม่ถูกต้องเกี่ยวกับคลาส ",
            "ในการสร้างคลาสมักกําหนดการเข้าถึงตัวแปรที่เป็นคุณลักษณะให้เป็นประเภทใด ",
            "เมธอดหลายๆ เมธอดในคลาส หากมีชื่อเหมือนกัน มักมีจุดใดต่างกัน "
    };

    private String mChoices [][] = {
            {"ก. class","ข. method ","ค. parameter","ง. instance "},
            {"ก. โอเวอร์โหลดดิ้ง","ข. คอนสตรัคเตอร์ ","ค. ดับเบิลคลาส","ง. ซูเปอร์คลาส "},
            {"ก. เมธอด", "ข. โอเวอร์โหลดดิ้ง ","ค. คอนสตรัคเตอร์","ง. คุณลักษณะ "},
            {"ก. new","ข. create ","ค. object","ง. ถูกทั้ง ข. และ ค. "},
            {"ก. คอนสตรัคเตอร์","ข. เมธอดที่มีคําว่า void ","ค. เมธอดที่มีคําว่า static","ง. เมธอดที่มีคําว่า public "},
            {"ก. จํานวนการส่งผ่านอาร์กิวเมนต์ ","ข. ชื่อของเมธอด ","ค. มีคําว่า static กับไม่มี ","ง. ถูกทุกข้อ "},
            {"ก. โอเวอร์โหลดเมธอด ","ข. ดับเบิลคลาส","ค. โอเวอร์โหลดคอนสตรัคเตอร์ ","ง. ซูเปอร์คลาส"},
            {"ก. มีเมธอดได้หลายเมธอด ","ข. เมธอดภายในเป็นแบบ private ได้ " ,"ค. ต้องไม่มีเมธอดที่มีชื่อเดียวกับคลาส ","ง. ไม่มีส่วนที่เป็นคุณลักษณะก็ได้ "},
            {"ก. parameter","ข. private ","ค. public","ง. static "},
            {"ก. การ return ส่งค่ากลับ","ข. ประเภทของการเข้าถึงเมธอด ","ค. ตําแหน่งหน่วยความจํา","ง. จํานวนพารามิเตอร์"}
    };
    private String mCorrestAnwsers [] = {"ก. class","ข. คอนสตรัคเตอร์ ","ง. คุณลักษณะ ","ก. new",
            "ก. คอนสตรัคเตอร์", "ก. จํานวนการส่งผ่านอาร์กิวเมนต์ ","ค. โอเวอร์โหลดคอนสตรัคเตอร์ ","ค. ต้องไม่มีเมธอดที่มีชื่อเดียวกับคลาส ",
            "ข. private ","ง. จํานวนพารามิเตอร์"};

    public String getQuestion(int a){
        String quiz = mQuizs[a];
        return quiz;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrestAnwsers[a];
        return answer;
    }

}

