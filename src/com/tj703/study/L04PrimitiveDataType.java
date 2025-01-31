package com.tj703.study;

public class L04PrimitiveDataType {

    public static void main(String[] args) {
        //기본형 데이터 10을 생성 후 변수 i가 참조
        System.out.println(10);
        int i=10;
        //new B() : 인스턴스, 객체 데이터 생성 및 변수가 참조 (자료형 데이터)
        B b=new B();
        //기본형 데이터  : 수로 된 데이터로 cpu 가 연산하기 위한 원시 데이터
        //원시 데이터  : 데이터의 원시적인 형태 수 (cpu 가 수인 binary code 만 연산 가능)
        //자료형  : 객체지향 문법에서 사용하는 데이터로 객체의 데이터 타입이 됩니다.
        //자료형을 사용하면 프로그램의 생산성은 올라가지만 low level 언어처럼 동작속도가 빠르진 않다.
        //자료형은 기본형 데이터들의 집합으로 되어 있다.(기본형들의 집합 -> 자료형)

        //자바에서 수를 작성하면 int 데이터가 생성
        //기본==메모리크기
        byte by=127; //-128~ 127  // 1bit * 8
        //8bit == 1byte
        short s=11111; //2byte
        //2111111111 를 작성하면 int 타입이된다. 자바가 약속을 함
        //int ==> integer 의 줄임말로 정수란 의미
        int in=2111111111; // 4byte

        long l=111111111111111111L; //long data는 수끝에 L을 써야 생성됩니다. 8byte

        boolean result=true;
        result=false;
        //bit 정보 하지만 주소가 1byte 단위로 끊어짐
        //char 1~4byte 까지의 문자의 😀  번호를 참조
        //유니코드표 == utf-8 1~4
        char c='a'; //문자표의 번호 1byte 아스코드 표
        c='안';  //utf-8 문자표 3byte
        c='✅';
        //c='🇬🇭';
        //실수! 31 float double

        //작은 기본형의 타입이 큰 기본형을 참조할때는 데이터를 작게 만들어서 참조 합니다.

        by=(byte) 129;
        //1. 127 (long)
        //2. Infinity (float,double)
        //3. -127 (byte,short,int)
        System.out.println(by);
        i=(int)111111111111111l;
        System.out.println(i);
        System.out.println(Long.MAX_VALUE);
        l=9223372036854775807l;
        l=(long) 9223372036854775899.0;
        System.out.println(l);
        //수의 크기와 약속!!!
        //수, 원시(비트)데이터, 기본형(연산)데이터는 비트정보를 갖는다.

        // 0000 0000  // 1byte




        float f=3.14f;   //4byte 실수
        f=9223372036854775899.0f;//9.223372E18
        //9223372000000000000
        //9223372 => 정수처럼 가수부에 저장 (이때 가수부의 크기보다 큰 수는 삭제)
        //E18 => 18 => 지수부에 저장
        //=>실수는 큰수를 표현할 수 있지만 정확도가 떨어진다.
        System.out.println(f);
        double d=1E300; //8byte 실수 *(자바의 기본 실수)
        //float 의 가수부 크기가 너무 작아서 double 을 기본형으로 사용합니다.
        f=(float) d;
        System.out.println(f);
        d=d*d;
        System.out.println(d);
        //byte short int long float double char boolean
    }
}
