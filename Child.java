
public class Child extends Myfamily {
	int age = 28;

	void MyLive() {
		 super.MyLive();
		 System.out.println("私の年齢は" + age + "です。");
	}

	public static void main(String[] args) {
		  Child child = new Child();
		  child.MyLive();

	}

}
