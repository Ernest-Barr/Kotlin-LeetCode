#include <iostream>
#include <string>

int main () {

    std::string str = "";

    std::cin >> str;

    int upper = 0;

    for (const auto& c : str) if (c >= 'A' && c <= 'Z') upper++;

    int lower = str.length() - upper;

    for (auto &c : str) {
        if (lower >= upper) {
            if (c >= 'A' && c <= 'Z') c += 32;
        } else {
            if (c >= 'a' && c <= 'z') c -= 32;
        }
    }

    std::cout << str << "\n";

    return 0;
}
