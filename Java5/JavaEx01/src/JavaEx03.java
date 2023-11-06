import com.naver.Child;
import com.naver.Parent;

public class JavaEx03 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.viewParent();
		
		Child c = new Child();
		c.viewChild();
		c.viewParent();
	}
}
