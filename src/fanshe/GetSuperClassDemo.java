package fanshe;

public class GetSuperClassDemo{
	public static void main(String args[]){
		Class<?> c1 = null ;		// ����Class����
		try{
			c1 = Class.forName("org.lxh.demo15.Person") ;	// ʵ�����
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		Class<?> c2 = c1.getSuperclass() ;	// ȡ�ø���
		System.out.println("������ƣ�" + c2.getName()) ;
	}
};