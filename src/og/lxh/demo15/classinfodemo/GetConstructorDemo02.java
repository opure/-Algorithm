package og.lxh.demo15.classinfodemo ;
import java.lang.reflect.Constructor ;	// ���빹�췽���İ�
public class GetConstructorDemo02{
	public static void main(String args[]){
		Class<?> c1 = null ;		// ����Class����
		try{
			c1 = Class.forName("org.lxh.demo15.Person") ;	// ʵ�����
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		Constructor<?> con[] = c1.getConstructors() ;	// ȡ��һ�����е�ȫ������
		for(int i=0;i<con.length;i++){
			Class<?> p[] = con[i].getParameterTypes() ;		// �õ����췽���е�ȫ������
			System.out.print("���췽����" ) ;	 // ������죬ֱ�Ӵ�ӡ
			System.out.print(con[i].getModifiers() + " ") ;	// �õ����η�
			System.out.print(con[i].getName()) ;	// ȡ�ù��췽��������
			System.out.print("(") ;
			for(int j=0;j<p.length;j++){
				System.out.print(p[j].getName() + " arg" + i) ;
				if(j<p.length-1){
					// �жϴ��Ƿ������һ������
					System.out.print(",");	// �����,��
				}
			}
			System.out.println("){}") ;
		}
	}
};