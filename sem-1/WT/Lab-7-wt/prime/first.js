let num1 = (Number(prompt("Enter Number : ")))
let i, flag = true;
for (i = 2; i <= num1 - 1; i++) {
    if (num1 % i == 0) {
        flag = false;
        break;
    }
}
if (flag == true)
    console.log(num1 + " is prime");
else
    console.log(num1 + " is not prime");