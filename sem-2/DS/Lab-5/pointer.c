#include <stdio.h>

struct Employee_Detail{
	int employee_id;
	char name[20];
	char designation[20];
	int salary;
};

void main(){
	struct Employee_Detail em1;
	struct Employee_Detail *ptr = &em1;
	printf("Enter Employee Id : \n");
	scanf("%d",&ptr->employee_id);
	printf("Enter Employee Name : \n");
	scanf("%s",ptr->name);
	printf("Enter Employee Designation : \n");
	scanf("%s",ptr->designation);
	printf("Enter Employee Salary : \n");
	scanf("%d",&ptr->salary);
	
	printf("Id \tName \tDesignation \tSalary\n");
	
	printf("%d\t",ptr->employee_id);
	printf("%s\t",ptr->name);
	printf("%s\t\t",ptr->designation);
	printf("%d\t",ptr->salary);
}
