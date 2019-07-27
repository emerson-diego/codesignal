int sumOfSquares(int n) {
    
    int answer = 0;
    
    for(int i=1; i <=n ; i++){
        answer += i*i;
    }
    
    return answer;

}