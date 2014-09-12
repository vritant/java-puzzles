/*
 * @author vritant
 */
package com.vritant.java.puzzles.ocajp;

class MyException extends Exception {}
public class ExceptionalTest{
    public static void main(String[] args){
        ExceptionalTest tc = new ExceptionalTest();
        try{
            tc.m1();
        }
        catch (MyException e){
            tc.m1();
        }
        finally{
            tc.m2();
        }
    }
    public void m1() throws MyException{
        throw new MyException();
    }
    public void m2() throws RuntimeException{
        throw new NullPointerException();
    }
}
