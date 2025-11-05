#include <cmath>
#include <iostream>

bool isPalindromicNum(const int n) {
    int res = 0;
    int cpy = abs(n);

    while (cpy != 0) {
        res *= 10;
        res += cpy % 10;
        cpy /= 10;
    }

    return res == abs(n);
}

int main() {
    int res = -1;

    for (int i = 999; i >= 100; --i) {
        for (int j = i; j >= 100; --j) {
            int curr = i * j;

            if (curr < res) break;

            if (isPalindromicNum(curr)) {
                res = std::max(res, curr);
            }
        }
    }

    std::cout << res << std::endl;
}