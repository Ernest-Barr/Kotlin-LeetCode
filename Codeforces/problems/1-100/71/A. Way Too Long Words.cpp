#include <iostream>
#include <string> 
#include <vector> 

int main() {
    int n = 0; 

    std::cin >> n; 

    std::vector<std::string> strings; 

    strings.resize(n); 

    for (int i = 0; i < n; ++i) std::cin >> strings[i]; 

    for (int i = 0; i < n; ++i) {
        int m = strings[i].length();
        if (m > 10) {
            strings[i] = strings[i][0] + std::to_string(m - 2) + strings[i][m - 1];
        }
    }

    for (const auto &str : strings) std::cout << str << std::endl; 

    return 0;
}