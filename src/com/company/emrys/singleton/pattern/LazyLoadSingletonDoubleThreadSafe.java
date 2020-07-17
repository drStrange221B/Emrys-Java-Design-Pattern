package com.company.emrys.singleton.pattern;

public class LazyLoadSingletonDoubleThreadSafe {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    private static LazyLoadSingletonDoubleThreadSafe LAZY_LOAD_SINGLETON_DOUBLE_THREAD_SAFF = null;


    private LazyLoadSingletonDoubleThreadSafe() {
    }

    private LazyLoadSingletonDoubleThreadSafe(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static LazyLoadSingletonDoubleThreadSafe getInstance(){

        if(LAZY_LOAD_SINGLETON_DOUBLE_THREAD_SAFF ==null) {

            synchronized (LazyLoadSingletonDoubleThreadSafe.class) {

                if(LAZY_LOAD_SINGLETON_DOUBLE_THREAD_SAFF==null){
                    LAZY_LOAD_SINGLETON_DOUBLE_THREAD_SAFF = new LazyLoadSingletonDoubleThreadSafe(" double thread safe", " double address");
            }
            }
        }

        return LAZY_LOAD_SINGLETON_DOUBLE_THREAD_SAFF;
    }
}
