const input = require("fs")
  .readFileSync(0)
  .toString()
  .trim()
  .split("\n")
  .filter((i) => !!i.trim())
  .map((i) => i.trim());

const totalPrice = input[0];

const itemPrice = input
  .slice(2)
  .reduce((acc, cur) => acc + cur.split(" ")[0] * cur.split(" ")[1], 0);

console.log(parseInt(totalPrice) === parseInt(itemPrice) ? "Yes" : "No");
