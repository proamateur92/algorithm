function solution(before, after) {
    let answer = 1;
    
    const str1 = before.split('');
    const str2 = after.split('');
    
    if(str1.length <= 0 || after.length > 1000 || before.length !== after.length) {
        return answer = 0;    
    }
    
    while(str2.length !== 0) {
        const s = str1.pop();    
        
        if(!str2.includes(s)) {
            return answer = 0;
        }
        
        str2.splice(str2.indexOf(s), 1);
    }
    
    return answer;
}