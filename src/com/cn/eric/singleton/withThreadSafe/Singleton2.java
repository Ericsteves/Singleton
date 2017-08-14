package com.cn.eric.singleton.withThreadSafe;
/**
 * 
 * @author Ericsteves
 * 
 * 单例模式-饿汉（线程安全）
 * 
 * 缺点：没有延迟加载
 * 优点：利用ClassLoader机制避免了多线程同步问题
 * 
 * 备注：不推荐！写出来是作为参考，延迟加载有利于程序性能，这不是好的单例实现方式。
 */

public class Singleton2 {
	
	private static Singleton2 instance = new Singleton2();//已赋值,没有延迟加载
	
	private Singleton2(){};//构造函数私有化，防止在外部被实例化
	
	public static Singleton2 getInstance(){
		return instance;
	}
}
