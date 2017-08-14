package com.cn.eric.singleton.withThreadSafe;
/**
 * 
 * @author Ericsteves
 * 
 * 单例模式-懒汉（线程安全）
 *
 * 优点：实现简单
 * 缺点：效率很低，很多不需要同步的地方也进行了同步
 * 
 * 备注：不推荐！！写出来是仅供参考，个人认为这是synchronized关键字的滥用，锁的粒度太大
 */
public class Singleton1 {
	
	private static Singleton1 instance;//未赋值,为了延迟加载
	
	private Singleton1(){};//构造函数私有化，防止在外部被实例化
	
	public static synchronized Singleton1 getInstance() {
		if(instance == null){
			instance = new Singleton1();
		}
		return instance;
	}
}
