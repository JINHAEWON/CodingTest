# Test_LeastCommonMultiple

문제 설명
두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.

제한 사항
arr은 길이 1이상, 15이하인 배열입니다.
arr의 원소는 100 이하인 자연수입니다.

입출력 예  
arr : result  
[2,6,8,14]	: 168  
[1,2,3]	   :   6  

# Pseudo Code 

    int solution(입력의 arr) {  
        return할 값을 저장할 변수 answer 를 선언하고 값은 1을 저장한다.
        소수의 값을 저장할 변수 x를 선언하고 변수 x에는 소수의 첫번째 값인 2를 저장한다.
  
        while(arr의 값이 모두 1이면 false)  {
            아래의 while문을 체크할 boolean 변수 check를 선언하고 false 값을 준다.
   
            while (check가 false일때 true) {
                check = 변수 x로 입력 arr 배열의 모든 값을 나눌 수 있는지 확인하고, 나눌 수 있다면 배열의 값을 변수 x로 나누고 false를 return한다.
                if(check의 값이 false라면) 
                    return 값을 저장하는 answer변수에 변수 x를 곱한다.
             }     
                 다음 소수 값을 찾아서 x로 저장한다.
         }
        answer값을 return 해준다.
    }


