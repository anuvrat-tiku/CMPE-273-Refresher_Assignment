
public class Q_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q_str QQ = new Q_str();
		QQ.insert_Q(14);
		QQ.insert_Q(28);
		QQ.insert_Q(56);
		QQ.insert_Q(12);
		QQ.insert_Q(14);
		
		QQ.remove_Q();//Removes 14
		QQ.remove_Q();//Removes 28
		QQ.remove_Q();//Removes 56
		QQ.remove_Q();//Removes 12
		QQ.remove_Q();//Removes 14
		QQ.remove_Q();//Queue is empty .. will be printed
		QQ.insert_Q(12);//Add 12
		QQ.insert_Q(12);//Add 12
		QQ.insert_Q(12);//Add12
		QQ.remove_Q();//Removes 12
		
	}

}
