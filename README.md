# 📝 Algorithm Study

2인이 함께 진행하는 알고리즘 스터디입니다. 
꾸준한 문제 풀이와 코드 리뷰를 통해 알고리즘 문제 해결 능력을 향상시키는 것을 목표로 합니다.

## 👨‍💻 Members
| [지원](https://github.com/wonji426) | [예슬](https://github.com/Yuyeseul) |
| :---: | :---: |
| <img src="https://avatars.githubusercontent.com/u/145153564?v=4" width="100"> | <img src="https://avatars.githubusercontent.com/u/144925533?v=4" width="100"> |

<br>

## 📌 Study Rules
* **진행 기간**: 2026.05.31 ~ (매주 진행)
* **목표 물량**: 하루 1문제 풀이
* **플랫폼**: 프로그래머스(Programmers) 등
* **언어**: Java (각자 주력 언어 사용 가능)
* **코드 리뷰**: 디스코드 미팅을 통해 서로의 코드를 리뷰합니다.

<br>

## 📌 깃허브 Push/Pull 규칙
1. 무조건 pull 먼저 해줍니다. pull을 해서 해당 주차의 디렉토리가 생기지 않는다면 따로 만들어주세요.
```text
$ git pull <remote 이름> <브랜치이름>
$ git pull AlgorithmStudy master
```
2. 파일 업로드 규칙에 맞게 push해주세요.
 ```text
$ git add .
$ git commit -m "BOJ_1000_홍길동"
$ git push <remote 이름> master
```
3. 만일 push를 하다가 충돌 이 일어났을 경우 아래의 코드를 입력해주세요.
 ```text
$ git log --oneline
 ```
4. 입력 후 내가 push한 커밋 바로 전 커밋 코드를 복사해줍니다. 그리고 다음을 입력해주세요.
 ```text
$ git reset --soft [복사한 커밋 코드]
 ```
5. 만일 내가 올린 코드에 수정/추가 등의 추가 커밋을 push할 경우에 커밋 형식을 다음과 같이 작성해주세요. 수정을 2번째 할 경우에 fix2를 붙여주시면 됩니다.
```text
git commit -m "BOJ_1000_홍길동_fix"
git commit -m "BOJ_1000_홍길동_add"
 ```

<br>

## 🗂️ Repository Structure
폴더 구조는 `플랫폼 / 주차 / 문제 / 이름` 형식으로 관리합니다.

```text
📦 Algorithm-Study
 ┣ 📂 Programmers
 ┃ ┣ 📂 1Week
 ┃ ┃ ┣ 📂 넘버_문제
 ┃ ┃ ┃ ┣ 📜 jiwon.java
 ┃ ┃ ┃ ┗ 📜 yeseul.java
 ┃ ┣ 📂 2Week
 ┗ 📜 README.md
```
