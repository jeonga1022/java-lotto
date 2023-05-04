# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 1단계 - 문자열 계산기
### 기능 요구사항
- 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현
- 문자열, 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정
- 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정
- 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정
- 2 + 3 * 4 / 2 -> 실행 결과인 10을 출력

### 프로그래밍 요구사항
- depth: 1단계
- 메서드는 최대 10라인
- else 사용 금지

## 2단계 - 로또(자동)
### 기능 요구사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

### 프로그래밍 요구사항
- 모든 기능을 TDD 로 구현해 단위 테스트가 존재해야 한다.
  - 핵심 로직, UI 로직을 분리한다.
- indent 는 1까지만 허용한다.
- 함수의 길이는 최대 15라인
  - 함수는 한 가지 일만 구현한다.
- else 예약어 금지

### 기능 목록
- [x] 구입 금액을 입력 받는다.
- [x] 6자리의 랜덤 로또 번호를 발급한다.
  - 로또가 6자리가 아닐경우 예외를 던진다.
  - 로또 번호는 오름차순으로 정렬된다.
- [x] 구입 금액에 맞는 로또 티켓을 발급한다.
  - 로또 티켓은 로또 번호와 당첨 상태를 가진다.
- [x] 발급 받은 티켓 수량을 출력한다.
- [x] 발급 받은 티켓의 로또 번호들을 전부 출력한다.
- [x] 지난 주 당첨 번호를 입력 받는다.
- [x] 당첨 번호와 발급 받은 티켓들로 당첨 통계를 구한다.
  - 통계는 3개 일치 부터 6개 일치까지 구한다.
- [x] 총 수익률을 구한다.
- [x] 총 수익률을 출력한다.
