#include <stdio.h>

struct Employee_Detail{
	int employee_id;
	char name[20];
	char designation[20];
	int salary;
};

void main(){
	struct Employee_Detail em1;
	printf("Enter Employee Id : \n");
	scanf("%d",&em1.employee_id);
	printf("Enter Employee Name : \n");
	scanf("%s",em1.name);
	printf("Enter Employee Designation : \n");
	scanf("%s",em1.designation);
	printf("Enter Employee Salary : \n\n");
	scanf("%d",&em1.salary);
	
	printf("Id \tName \tDesignation \tSalary\n");
	
	printf("%d\t",em1.employee_id);
	printf("%s\t",em1.name);
	printf("%s\t\t",em1.designation);
	printf("%d\t",em1.salary);
}
