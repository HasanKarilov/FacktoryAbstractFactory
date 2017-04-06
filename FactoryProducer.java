package com.javarush.task.task37.task3702;

import com.javarush.task.task37.task3702.female.FemaleFactory;
import com.javarush.task.task37.task3702.male.MaleFactory;

/**
 * Created by hanaria on 4/6/17.
 */
public class FactoryProducer {
    public static enum HumanFactoryType{
    MALE, FEMALE;
    }

    public static AbstractFactory getFactory(HumanFactoryType humanFactoryType){
        return humanFactoryType==HumanFactoryType.MALE ? new MaleFactory(): new FemaleFactory();
    }
}