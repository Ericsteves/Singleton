package com.cn.eric.singleton.withoutThreadSafe;

/**
 * @author Ericsteves
 * 
 * 单线程单例模式（非线程安全）
 *
 */
public class Singleton {
	
	private static Singleton instance = null;//赋值为null,为了延迟加载
	
	private Singleton(){};//构造函数私有化，防止在外部被实例化
	
	public static Singleton getInstance(){
		if(instance==null){
			instance = new Singleton();
		}
		return instance;
	}
}
