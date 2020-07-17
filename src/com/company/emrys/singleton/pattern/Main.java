package com.company.emrys.singleton.pattern;

public class Main {

    public static void main(String... args){

        EagerLoadSingleton eagerLoadSingleton = EagerLoadSingleton.getInstance();
        System.out.println(eagerLoadSingleton.getAddress());

        LazyLoadSingleton lazyLoadSingleton = LazyLoadSingleton.getInstance();
        System.out.println(lazyLoadSingleton.getName());

        LazyLoadSingletonSingleThreadSafe lazyLoadSingletonSingleThreadSafe = LazyLoadSingletonSingleThreadSafe.getInstance();
        System.out.println(lazyLoadSingletonSingleThreadSafe.getName());

        LazyLoadSingletonDoubleThreadSafe lazyLoadSingletonDoubleThreadSafe = LazyLoadSingletonDoubleThreadSafe.getInstance();

        System.out.println(lazyLoadSingletonDoubleThreadSafe.getName());


    }
}
