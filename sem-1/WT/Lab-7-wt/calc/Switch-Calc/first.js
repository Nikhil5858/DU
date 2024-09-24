let num1 = (Number(prompt("Enter Number : ")))
let num2 = (Number(prompt("Enter Number : ")))
op = prompt("Enter Operator : ");

switch (op) {
  case '+':
    document.writeln('Addition : ' + (num1 + num2))
    break;
  case '-':
    document.writeln('Substraction : ' + (num1 - num2))
    break;
  case '*':
    document.writeln('Multiplication : ' + (num1 * num2))
    break;
  case '/':
    document.writeln('Divison : ' + (num1 / num2))
    break;
  default:
    document.writeln("Invalid Choice")
    break;
}
