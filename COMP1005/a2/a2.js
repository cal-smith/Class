/*
Assignment 2
*/


/*
* Question 1
*/
function factorial (n){
	var x = 1;
	for (var i = 1; i < n+1; i++) {
		x = x * i;
	}
	return x;
}
//tests
console.log('factorial', factorial(5));
console.log('factorial', factorial(9000));
console.log('factorial', factorial(24));

/*
* Question 2
*/
function add_list (list){
	return list.reduce(function(x, y){
		return x + y;
	});
}
//tests
console.log('add_list', add_list([1, 1, 1, 1]));
console.log('add_list', add_list([1, 2, 3, 4]));
console.log('add_list', add_list([5, 10, 1.5, 3]));

/*
* Question 3
*/
function average(list){
	return add_list(list) / list.length;
}
//tests
console.log('average', average([1, 2, 3, 4]));
console.log('average', average([100, 80, 90, 50, 70, 20, 100]));
console.log('average', average([3, 2, 3, 3, 3, 3, 4]));

/*
* Question 4
*/
function threshold(a, x){
	var y = [];
	for (var i = 0; i < a.length; i++) {
		if (a[i] >= x) y.push(a[i]);
	}
	return y;
}
//tests
console.log("threshold", threshold([1, 2, 5, 3, 6], 4));
console.log("threshold", threshold([1, 2, 5, 3, 6, 7, 8, 9, 20, 50, 12, 14], 15));
console.log("threshold", threshold([1, 2, 5, 3, 6, 6, 8, 9, 20, 12], 4.4));

/*
* Question 5
*/
function bmi_category(bmi){
	switch (true){
		case bmi < 18.5:
			return "underweight";
			break;
		case bmi < 25:
			return "normal";
			break;
		case bmi < 30:
			return "overweight";
			break;
		default:
			return "obese";
			break;
	}
}
//tests
console.log(bmi_category(18.4));
console.log(bmi_category(24));
console.log(bmi_category(25));
console.log(bmi_category(9001));

/*
* Question 6
*/
function log2(n){ 
	for(var x = 0; n > 1; x++){
		n = Math.floor(n / 2);
	}
	return x;
}
//tests
console.log(log2(8));
console.log(log2(9001));
console.log(log2(23));