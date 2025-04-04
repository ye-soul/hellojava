package com.javaex.problem04;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1464.70);
        
        
        //백만원을 달러로 출력
        won = 1000000;
        dollar = CConverter.toDollar(won);
        System.out.println("현재 100만원 :" + dollar +"달러입니다.");
        
        //100달러를 원으로 출력
        dollar = 1;
        won  = CConverter.toKRW(dollar);
        System.out.println("현재 1달러 :" + won +"원입니다.");    
    }

}
