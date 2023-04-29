// 출력 방식을 배열로 내보내서 실패하였다.
// 출력 방식을 join문을 통해 변환하여 처리하였다.

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
  let temp = arr[i - 1];
  arr[i - 1] = arr[j - 1];
  arr[j - 1] = temp;
}

console.log(arr.join(" "));
