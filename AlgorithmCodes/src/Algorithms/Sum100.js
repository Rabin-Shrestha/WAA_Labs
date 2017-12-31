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
*Solution 1 is :
* ======================================
*/

var digits = [1,2,3,4,5,6,7,8,9];
var searchSum = 100;

function concatPrefix(prefix, paths) {
    return paths
        .filter(function(p) { return p.length > 0; })
        .map(function(p) { return prefix.concat(p); });
}

function findPaths(sum, previousNumber, index) {
    var previousDigit = Math.abs(previousNumber%10);
    if (index >= digits.length) {
        return sum == previousNumber ? [[previousDigit]] : [];
    }

    var currentDigit = digits[index];
    var concatenatedNumber = previousNumber >= 0
        ? 10*previousNumber + currentDigit
        : 10*previousNumber - currentDigit;

    var plusPaths = findPaths(sum-previousNumber, currentDigit, index+1);
    var minusPaths = findPaths(sum-previousNumber, -currentDigit, index+1);
    var concatPaths = findPaths(sum, concatenatedNumber, index+1);

    var paths = [];
    Array.prototype.push.apply(paths, concatPrefix([previousDigit, '+'], plusPaths));
    Array.prototype.push.apply(paths, concatPrefix([previousDigit, '-'], minusPaths));
    Array.prototype.push.apply(paths, concatPrefix([previousDigit, '&'], concatPaths));
    return paths;
}

var foundPaths = findPaths(searchSum, digits[0], 1);

if (foundPaths.length == 0) {
    document.body.textContent += "no paths were found";
} else {
    for (var i = 0; i < foundPaths.length; i++) {
        var div = document.createElement("div");
        div.textContent = foundPaths[i].join("").replace(/&/g, "").replace(/(\+|\-)/g, " $1 ");
        document.body.appendChild(div);
    }
}
