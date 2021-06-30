### Basic sudoku solver in Python

This program reads 9x9 numpy arrays sudoku and returns the result.
Program finds the first zero value and tries to substitute different numbers for it. If only one matches, it is entered. Program continues until there are no 0s left or until it cannot find an answer.





It has been tested on 20,000 examples from the kaggle database. https://www.kaggle.com/bryanpark/sudoku

99.96% of sudoku examples was solved correctly.

![20000](https://user-images.githubusercontent.com/59071939/123943037-03fd7580-d99c-11eb-99ba-fa5f5055528f.PNG)


Examples of tasks that the code was unable to handle: 

![Fail 3](https://user-images.githubusercontent.com/59071939/123942951-e9c39780-d99b-11eb-9edd-1b0da99aa138.PNG)

![Fail 8](https://user-images.githubusercontent.com/59071939/123943022-ff38c180-d99b-11eb-96f0-cdb18bad63e6.PNG)
