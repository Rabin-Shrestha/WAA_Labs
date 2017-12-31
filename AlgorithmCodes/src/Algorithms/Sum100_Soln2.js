/**
 * Created by Rabin Shrestha on 12/25/2017.
 */

/*Algorithm for placing plus and minus signs between digits so that the result is 100

 December 7, 2013 2 Comments

 Yesterday I found the following programming problem:
 Write a program that outputs all possibilities to put + or – or nothing between the numbers 1,2,…,9 (in this order) such that the result is 100.

 This problem has 11 solutions and they are demonstrated here: Fun with numbers: place plus/minus signs between the digits.
 1 + 2 + 34 – 5 + 67 – 8 + 9 = 100
 12 + 3 – 4 + 5 + 67 + 8 + 9 = 100
 123 – 4 – 5 – 6 – 7 + 8 – 9 = 100
 123 + 4 – 5 + 67 – 89 = 100
 123 + 45 – 67 + 8 – 9 = 100
 123 – 45 – 67 + 89 = 100
 12 – 3 – 4 + 5 – 6 + 7 + 89 = 100
 12 + 3 + 4 + 5 – 6 – 7 + 89 = 100
 1 + 23 – 4 + 5 + 6 + 78 – 9 = 100
 1 + 23 – 4 + 56 + 7 + 8 + 9 = 100
 1 + 2 + 3 – 4 + 5 + 6 + 78 + 9 = 100

 HElP : https://vortexwolf.wordpress.com/2013/12/07/algorithm-plus-minus-result-100/


 */

/*======================================
 *Solution 2 is :
 * ======================================
 */


var numbers = [1,2,3,4,5,6,7,8,9];
var sum = 100;
var signs = ['+', '-', '&'];
var numbersInnerLength = numbers.length-1;
var cLength = Math.pow(signs.length, numbersInnerLength);
var combinations = [];

for (var i = 0; i < cLength; i++) {
    var newArray = [];
    for (var j = 0; j < numbers.length; j++) {
        newArray[j*2] = numbers[j];
    }
    combinations.push(newArray);

}

for (var k = 0; k < numbersInnerLength; k++) {
    var periodLength = cLength / Math.pow(signs.length, k+1);
    var signIndex = 0;
    for (var i = 0; i < cLength; i+=periodLength) {
        for (var j = 0; j < periodLength && i+j < cLength; j++) {
            combinations[i+j][k*2+1] = signs[signIndex];
        }
        signIndex = (signIndex+1)%signs.length;
    }
}

for (var i = 0; i < combinations.length; i++) {
    var combination = combinations[i];
    var cstr = combination.join("").replace(/&/g, "");
    if (eval(cstr) == sum) {
        console.log(cstr);
    }
}
