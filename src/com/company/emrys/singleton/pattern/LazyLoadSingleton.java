package com.company.emrys.singleton.pattern;

public class LazyLoadSingleton {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    private static LazyLoadSingleton LAZY_LOAD_SINGLETON = null;


    private LazyLoadSingleton() {
    }

    private LazyLoadSingleton(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static LazyLoadSingleton getInstance(){

        LAZY_LOAD_SINGLETON=new LazyLoadSingleton("Lazy Load", "Address of Lazy Load");

        return LAZY_LOAD_SINGLETON;
    }
}
