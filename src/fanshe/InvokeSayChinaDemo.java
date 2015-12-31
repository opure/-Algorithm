package fanshe;

import java.lang.reflect.Method ;
public class InvokeSayChinaDemo{
	public static void main(String args[]){
		Class<?> c1 = null ;
		try{
			c1 = Class.forName("org.lxh.demo15.Person") ;	// ʵ��Class����
		}catch(Exception e){}
		try{
			Method  met = c1.getMethod("sayChina") ;	// �ҵ�sayChina()����
			met.invoke(c1.newInstance()) ;	// ���÷���
		}catch(Exception e){
			e.printStackTrace() ;
		}
	}
};