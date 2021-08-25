package org.example.question1;

import org.jetbrains.annotations.NotNull;

public class Person {

    /**
     *This Method is no longer being used due to limitations. <br/>
     * please use the new Method
     * @see #classifyPerson(int, Genders)
     */
    @Deprecated
    public String classifyPerson( int age, boolean gender) {

        return classifyPerson(age,gender ? Genders.MALE : Genders.FEMALE);

    }

    @NotNull
    public String classifyPerson( int age,@NotNull Genders gender) {

        switch (gender){
            case MALE:
            case FEMALE:
                if(age<18){
                    return getBelow18(gender);
                }else
                    return getAbove18(gender);
            default:
                return "OTHERS";
        }
    }

    String getBelow18( Genders gender) {

        switch (gender){
            case MALE:
               return "BOY";
            case FEMALE:
                return "GIRL";
            default:
                return "OTHERS";
        }
    }

    String getAbove18( Genders gender) {

        switch (gender){
            case MALE:
                return "MAN";
            case FEMALE:
                return "WOMAN";
            default:
                return "OTHERS";
        }
    }

    public enum Genders{
        MALE,FEMALE,OTHERS
    }

}
