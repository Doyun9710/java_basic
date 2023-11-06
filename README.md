# java_basic

<br><br>

< JavaEx01 >

JavaEx01 : Hello Java   

Student : Eclipse 자동생성 ( 생성자, toString(), hashCode(), equals() )   

JavaEx02 : import com.naver.Student;   

Parent : 단순 print 선언   
Child : 단순 print 선언   

JavaEx03 : Parent, Child 출력 확인   

Ex9_1 : Objects래스의 메서드 一 equals()   
Ex9_4 : Object클래스의 메서드 一 toString()   
Ex9_5 : toString()의 오버라이딩   


<br><br>


< StringEx01 >

StringEx01 : Hello Java   
StringEx02 : Hello String Hello String   
StringEx03 : 문자열 위치, 존재 여부, 치환, 변환, 공백 제거, 분리, 결합   

InitCapEx01 : "hong gil dong" -> "Hong Gil Doong"   
InitCapEx02 + Util : StringEx04 리펙토링   

StringBuilderEx01 : String + append, insert, delete   

Ex9_12 : append, deleteCharAt, delete, insert, replace, capacity   

MathEx01 : 올림 ceil, 내림 floor, 반올림 round, 제곱 pow   
MathEx02 : 0 ~ 1 난수, random(), 0 ~ 10 실수   

WrapperEx01 : Autoboxing, Unboxing   
Ex9_15 : 문자열을 숫자로 변환하기   
Ex9_16 : Autoboxing, Unboxing 예제   

SystemEx01 : 프로그램 종료   
SystemEx02 : 실행시간 측정   
SystemEx03 : \n == System.lineSeparator()   
SystemEx04 : os.name, user.name, user.home   

ProcessBuilderEx01 : windows 프로그램 실행   


<br><br>


< JuminCheckEx01 >

JuminCheck : 주민번호 확인   
JuminCheckEx01 : 답안   
JuminCheckEx02 + Util : JuminCheckEx01 리펙토링   


<br><br>


< Util >

DateEx01 : 년도 월 일   
DateEx02 : 특정 날짜 세팅, 요일 구하기   
DateEx03 : Timestamp, 시간 차   
CalendarEx01 : Calendar, 마지막 날   
CalendarEx02 : Calendar => Date   

StringTokenizerEx01 : 전체 토큰 출력   
StringTokenizerEx02 : StringTokenizer, spilt 차이   

StringJoinerEx01 : 문자열 연결 format(), join(), add()   

RandomEx01 : seeding   
RandomEx02 : Lotto 번호 5개, 중복 X   
RandomEx03 : Lotto 번호 5개, 중복 X   

ScannerEx01 : 한 단어만 입력   
ScannerEx02 : id, pw   

GugudanEx01 : Scanner를 이용한 구구단 출력   

ScannerEx03 : do ~ while 프로그램 종료 조건   

ArraysEx01 : 배열의 내용 확인, 초기화, 비교, 정렬   


<br><br>



< AbstractionEx01 >

Parent :   
Child :   
AbstractionEx01 :   

261p, 예제 7-10   
Unit, Marine, Tank   

Ex7_12 : 내부 클래스의 제어자와 접근성   


<br><br>


< AbstractionEx02 >

Java의 정석 요약 231p   
Repairable, GroundUnit, AirUnit, Unit, Tank, Marine, SCV, Ex7_10   


<br><br>


< AbstractionEx03 >

269p, 예제 7-11   
MyInterface, MyInterface2, Parent3, Child3, Ex7_11   


<br><br>


< InnerEx01 >

( default )   
Outer : 내부클래스 선언, Outer { Inner() }   
InnerEx01 : 실행, Outer.Inner inner = outer.new Inner();   


( pack1 )   
Outer : 내부클래스 선언, Outer { Inner() }   
InnerEx01 : Outer outer = new Outer(); 미 선언 시 Outer 멤버필드 사용 불가   


( pack2 )   
InnerEx01 : 지역 내부 클래스 == 지역 변수( 메서드 내부 )   


( pack3 )   
InnerB, InnerEx01 : 익명내부클래스   


HW01_BubbleSort : 버블정렬   


<br><br>


< PolyEx01 >   
E, E1, E2, InstanceOfEx01 : E1 -> E <- E2


<br><br>


< ExceptionEx01 >   
ExceptionEx01 : if문 처리   
ExceptionEx02 : try ~ catch   
ExceptionEx03 : ArrayIndexOutOfBoundsException, 생성된 에러 메시지 확인   

Ex8_5 : 299p, printStackTrace()와 getMessage()   

ExceptionEx04 : Exception 두 개   
ExceptionEx05 : catch(ArithmeticException e), catch(NullPointerException e)   
ExceptionEx06 : catch(Exception e)   
ExceptionEx07 : finally   
ExceptionEx08 : 강제 Exception   
ExceptionEx09 : throws   
ExceptionEx10 : try catch 자동화   
ExceptionEx11 : 308p, 예제 8-11 사용자 정의 Exception 만들기   





< ListEx01 >   
ArrayListEx01 : ArrayList, 향산된 for문 출력   
ArrayListEx02 : add 형변환 과정   
ArrayListEx03, Person : getter, setter   
ArrayListEx04 : 데이터 삽입, 변경, 삭제   

Ex11_1 : 397p, 예제 11-1 ArrayList   

ArrayListEx05 : 입력 데이터에 대한 규정 : 제네릭 ( ArrayListEx03 적용 )   

LinkedListEx01 : LinkedList   

Ex11_2 : 405p   





< SetEx01 >   
SetEx01 : HashSet, Iterator 반복자   

Ex11_12 : 428p, 예제 11-12 HashSet 예제 합/교/차집합   


<br><br>


< Lotto 번호 추출 (중복 X) >   
HW01_Lotto : ArrayList   
HW02_Lotto : HashSet   

LottoEx01 : Lotto 번호 추출, 숫자 중복검사, ArrayList, clear   
LottoEx02 : Lotto 번호 추출, 숫자 중복검사, HashSet, clear   


<br><br>


< MapEx01 >   
MapEx01 : HashMap - put, get, remove, clear   
MapEx02 : key 추출   

Ex11_17 : 441p, 예제 11-17 HashMap - 총점, 평균, 최고/최저 점수   

MapEx03 : Properties   
MapEx04 : System 환경정보   


<br><br>


< DataEx01 >   
DataEx01 : 2차 배열   
DataEx02 : ArrayList 2개, ArrayList<ArrayList<String>> datas = new ArrayList<ArrayList<String>>();   

Person : String seq, String name, String phone, String age, String region   

DataEx03 : 1차 배열 + 클래스   
DataEx04, Student : ArrayList + 클래스, 학생 정보 출력 + 총합 / 평균   


<br><br>


< TextEx01 >   
StringEx01 : format 문자열   

Ex2_9 : 59p, 예제 2-9 printf 출력   

DecimalFormatEx01 : DecimalFormat( "#, ###.0" );   

Ex10_6 : 377p, 예제 10-6 DecimalFormat   

DecimalFormatEx02 : DecimalFormat( "$#,###.#" );   

SimpleDateFormatEx01 : SimpleDateFormat( "yyyy년 MM월 dd일" );   

Ex10_9 : 381p, 예제 10-9 SimpleDateFormat( "yyyy/MM/dd" );   


<br><br>


< FileEx01 >   
FileEx01 : File 존재유무, 실행가능, 읽기/쓰기 가능, Hidden 속성 검사   
FileEx02 : 절대경로, 상대경로 표시   
FileEx03 : 파일의 크기, 용량, 수정한 날짜   
FileEx04 : 파일 목록 가져오기   
FileEx05 : 디렉토리 생성, 이름변경, 삭제   
FileEx06 : 파일 생성, 이름변경, 삭제   

Ex15_18 : 661p, 예제 15-18 File   

HW01_FileList : dir /w 구현   
DirEx01 : dir /w 구현   


<br><br>


< FileEx02 >   
InputStreamEx01 : 파일 열기   
InputStreamEx02 : read()   
InputStreamEx03 : \r\n 구분   

OutputStreamEx01 : 파일 쓰기   
OutputStreamEx02 : 파일 이어쓰기   
OutputStreamEx03 : 파일 내용 옮기기   
OutputStreamEx04 : new BufferedOutputStream( new FileOutputStream( "./newtest1.txt" ) );   

CopyFileEx01 : 파일 복사   
CopyFileEx02 : 이미지 복사, 2.516   

InputStreamEx04 : BufferedInputStream   
InputStreamEx05 : bis = new BufferedInputStream( new FileInputStream( "./test1.txt" ) );   

CopyFileEx03 : CopyFileEx02 + BufferedStream, 속도차이 개선, 0.021   

ReaderEx01 : 문자 기반 스트림 2byte   
ReaderEx02 : ReaderEx01 + throws 적용   
ReaderEx03 : ReaderEx01 + Buffer   

WriteEx01 : 문자 기반 스트림, System.lineSeparator()   
WriteEx02 : WriteEx01 + Buffer   

zipcode_seoul_utf8_type2 : 예전 우편번호 데이터 ( 우편번호, 시도, 구군, 동, 리, 번지, 번호 )   
							강남구 데이터만 추출 -> [우편번호] 시도 구군 동 리 번지 형태로 출력   
ZipcodeEx01 : "강남구" 검사   
ZipcodeEx02 : 해당 동이름 해당하는 우편번호 검사 ("개포" : 개포동, 개포1동, 개포2동, "신사" : ~)   
ZipcodeEx03 : 우편번호 데이터파일 분리 => 시도별로 분리 (서울시 -> 서울.txt, 경기도 -> 경기.txt)   


<br><br>


< FileEx03 >   
DataOutputStreamEx01 : txt 저장   
DataInputStreamEx01 : txt 읽기   
ObjectOutputStreamEx01 : dat 저장   
ObjectInputStreamEx01 : dat 읽기   

Person : implements Serializable 직렬화, transient 직렬화 제외   
ObjectOutputStreamEx02 : Person 1, 2, 3, 배열 저장   
ObjectInputStreamEx02 : Person 1, 2, 3, 배열 출력   

UserInfo : 667p, 예제 15-20 직렬화와 역직렬화   
Ex15_20 :    
Ex15_21 :    

SystemInEx01 : InputStream is = System.in;   
SystemInEx02 : BufferedReader, 문장 출력   
SystemInEx03 : 구구단   

PropertiesEx01 : Properties 이용 저장   
PropertiesEx02 : Properties 출력, key + " : " + props.getProperty(key)   

ExceptionEx01 : try ~ with ~ resource 형식   


<br><br>


< FileEx03 >   
FileEx01 : 로또 특정 회차 번호 출력   


<br><br>


< JXLEx01 > jxl 다운 : https://sourceforge.net/projects/jexcelapi/files/jexcelapi/2.6.12/   
JXLEx01 : jxl 라이브러리 적용   
JXLEx02 : sheet 이름, 총 행/열 개수 확인   

LottoEx01 : lotto(1083).xls 데이터 확인   
LottoEx02 : LottoEx01 당첨번호 홀/짝 분류   


<br><br>


