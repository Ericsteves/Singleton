package com.cn.eric.singleton.withoutThreadSafe;
/**
 * 
 * @author Ericsteves
 * 
 * 单例模式-双重检验（非线程安全）
 * 
 * 缺点：非线程安全
 * 优点：
 * 
 * 这个单例看起来好像是个线程安全的，但是，仔细看的话，会发现，instance = new Singleton1()会发生指令重排
 *
 */
public class Singleton1 {
	
	private static Singleton1 instance;
	
	private Singleton1(){};
	
	public static Singleton1 getInstance(){
		if(instance == null){
			synchronized (Singleton1.class) {
				if(instance == null){
					instance = new Singleton1();
				}
			}
		}
		return instance;
	}
}
