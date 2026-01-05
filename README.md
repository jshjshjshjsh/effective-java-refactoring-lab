# 🧪 Effective Java Refactoring Lab

> **"Effective Code, Verified by Tests."**
>
> 이 레포지토리는 [이펙티브 자바 3판(Effective Java 3rd Edition)]을 학습하며, 비효율적인 코드(Before)를 효율적인 코드(After)로 리팩토링하는 과정을 기록한 연구실입니다.

## 🧐 Study Process

단순히 책을 읽는 것이 아니라, 실무와 유사한 환경에서 코드를 개선하고 검증합니다.

1.  **Legacy Code (Before)**: 안티 패턴이나 개선이 필요한 코드를 먼저 작성합니다.
2.  **Test & Verification**: `Before`와 `After`가 동일한 결과를 보장하는지 검증하는 테스트 코드를 작성합니다.
3.  **Refactoring (After)**: 책의 내용을 적용하여 코드를 개선합니다.
4.  **AI Code Review**: AI(Gemini)의 피드백을 받아 한 차례 더 확인합니다.
5.  **Pull Request**: 학습한 내용을 정리 하고 Merge 합니다.

---

## 🚀 Study Log

| Chapter | Item | Topic | Issue | PR | Status |
| :---: | :---: | :--- | :---: | :---: | :---: |
| **02** | **01** | **[Item 01] 생성자 대신 정적 팩터리 메서드를 고려하라** | [#1](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/1) | [#2](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/2) | ✅ 완료 |
| **02** | **02** | **[Item 02] 생성자에 매개변수가 많다면 빌더를 고려하라** | [#3](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/3) | [#4](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/4) | ✅ 완료 |
| **02** | **09** | **[Item 09] try-finally보다는 try-with-resources를 사용하라** | [#5](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/5) | [#6](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/6) | ✅ 완료 |
| **03** | **10** | **[Item 10] equals는 일반 규약을 지켜 재정의하라** | [#7](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/7) | [#8](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/8) | ✅ 완료 |
| **03** | **11** | **[Item 11] equals를 재정의하려거든 hashCode도 재정의하라** | [#9](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/9) | [#10](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/10) | ✅ 완료 |
| **03** | **12** | **[Item 12] toString을 항상 재정의하라** | [#11](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/11) | [#12](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/12) | ✅ 완료 |
| **04** | **18** | **[Item 18] 상속보다는 컴포지션을 사용하라** | [#13](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/13) | [#14](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/14) | ✅ 완료 |
| **05** | **26** | **[Item 26] 로 타입(Raw type)은 사용하지 말라** | [#15](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/15) | [#16](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/16) | ✅ 완료 |
| **05** | **31** | **[Item 31] 한정적 와일드카드를 사용해 API 유연성을 높이라** | [#17](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/17) | [#18](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/18) | ✅ 완료 |
| **05** | **34** | **[Item 34] int 상수 대신 열거 타입(Enum)을 사용하라** | [#19](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/19) | [#20](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/20) | ✅ 완료 |
| **07** | **45** | **[Item 45] 스트림은 주의해서 사용하라** | [#21](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/21) | [#22](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/22) | ✅ 완료 |
| **08** | **53** | **[Item 53] 가변인수는 신중히 사용하라** | [#23](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/23) | [#24](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/24) | ✅ 완료 |
| **08** | **55** | **[Item 55] 옵셔널 반환은 신중히 하라** | [#25](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/25) | [#26](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/26) | ✅ 완료 |
| **08** | **56** | **[Item 56] 공개 API 요소에는 항상 문서화 주석을 작성하라** | [#27](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/27) | [#28](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/28) | ✅ 완료 |
| **09** | **60** | **[Item 60] 정확한 답이 필요하다면 float와 double은  피하라** | [#29](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/29) | [#30](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/30) | ✅ 완료 |
| **09** | **63** | **[Item 63] 문자열 연결은 느리니 주의하라** | [#31](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/31) | [#32](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/32) | ✅ 완료 |
| **10** | **69, 77** | **[Item 69] 예외는 진짜 예외 상황에만 써라<br>[Item 77] 예외를 무시하지 말라)** | [#33](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/33) | [#34](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/34) | ✅ 완료 |
| **10** | **70, 71, 72** | **[Item 70, 71, 72] 표준 예외와 비검사 예외를 사랑하라** | [#35](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/35) | [#36](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/36) | ✅ 완료 |
| **10** | **73, 75, 76** | **[Item 73] 예외 번역<br>[Item 75] 상세 메시지<br>[Item 76] 실패 원자성** | [#37](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/37) | [#38](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/38) | ✅ 완료 |

> * **PR / Issue**: 학습이 완료된(Closed) PR 또는 Issue 번호를 링크합니다.
> * **Status**: 🏃 진행 중, ✅ 완료, 🔒 예정

---

## 🛠 Tech Stack

- **Java 17+**
- **Gradle**
- **JUnit 5 & AssertJ** (Test Verification)

## 📝 Conventions

### Commit Message

| Type | Description |
| --- | --- |
| `feat` | Before 코드 작성, 새로운 기능 추가 |
| `refactor` | After 코드 리팩토링, AI 피드백 |
| `refactor(AI)` | After 코드 AI 피드백 반영 |
| `test` | 검증 테스트 코드 작성 |
| `docs` | README, Notion 정리 등 문서 수정 |

---

## 📂 Project Structure

```text
src/main/java/me/jsh/effectivejava
 ├── chapter02  (객체 생성과 파괴)
 │    ├── item01
 │    │    └── Book.java
 │    └── ...
 └── chapter03  (모든 객체의 공통 메서드)

```
