# Spring

## hello.core.member package

### Member
회원의 핵심 데이터(ID, 이름, 등급 등)와 상태 변경 등의 메소드를 가지고 있는 **entity**

### MemberRepository (인터페이스)
"DB에 회원을 저장하고 찾는 기능이 필요하다"는 역할(Role)만 정의한 계약서

### MemoryMemberRepository (구현체)
MemberRepository를 구현한 객체. DB에 직접 연결하지는 않았지만 **Map**이라는 메모리에 임시 저장하는 역할을 담당하는 구현체

### MemberService (인터페이스)
"회원가입", "회원조회" 같은 **비즈니스 관점**의 역할을 정의

### MemberServiceImpl (구현체)
비즈니스 로직을 실제로 조율하는 구현체

### MemberRepository vs MemberService
왜 2개의 인터페이스가 필요한 것인가? MemberRepository는 DB에 정보를 저장하고 DB에서 정보를 조회하는 역할만 담당
MemberService는 비즈니스 로직으로써 '중복 회원 검증', '회원가입 축하 쿠폰 발급 트리거' 등과 같은 역할 수행
두 인터페이스의 내용을 보면 join() 과 save() 만을 호출해서 동일한 역할을 수행하는 것처럼 보일 수 있으나, 두 함수의 목적과 대상이 다르고 실제로 DB에 연결하거나 기능을 추가하면 차이점이 확연히 보임

### 클라이언트 -> MemberService -> MemberRepository
결국 클라이언트가 회원가입을 하거나 로그인을 할 때 호출되는 것은 비즈니스 로직인 MemberService 이고, MemberService 는 Request 된 context를 DB와 비교 및 저장하기 위해 DB와 연결 된 MemberRepository를 호출함