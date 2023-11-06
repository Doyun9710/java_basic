# java_basic

<br><br>

< ThreadEx01 >   
pack1( TreadEx, Go, Come ) : 순차처리, run()   
pack2( TreadEx, Go, Come ) : Thread 처리, start()   
pack3( TreadEx, Go, Come ) : implements Runnable   
pack4( ThreadEx ) : 익명 inner class, 람다식   

Ex13_2 : 514p, 예제 13-2 싱글쓰레드와 멀티쓰레드 예제   
Ex13_2 : 515p, 예제 13-3 싱글쓰레드와 멀티쓰레드 예제   

ThreadEx01 : Thread 우선순위( Priority )   

pack5( ThreadEx, MyThread1, MyThread2 ) : Thread 이름, 우선순위 설정   

Ex13_7 : 526p, 예제 13-7 데몬 쓰레드(daemon thread)   

ThreadEx02 : InterruptedException 예외처리   

Ex13_8 : 530p, 예제 13-8 sleep()   

Ex13_11 : 536p, 예제 13-11 join(), yield()   

pack6( Account, Client ) : Synchronized, 동기화   

Ex13_14 : 543p, 예제 13-14 wait(), notify()   


<br><br>


< SwingEx01 >   
JFrameEx01 : 이름, 위치, 크기   
JFrameEx02 : JFrame 상속, JFrame.EXIT_ON_CLOSE   
JFrameEx03 : Button   
JFrameEx04 : Button 이벤트 - 마우스 클릭   


<br><br>


< SwingEx02 >   
JFrameEx01 : new -> other -> WindowBuilder -> Swing Designer   
JFrameEx02 : Label, 지역변수->전역변수, icon, html 적용   
ButtonEx01 : Button, bg color, click event   

JTextFieldEx01 : textField -> button -> label, textField(editable-readonly), passwordField(getPassword())   
JTextFieldEx02 : JTextFieldEx01 + 대소문자 변환   

JTextAreaEx01 : TextArea + Scroll   
JTextAreaEx02 : 단수입력 -> 구구단, append()   

JCheckBoxEx01 : CheckBox, 다중선택, setSelected(), Toggle   
JRadioButtonEx01 : CheckBox, 단일선택   

JOptionPaneEx01 : JOptionPane.showMessageDialog, 확인 버튼 반환값   
JOptionPaneEx01 : 구구단 입력 출력   

JProgressBarEx01 : 진행률(바)   
JSliderEx01 : 스크롤, stateChanged 상태변화 감지   

JSpinnerEx01 : setModel(속성), 데이터 가져오기/세팅, 변화 감지   
JSpinnerEx02 : spinner 값 초기화, 선택 job 사원 리스트 출력   
~>> < EmpSearchEx01 >.EmpSearchEx02 참고   

JComboBoxEx01 :    
CustomComboBoxModel1 : Callback Method, String[]   
CustomComboBoxModel2 : String[] -> ArrayList<String>   

JComboBoxEmp : ComboBox 사원검색   
CustomComboBoxEmpModel : ComboBoxModel   
CustomComboBoxEmpDAO : searchEmp, listJob   
~>> < EmpSearchEx01 >.EmpSearchEx04 참고   

연습문제   
~>> < ZipcodeToText_HW >   
~>> < ZipcodeSearchEx02 >   

JListEx01 : JList, List 변화 감지 및 이벤트   
CustomListModel : List Model   
EmpDAO : listEname(String ename), listEmp(String ename)   

JTableEx01 : JTable, ROW, COL setting   
CustomTableModel : String[][]   
CustomTableModel2 : 1. 2개의 ArrayList   
CustomTableModel3 : 2. 1개의 ArrayList, 1개의 TO   
DeptDAO : listDept()   
DeptTO : DeptTO   

JTableEx02 : 구구단   
JTableEx02_CustomTableModel : 구구단 테이블 모델   


<br><br>


< ZipcodeSearchEx01 >   
ZipcodeSearchEx01 : 우편번호 검색, project.zipcode   
ZipcodeSearchEx02, ZipcodeDAO, ZipcodeTO : ZipcodeSearchEx01 + 클래스화   

SampleSearchEx01, SampleDAO, SampleTO : 사원이름 검색, sample.emp   


<br><br>


< EmpSearchEx01 >   
EmpSearchEx01 : FileZlia 다운   
EmpSearchEx02 : ≓JSpinnerEx02, Job List Setting   

EmpSearchEx03 : ≓EmpSearchEx02   
CustomSpinnerListModel : Spinner.setModel 분리   
EmpDAO : DB 접속, return String[] or ArrayList   

EmpSearchEx04 : ComboBox 사원검색   
CustomComboBoxModel : ComboBoxModel   


<br><br>


< EmpSearchEx02 >	20230914 Sample.emp 연결, 직업 별 사원목록 ( FileZilla import )   


<br><br>


< ZipcodeToText_HW >   
ZipcodeSearchEx03		: ComboBox 응용, 시/군/동 별 리스트 출력   

CustomModelZipcodeSido	: Sido, ArrayList<String> datas;   
CustomModelZipcodeGugun	: Gugun   
CustomModelZipcodeDong	: Dong   

ZipcodeDAO   
	listSido		: Sido 불러오기   
	listGugun		: Gugun 불러오기,	매개변수 sido   
	listDong		: Dong 불러오기,	매개변수 sido, gugun   
	searchSido	: 해당 Sido 리스트, 	매개변수 sido   
	searchGugun	: 해당 Gugun 리스트, 	매개변수 sido, gugun   
	SearchDong	: 해당 Dong 리스트, 	매개변수 sido, gugun, dong   


<br><br>


< ZipcodeSearchEx02 >	20230915 Project.zipcode 연결, 시도군 별 리스트 ( FileZilla import )   
< ZipcodeToText_HW > + Using ZipcodeTO   


<br><br>


< ZipcodeToTable_HW >   


<br><br>


< SwingEx03 >   
JFrameEx01 : JDialogEx01 띄우기, 제어권 이전, Dialog 위치 설정   
JDialogEx01 : OK버튼, Enter키 입력 시 창 닫기, main() 비활성화   

JFrameEx02 : JFrame <-> JDialog 간 데이터 교환   
JDialogEx02 :    

JFrameEx03 : 구구단   
JDialogEx03 : testArea   
GugudanMainUI01 : ≓ JFrameEx03   
GugudanUI01 : ≓ JDialogEx03   

JColorChoolserEx01 : JColorChoolser, Color 객체   

JFileChooserEx01 : JFileChooser, 파일 선택, 내용 출력, 저장   

JFileChooserEx02 :    
JFileChooserEx03 :    
EditorDAO : StringBuilder readFile, boolean writeFile   

JMenuEx01 : JMenu, JMenuItem   


<br><br>


< SwingEx04 >   
BoardLayoutEx01 : BorderLayout   
GridLayoutEx01 : GridLayout   
GridLayoutEx02 : 계산기 UI   
CardLayoutEx01 : Panel 소환   
CardLayoutEx02 : CardLayout 응용(구구단)   

EventEx01 : MouseListener 핸들러 알아보기   
EventEx02 : implements MouseListener, extends MouseAdapter   


<br><br>


< ZipcodeSearch_Dialog >   
ZipcodeSearchMain :    
ZipcodeSearchDialog :    
ZipcodeSearchTableCustomModel :    
ZipcodeDAO : listAddress()   
ZipcodeTO : getter, setter   


<br><br>


< LamdaEx01 >   
(pack1)   
MyFunctionalInter : 함수형 인터페이스   
MainEx01 : 익명 내부 클래스   
MainEx02 : MainEx01 간소화   

(pack2)   
MyFunctionalInter : 함수형 인터페이스   
MainEx01 : lamda   

Ex14_1 : 558p, 예제 14-1 함수형 인터페이스 타입의 매개변수, 반환 타입   

(pack3)   
MyFunctionalInter : 함수형 인터페이스   
MainEx01 : 기존 방식 vs lamda, f = ( a, b ) -> a > b ? a : b;   


<br><br>


< LamdaEx01 >   
InetAddressEx01 : getHostName(), getHostAddress()   
URLEx01 : String strUrl   
Ex16_2 : 684p, 예제 16-2 URL 클래스 예제   
URLEx02 : InputStream is = url.openStream();   
URLEx03 : InputStreamReader isr = new InputStreamReader( url.openStream() );   
URLEx04 : BufferedReader br = new BufferedReader( new InputStreamReader( url.openStream() ) );   
URLEx05 :    


<br><br>


< NetworkEx01 >   
InetAddressEx01 :   
URLEx01 :   
Ex16_2 :   
URLEx02 :   
URLEx03 :   
URLEx04 :   
URLEx05 :   
URLConnectionEx01 : URLConnection   
URLConnectionEx02 : HttpURLConnection   
URLConnectionEx03 : 온라인 이미지 저장   
ImageViewerEx01 : 이미지 불러오기   


<br><br>


< JSoupEx01 >   
JSoupEx01 :   
JSoupEx02 :   
JSoupEx03 :   


<br><br>


< OpenAPIEx01 >   
OpenAPIEx01 : xml 데이터 가져오기   
OpenAPIEx02 : json 데이터 가져오기   
JsonEx01 : json 배열, "[ 8, 9, 6, 2, 9 ]"   
JsonEx02 : json 배열, "{ \"data1\": \"value1\", \"data2\": \"value2\", }"   
JsonEx03 : json 배열, "[ { \"data1\": \"value1\", \"data2\": \"value2\", }, { \"data1\": \"value1\", \"data2\": \"value2\", } ]"   
JsonEx04 : 영화제목 추출 1   
JsonEx05 : 영화제목 추출 2   


