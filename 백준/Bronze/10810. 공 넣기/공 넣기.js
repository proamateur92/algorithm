const inputs = require("fs")
  .readFileSync(0)
  .toString()
  .split("\n")
  .map((i) => i.trim());

const n = parseInt(inputs[0].split(" ")[0]);
const m = parseInt(inputs[0].split(" ")[1]);

let arr = new Array(n);

arr.fill(0);

const el = inputs.slice(1);

for (let r = 0; r < m; r++) {
  // for (let e of el) {
  const [i, j, k] = el[r].split(" ").map((i) => parseInt(i));

  if ((i < 1 || j < 1) && (n < i || n < j)) {
    continue;
  }

  if (n < k && k < 1) {
    continue;
  }

  arr = arr.map((a, idx) => (idx + 1 >= i && idx + 1 <= j ? k : a));
}

console.log(arr.join(" "));