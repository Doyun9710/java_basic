# java_basic

<br><br>


< JDBCEx01 >   
JDBCEx01 : 드라이버 로딩   
JDBCEx02 : 데이터베이스 연결   
JDBCEx03 : JDBCEx02 예외처리 개선   
JDBCEx04 : INSERT   
JDBCEx05 : UPDATE, DELETE   
JDBCEx06 : CREATE table   

ReadDeptEx01, 02 : dept.csv 읽어오기   

JDBCEx07 : dept.csv -> insert (new)emp2 table   

JDBCEx08 : ResultSet, 컬럼 값 읽어오기   
JDBCEx09 : 10번 부서의 사원번호, 사원이름, 급여, 연봉을 출력   
JDBCEx10 : 입사일자(xxxx-xx-xx) -> 입사일자(xxxx/xx/xx)   

JDBCEx11 : 우편번호.csv -> insert database -> select   
create user project@localhost identified by '123456';   
+   
grant all privileges on *.* to project@localhost;   
↓↓   
grant all privileges on project.* to project@'%' identified by '123456';   
create table zipcode (   
	zipcode char(7) not null,   
	sido varchar(4) not null,   
	gugun varchar(17),   
	dong varchar(26) not null,   
	ri varchar(45) not null,   
	bunji varchar(17) not null,   
	seq int(5) unsigned not null,   
	primary key ( zipcode, seq )   
);   

InsertZipcodeEx01 : 우편번호.csv -> insert database   
InsertZipcodeEx02 : 우편번호.csv -> insert database   
SearchZipcodeEx01 : 우편번호 검색기   

SearchZipcodeEx02 : sample 데이터 안에 테이블 목록을 출력, view 제외   

JDBCEx12 : PreparedStatement, 자료형 미래 정의, values ( ?, ?, ? )   
InsertZipcodeEx03 : PreparedStatement + 우편번호.csv insert   
JDBCEx13 : PreparedStatement + update   
JDBCEx14 : 10번 부서 delete   
JDBCEx15 : 급여 하한, 상한 사원에 대한 목록 ( 800 ~ 2000 ), select   
JDBCEx16 : 특정 행( Row ) 이동, 커서 초기화   

JDBCEx17 : DatabaseMetaData ( Name,    
JDBCEx18 : DatabaseMetaData   

JDBCEx19 : 부서정보를 입력받아 사원에 대한 정보를 출력 (단, 부서번호가 숫자로 입력되지 않으면 재입력)   
SearchEmp : JDBCEx19   



