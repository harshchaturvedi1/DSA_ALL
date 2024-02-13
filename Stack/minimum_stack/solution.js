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

Stack.prototype.getMin = function () {
  if (this.top === -1) return -1;
  else return this.stack[this.top];
};

function runProgram(input) {
  const newInput = input.split("\n");

  const Stack1 = new Stack();
  const Stack2 = new Stack();

  for (const operation of newInput) {
    switch (operation.split(" ")[0]) {
      case "push": {
        let val = parseInt(operation.split(" ")[1].trim());
        Stack1.push(val);
        if (Stack2.top === -1 || Stack2.getMin() >= val) {
          Stack2.push(val);
        }
        break;
      }
      case "pop": {
        let val = Stack1.pop();
        if (val === Stack2.stack[Stack2.top]) Stack2.pop();
        //  console.log("operation==>",operation , Stack1,Stack2)
        break;
      }
      case "getMin":
        console.log(Stack2.stack[Stack2.top]);
        break;
    }
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
