# CorrectParenthesis
문제 설명
괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어

()() 또는 (())() 는 올바른 괄호입니다.
)()( 또는 (()( 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.

입출력 예 
s   answer
()()    true
(())()    true  
)()(    false

# Pseudo Code 

    boolean solution(입력의 string) {  
        '('를 +1로하고 ')'를 -1로 계산하는 integer 변수 check를 선언하고 0으로 초기화한다.
  
        for(string의 길이만큼 반복한다.)  {
            if(string의 i번째가 '('일 경우) 변수 check++;
            if(string의 i번째가 ')'일 경우) 변수 check--;
            
            if (check 0보다 작을경우) {
                for문을 break한다.
             }     
         }
         
         if(check가 0일 경우) true를 return한다.
         else false를 return한다.
    }


