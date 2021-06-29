import Tab
from collections import Counter
import copy
import numpy as np


def checkArray(sudoku):
    row_dic = {}
    col_dic = {}

    for i in range(9):
        col_dic[f"Col_{i}"] = dict(Counter(sudoku[:, i]))
        row_dic[f"Row_{i}"] = dict(Counter(sudoku[i, :]))

    field_dic = {
        "Field_0": dict(Counter(list(sudoku[:3, :3].flat))),
        "Field_1": dict(Counter(list(sudoku[:3, 3:6].flat))),
        "Field_2": dict(Counter(list(sudoku[:3, 6:].flat))),
        "Field_3": dict(Counter(list(sudoku[3:6, :3].flat))),
        "Field_4": dict(Counter(list(sudoku[3:6, 3:6].flat))),
        "Field_5": dict(Counter(list(sudoku[3:6, 6:].flat))),
        "Field_6": dict(Counter(list(sudoku[6:, :3].flat))),
        "Field_7": dict(Counter(list(sudoku[6:, 3:6].flat))),
        "Field_8": dict(Counter(list(sudoku[6:, 6:].flat)))

    }

    fieldTest = checkDic(field_dic)
    rowTest = checkDic(row_dic)
    colTest = checkDic(col_dic)

    if fieldTest == False or rowTest == False or colTest == False:
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


# sudoku[1][8] = 2


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
                    if possibilities == 1:
                        sudoku[row][col] = last_guess
                    else:
                        sudoku[row][col] = 0
        if np.array_equal(sudoku, sudoku_copy):
            return sudoku

if __name__ == "__main__":
    # 0 - undone
    # 1 - done
    # 2 - done
    print(simpleBot(Tab.Sudoku(3)))

