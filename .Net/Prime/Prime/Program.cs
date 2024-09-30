using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prime
{
    class Program
    {
        public void Prime1(int num)
        {
            bool flag = false;
            for (int i = 2; i < num; i++)
            {
                if (num%i== 0)
                {
                    flag = true;
                }
            }   
            if (flag == true)
            {
                Console.WriteLine("Number Is Not Prime");
            }
            else
            {
                Console.WriteLine("Number Is Prime");
            }
        }
        static void Main(string[] args)
        {
            int num;
            Console.WriteLine("Enter Number : ");
            num = Convert.ToInt32(Console.ReadLine());
            Program program = new Program();
            program.Prime1(num);
        }
    }
}
