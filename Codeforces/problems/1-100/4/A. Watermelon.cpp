#include <iostream>

int main() {
    int n = 0;

    std::cin >> n;

    if (n % 2 == 0 && n - 2 > 0)
        std::cout << "YES" << std::endl;
    else
        std::cout << "NO" << std::endl;

    return 0;
}