package fanshe;

public class GetInterfaceDemo{
	public static void main(String args[]){
		Class<?> c1 = null ;		// ����Class����
		try{
			c1 = Class.forName("org.lxh.demo15.Person") ;	// ʵ�����
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		Class<?> c[] = c1.getInterfaces() ;	// ��������ʽ����ʵ�ֵ�ȫ���ӿ�
		for(int i=0;i<c.length;i++){
			System.out.println("ʵ�ֵĽӿ���ƣ�" + c[i].getName()) ;	// ����ӿ����
		}
	}
};