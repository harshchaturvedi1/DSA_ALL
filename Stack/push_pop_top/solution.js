function Stack() {
  this.stack = [];
  this.top = -1;
}

Stack.prototype.push = function (x) {
  this.stack.push(x);
  this.top++;
};

Stack.prototype.pop = function () {
  if (this.top === -1) return -1;
  const popped = this.stack.pop();
  this.top--;
  return popped;
};

Stack.prototype.print = function () {
  let val;
  if (this.top === -1) val = "Empty!";
  else val = this.stack[this.top];
  console.log(val);
};

function runProgram(input) {
  const Stack1 = new Stack();
  const newInput = input.split("\n");

  let i = 0;
  let cases = parseInt(newInput[i++]);
  while (cases > 0) {
    let item = newInput[i++];
    switch (item.split(" ")[0]) {
      case "1": {
        let val = parseInt(item.split(" ")[1].trim());
        Stack1.push(val);
        break;
      }
      case "2": {
        Stack1.pop();
        break;
      }
      case "3":
        Stack1.print();
        break;
    }

    cases--;
  }
}

if (process.env.USER === "") {
  runProgram(``);
} else {
  process.stdin.resume();
  process.stdin.setEncoding("ascii");
  let read = "";
  process.stdin.on("data", function (input) {
    read += input;
  });
  process.stdin.on("end", function () {
    read = read.replace(/\n$/, "");
    read = read.replace(/\n$/, "");
    runProgram(read);
  });
  process.on("SIGINT", function () {
    read = read.replace(/\n$/, "");
    runProgram(read);
    process.exit(0);
  });
}
