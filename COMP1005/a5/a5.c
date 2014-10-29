#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int compare (const void * a, const void * b){
  if ( *(int*)a <  *(int*)b ) return -1;
  if ( *(int*)a == *(int*)b ) return 0;
  if ( *(int*)a >  *(int*)b ) return 1;
  return 0;
}

/*unique sorted array
take array
sort array
set return_array
if array[i] == array[i+1]
return array = array[i]
++i
else
return_array = array[i]
*/

/*contains
if array[i] == n
return 1

return 0
*/

/*unique unsorted array
take array
uniquesortedarray
if contains array[i] uniquesortedarray != 0
return array.push(array[i])
*/

int *sorted(int a[]){
	int *r = a;
	qsort(r, sizeof(a[0]), sizeof(int), compare);
	return r;
}

int contains(int n, int a[]){//to check if value is in array. for use with sorted arrays
	for (int i = 0; i <= sizeof(a[0]); ++i){
		if (a[i] == n){
			return 1;
		}
	}
	return 0;
}

int unique(int a[]){
	return 0;
}

int pos_and_neg(int a[]){
	return 0;
}

int encrypt(int s, int d){
	/*this might be nearly impossible with stdlib because c has no dict/hashmap
	 *otoh it might be possible with some clever string mangeling
	*/
	return 0;
}

int main(int argc, char const *argv[]){
	int rry[5] = {2,1,3,1,4};
	unique(rry);
	/*for (int i = 0; i <= sizeof(sorted(rry)[0]); ++i){
		printf("%d\n", sorted(rry)[i]);
	}*/
	printf("%d\n", contains(5, rry));
	return 0;
}
