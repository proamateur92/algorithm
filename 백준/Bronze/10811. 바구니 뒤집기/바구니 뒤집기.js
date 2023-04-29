// sort 메서드를 사용해서 무조건 범위의 역순으로 정렬해야 하는데
// 내림차순으로 정렬하는 바보같은 실수를 하였다.

// slice 메서드는 원본 배열의 영향을 주지 않는다.

const inputs = require("fs")
  .readFileSync(0)
  .toString()
  .trim()
  .split("\n");

const n = parseInt(inputs[0].split(" ")[0]);
const m = parseInt(inputs[0].split(" ")[1]);

let arr = new Array(n);

for (let v = 1; v <= n; v++) {
  arr[v - 1] = v;
}

const el = inputs.slice(1);

for (let r = 0; r < m; r++) {
  const [i, j] = el[r].split(" ").map((i) => parseInt(i));

  const reverseArr = arr.slice(i - 1, j).reverse();

  let prev = [];
  let next = [];

  if (i - 1 > 0) {
    prev = [...arr.slice(0, i - 1)];
  }

  if (j < n) {
    next = [...arr.slice(j)];
  }

  if (!!prev.length && !!next.length) {
    arr = [...prev, ...reverseArr, ...next];
  } else if (!!prev.length) {
    arr = [...prev, ...reverseArr];
  } else if (!!next.length) {
    arr = [...reverseArr, ...next];
  } else {
    arr = reverseArr;
  }
}

console.log(arr.join(" "));
