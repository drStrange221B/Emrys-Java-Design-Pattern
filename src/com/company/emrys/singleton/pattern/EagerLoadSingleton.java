package com.company.emrys.singleton.pattern;

public class EagerLoadSingleton {

    private String name;
    private String address;

    private static final EagerLoadSingleton EAGER_LOAD_SINGLETON = new EagerLoadSingleton("Name", "Address");


    private EagerLoadSingleton() {
    }

    private EagerLoadSingleton(String name, String address) {
        this.name = name;
        this.address = address;
    }


    public static EagerLoadSingleton getInstance(){
        return EAGER_LOAD_SINGLETON;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
