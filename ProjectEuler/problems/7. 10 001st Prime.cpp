#include <cmath>
#include <iostream>
#include <vector> 

bool isPrime(int64_t n) {
    if (n <= 1) return false; 
    for (int64_t i = 2; i * i <= n; ++i) if (n % i == 0) return false;
    return true;
}

// Must be greater than 0 
int calculateNthPrime(int n) {
    int count = 0; 
    int64_t num = 2; 

    while (count < n) { 
        if (isPrime(num++)) count++;
        if (count == n) return num - 1; 
    }

    return -1;
}

int main() {
    std::cout << calculateNthPrime(10001) << std::endl;
}