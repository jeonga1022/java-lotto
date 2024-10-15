# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)
---

# STEP4 TODO
# STEP4 DONE
- [x] 4단계 피드백
  - [x] 원시값 포장
  - [x] 수동 전략
- [x] 사용자가 수동으로 로또 번호를 입력할 수 있도록 기능 추가
  - [x] 수동 로또 개수 입력
  - [x] 수동 로또 번호 입력
  - [x] 모든 원시값과 문자열을 포장한다
  - [x] 예외 처리를 통해 에러가 발생하지 않도록 한다
    - [x] 잘못된 값을 입력하면 java exception 처리
    - [x] Optional로 NullPointerException이 발생하지 않도록 처리
- [x] 3단계 피드백
  - [x] PrizeCountMap에서 Map을 EnumMap으로 변경
---
# STEP3 TODO
# STEP3 DONE
- [x] 3단계 요구사항
  -[x] 2등을 위해 보너스 번호 추가
  -[x] 당첨 통계에 2등 관련 문자열 추가 
- [x] 2단계 피드백
  - [x] validateNumberOfLottoNumbers static 제거 
  - [x] EnumMap Prize Key 변경 
---
# STEP2 TODO
# STEP2 DONE
- [x] 모든 기능은 TDD로 단위테스트 존재
- [x] 핵심 로직과 UI담당로직 분리(InputView, ResultView)
- [x] indent 1까지 허용
- [x] 메소드 최대 15라인 까지 허용
- [x] else 미허용
- [x] 자바 코드 컨벤션
- [x] 힌트
  - [x] 로또 자동 생성은 Collections.shuffle() 메소드 활용
  - [x] Collections.sort() 메소드를 활용해 정렬
  - [x] ArrayList의 contains() 메소드를 활용하면 어떤 값이 존재하는지 유무를 판단
- [x] 피드백
  - [x] prize를 enum으로 관리
  - [x] LottoResult 제거
  - [x] 로또 티켓 중복 처리를 위한 List -> Set 변경
  - [x] 로또 티켓과 WinningNumber 공통점 처리 -> 기능이 유사하여 LottoNumbers 객체로 통합
  - [x] List<LottoNumber> lottoBalls을 Wrapping (로또 공)
---
# STEP1 TODO
# STEP1 DONE
- [x] 사용자가 입력한 문자열 값에 따라 사칙연산을 수행하는 계산기 구현하기
- [x] 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정하고 처리하기
- [x] 나눗셈의 경우 결과 값을 정수로 떨어지는 값
- [x] 사칙연산 우선순위가 아닌 입력 값 순서에 따라 계산하기
- [x] 들여쓰기는 1단계 유지하기 (중복문 안 조건문 사용 금지)
- [x] 메소드 크기 10라인 이하로 유지하기
- [x] 테스트할 수 있는 단위로 나누어 구현하기
  - [x] 덧셈, 뺼셈, 곱셈, 나눗셈, 입력값이 null이거나 빈 공백문자일 경우 IllegalArgumentException throw -> OperandParse에서 처리
  - [x] 사칙연산 기호가 아닌 경우  IllegalArgumentException throw -> Operator Factory에서 처리 
