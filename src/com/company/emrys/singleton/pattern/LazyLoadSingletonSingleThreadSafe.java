package com.company.emrys.singleton.pattern;

public class LazyLoadSingletonSingleThreadSafe {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    private static LazyLoadSingletonSingleThreadSafe LAZY_LOAD_SINGLETON_SINGLE_THREAD_SAFF = null;


    private LazyLoadSingletonSingleThreadSafe() {
    }

    private LazyLoadSingletonSingleThreadSafe(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static LazyLoadSingletonSingleThreadSafe getInstance(){

        if(LAZY_LOAD_SINGLETON_SINGLE_THREAD_SAFF ==null) {

            synchronized (LazyLoadSingletonSingleThreadSafe.class) {
                LAZY_LOAD_SINGLETON_SINGLE_THREAD_SAFF = new LazyLoadSingletonSingleThreadSafe(" single thread safe", "address");
            }
        }

        return LAZY_LOAD_SINGLETON_SINGLE_THREAD_SAFF;
    }
}
