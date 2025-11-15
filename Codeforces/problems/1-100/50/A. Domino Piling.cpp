#include <iostream>
#include <string>

int main() {

    int m = 0;
    int n = 0;

    std::cin >> m >> n;

    const int area = 2;

    std::cout << std::to_string((m * n) / area) << "\n";

    return 0;
}
