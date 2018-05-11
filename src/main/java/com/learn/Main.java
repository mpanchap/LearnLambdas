package com.learn;

import com.learn.functional.FunctionalGeneric;
import com.learn.functional.Name;
import com.learn.functional.StringFunctional;

public class Main implements Name, StringFunctional, FunctionalGeneric {

    public static void main(String[] args) {
        
        
        //#1 - Name Interface
        Name name = (n) -> n + "hello";

        System.out.println(name.computeName("name appended to "));
        String humanGreeting = name.computeName("Hey Man ");
        System.out.println(humanGreeting);
        
        
        //#2 - StringFunctional Interface
        StringFunctional strValue = (str) -> {
            String result = "";
            for (int i=str.length()-1;i>0 ; i--){
                result += str.charAt(i);
            }
            return result;
        };
        
        System.out.println(strValue.myStringFunction("RepeatAfterMe"));
        
        //#3 - FunctionalGeneric
        
        FunctionalGeneric<String> stringRefer = (str) -> {
          
            return str;
            
        };
        
        FunctionalGeneric<Integer> intRefer = (i) -> {
            return i;
        };

        System.out.println(stringRefer.Compute("PrintThisString"));
        System.out.println(intRefer.Compute(1000));
    }

    @Override
    public String computeName(String str) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String myStringFunction(String str) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object Compute(Object t) {
        // TODO Auto-generated method stub
        return null;
    }

}
