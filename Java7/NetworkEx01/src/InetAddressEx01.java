import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// ip <=> domain
			InetAddress inetAddress = InetAddress.getByName( "www.naver.net" );
			
			System.out.println( inetAddress.getHostName() );
			System.out.println( inetAddress.getHostAddress() );
			
			
			// domain에 대한 ip 정보들
			InetAddress[] inetAddresses = InetAddress.getAllByName( "www.naver.com" );
			
			for( InetAddress address : inetAddresses ) {
				System.out.println( address.getHostAddress() );
			}
		} catch (UnknownHostException e) {
			System.out.println( "[에러] " + e.getMessage() );
		}
	}

}
