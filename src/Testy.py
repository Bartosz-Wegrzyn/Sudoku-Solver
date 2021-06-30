import Tab
from collections import Counter
import copy
import numpy as np


def checkArray(sudoku):
    row_dic = {}
    col_dic = {}
    field_dic = {}
    reshaped = sudoku.reshape(3, 3, 3, 3)

    for i in range(9):
        col_dic[f"Col_{i}"] = dict(Counter(sudoku[:, i]))
        row_dic[f"Row_{i}"] = dict(Counter(sudoku[i, :]))
        field_dic[f"Field{i}"] = dict(Counter(list(reshaped[(i // 3), :, i % 3, :].reshape(9).flat)))

    fieldTest = checkDic(field_dic)
    rowTest = checkDic(row_dic)
    colTest = checkDic(col_dic)

    if fieldTest is False or rowTest is False or colTest is False:
        return False
    else:
        return True


def checkDic(x_dic):
    for row in x_dic:
        for element in x_dic[row]:
            if element != 0:
                if x_dic[row][element] > 1:
                    return False
    return True


def simpleBot(sudoku):
    while True:
        sudoku_copy = copy.deepcopy(sudoku)
        last_guess = 0
        for row in range(9):
            for col in range(9):
                if sudoku[row][col] == 0:
                    possibilities = 0
                    for guess in range(1, 10):
                        sudoku[row][col] = guess
                        if checkArray(sudoku) is True:  # Test Pass
                            last_guess = guess
                            possibilities += 1
                            if possibilities > 1:
                                break
                    if possibilities == 1:
                        sudoku[row][col] = last_guess
                    else:
                        sudoku[row][col] = 0
        if np.array_equal(sudoku, sudoku_copy):
            return sudoku


if __name__ == "__main__":

    Pass = 0
    Fails = 0
    import csv

    with open('sudoku.csv', newline='') as csvfile:
        spamreader = csv.reader(csvfile, delimiter=' ', quotechar='|')

        for row in spamreader:
                curent_sudoku = ', '.join(row).split(",")[0]
                excepted_output = ', '.join(row).split(",")[1]

                try:
                    curent_sudoku = [int(char) for char in curent_sudoku]
                    excepted_output = [int(char) for char in excepted_output]
                    curent_sudoku = np.array(curent_sudoku).reshape((9, 9))
                    excepted_output = np.array(excepted_output).reshape((9, 9))

                    out = simpleBot(curent_sudoku)

                    if np.array_equal(out, excepted_output):
                        Pass += 1
                        print("Pass: ", Pass)
                        print("Fails: ", Fails)


                    else:
                        Fails += 1
                        print("Fails: ", Fails)
                        print(curent_sudoku)

                except:
                    pass