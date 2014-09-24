#include <stdio.h>

int factorial(int n)
{
	int x = 1;
	for (int y = 1; y < n + 1; ++y)
	{
		x = x * y;
	}
	return x;
}

int add_list(int a[])
{
	int x = 0;
	int count = sizeof(a[0]);
	for (int i = 0; i < count; ++i)
	{
		x = x + a[i];
	}
	return x;
}

int average(int a[])
{
	return add_list(a) / sizeof(a[0]);
}

int * threshold(int a[], int x)
{
	static int y[] = {0};
	int yi = 0;
	int count = sizeof(a[0]);
	for (int i = 0; i < count; ++i)
	{
		if (a[i] >= x)
		{
			y[yi] = a[i];
			++yi;
		}
	}
	return y;
}

char bmi_category(int bmi)
{
	return 0;
}

int llog2(int n)
{
	return 0;
}

int main(int argc, char const *argv[])
{
	printf("%s\n", "hi");
	printf("factorial: %d\n", factorial(5));
	int aarray[4] = {3, 2, 3, 4};
	printf("add_list: %d\n", add_list(aarray));
	printf("average: %d\n", average(aarray));
	int tarray[5] = {1, 2, 5, 3, 6};
	printf("%s\n", threshold(tarray, 4));
	return 0;
}