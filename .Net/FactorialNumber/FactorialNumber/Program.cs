using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactorialNumber
{
    class Program
    {
        public void factorial(int num)
        {
            long fact = 1;
            int i = 1;
            while (i<=num)
            {
                fact  = fact*i;
                i++;
            }
            Console.WriteLine("Factorial Value is : "+fact);
        }
        static void Main(string[] args)
        {
            int num;
            Console.WriteLine("Enter Number to find Factorial : ");
            num = Convert.ToInt32(Console.ReadLine());
            Program program = new Program();
            program.factorial(num);
        }
    }
}
