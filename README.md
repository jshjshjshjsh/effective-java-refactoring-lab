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
| **02** | **01** | 생성자 대신 정적 팩터리 메서드를 고려하라 | [#1](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/1) | [#2](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/2) | ✅ 완료 |
| **02** | **02** | 생성자에 매개변수가 많다면 빌더를 고려하라 | [#3](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/3) | [#4](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/4) | ✅ 완료 |
| **02** | **09** | try-finally보다는 try-with-resources를 사용하라 | [#5](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/issues/5) | [#6](https://github.com/jshjshjshjsh/effective-java-refactoring-lab/pull/6) | ✅ 완료 |

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
