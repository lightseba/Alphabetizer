# Alphabetizer
extra credit in comp sci a

EDIT: You can assume that no one will enter more than 10 words per letter of the alphabet.  You do NOT need to keep track of the filled count of each row. Once we do ArrayLists you'll see how this could be done much more elegantly using an array of ArrayLists but for now, it must be a 2D array.

This assignment, if completed as described below, is worth 10 extra credit points.  That's 10/0 not 10/10.   

This assignment will require you to learn how to use 2D arrays outside of class time.  You MUST use a 2D array.  In fact, everything about this should be outside of class time and normal study time.  While this assignment could supplement your preparations for the exam on Wednesday do not neglect exam preparation for this project.  

Create a class that builds a 2D array with a row for every letter of the alphabet and a column to accommodate 10 words per letter.

Take keyboard input to populate the 2D array, placing each word in its appropriate row (e.g. "Apple" goes in row 0) AND places the word in its appropriate place alphabetically within the row, rewriting the entire row when needed.

Additionally, you must detect any spaces in a given String input and separate the words. E.g. "Apples Oranges" should be separated into "Apples" and "Oranges" and stored appropriately.

Create a sentinel value of your choosing to quit.  Good sentinels are unique combinations of special characters like "&$*#" for example.  After detecting the sentinel, print the contents of the array with each letter on its own line

Example:

Apples Art Axes

Bananas Blueberries Bratwurst

...and so on
