/*
    최대공약수, 최소공배수 구하기

    1. 입력 모듈 정의
    2. solution
        > 입력을 쪼개 숫자 변수에 할당
        > 두 값중 작은 값으로 gcd 지정
        > restX, restY 선언
        > do while 조건은 rest가 0보다 클 경우
            > 두 나머지 중 작은 값을 gcd에 할당
            > 숫자를 gcd로 나눈 값을 rest에 할당
        > gcd 출력
        > x*y/gcd 출력
*/

const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", (line) => {
    solution(line);
});

function solution(line) {
    let nums = line.split(' ').map(i => +i);
    let gcd = getGCD(...nums);
    let lcm = nums[0] * nums[1] / gcd

    console.log(gcd);
    console.log(lcm);
}

function getGCD(x, y) {
    let rest = Math.min(x, y);
    let gcd;

    while (rest > 0) {
        gcd = rest;
        rest = Math.max(x % rest, y % rest);
    }

    return gcd;
}
