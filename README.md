# Maximum-Number-of-Balloons-
Given a string, determine the maximum number of times the word "balloon" can be formed using the characters from the string. Each character in the string can be used only once.
To solve this problem, you start by creating a hashmap to count the frequency of each letter in the given string. Since the word "balloon" contains specific letters with varying frequencies (like 'l' and 'o' appearing twice), you need to account for these in your hashmap. Once you have the frequency of each letter, the next step is to determine how many times you can form the word "balloon". This is done by finding the minimum number of times each letter in "balloon" appears in the hashmap. The limiting factor will be the letter with the minimum frequency ratio to its requirement in the word "balloon". This approach ensures a balance between utilizing the available letters and adhering to the letter composition of "balloon".

Character Frequency Count: Traverse the string and populate a hashmap with the frequency count of each character.

Determine Maximum Count: Check the hashmap to determine the maximum number of times the word "balloon" can be formed. For characters 'b', 'a', and 'n', their frequency in the hashmap directly gives the number of times they can be used. For 'l' and 'o', we need to divide their frequency by 2.

Result Calculation: The minimum value among the counts of 'b', 'a', 'l'/2, 'o'/2, and 'n' will give the maximum number of times the word "balloon" can be formed.

Return the Result: Return the calculated minimum value as the final result.

This approach is effective because it ensures that we account for the frequency of each character required to form the word "balloon". Using a hashmap allows for efficient storage and retrieval of character frequencies.

Algorithm Walkthrough:

Given the input string "balloonballoooon":

Initialize an empty hashmap.
Traverse the string and populate the hashmap with character frequencies: {'b':2, 'a':2, 'l':4, 'o':5, 'n':2}.
Calculate the maximum number of times "balloon" can be formed:
'b' can be used 2 times.
'a' can be used 2 times.
'l' can be used 4/2 = 2 times.
'o' can be used 5/2 = 2.5 times, but since we need whole words, it's 2 times.
'n' can be used 2 times.
The minimum among these values is 2, which is the final result.
