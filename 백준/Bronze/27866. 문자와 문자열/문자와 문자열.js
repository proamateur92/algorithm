const [str, index] = require("fs")
  .readFileSync(0)
  .toString()
  .trim()
  .split("\n");

console.log(str.split("")[parseInt(index) - 1]);