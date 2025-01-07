#include <stdio.h>

struct Student_Detail{
	int Enrollment_no;
	char name[20];
	int cpi;
	int Sem;
};

void main(){
	struct Student_Detail s[5];
	int i;
	for(i=0;i<5;i++){
		printf("Enter Student Enrollment_no : \n");
		scanf("%d",&s[i].Enrollment_no);
		printf("Enter Student Name : \n");
		scanf("%s",s[i].name);
		printf("Enter Student CPI : \n");
		scanf("%d",&s[i].cpi);
		printf("Enter Student SEM : \n");
		scanf("%d",&s[i].Sem);
	}
	
	printf("Enrollment_no \tName \tCPI \tSEM\n\n");
	
	for(i=0;i<5;i++){
		printf("%d",s[i].Enrollment_no);
		printf("\t\t%s",s[i].name);
		printf("\t%d",s[i].cpi);
		printf("\t%d",s[i].Sem);
		printf("\n");
	}
}
