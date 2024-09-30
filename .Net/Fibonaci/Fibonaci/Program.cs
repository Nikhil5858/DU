using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fibonaci
{
    class Program
    {
        public void fibonaci(int num)
        {
            long fibo = 1;
            int i = 1;
            while (i<=num)
            {
                fibo = fibo + i;
                i++;
            }
            Console.WriteLine("Fibonaci Value is : "+fibo);
        }
        static void Main(string[] args)
        {
            int num;
            Console.WriteLine("Enter Fibonaci Number to Find : ");
            num = Convert.ToInt32(Console.ReadLine());
            Program program = new Program();
            program.fibonaci(num);
        }
    }
}
