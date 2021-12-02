package fr.lernejo.tester.internal;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class TestClassDescription {
    Class<?> c;
    public TestClassDescription(Class<?> c){
        this.c=c;
    }
}
