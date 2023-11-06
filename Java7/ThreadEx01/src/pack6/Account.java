package pack6;

public class Account {

	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	// 인출 메서드
//	public void withdraw( int money ) {
	public synchronized void withdraw( int money ) {
		if( balance >= money ) {
			try {
				Thread.sleep( 1000 );
				
				balance -= money;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println( "잔고가 없습니다." );
		}
	}
}
