#include <iostream> 
#include <cmath> 

int main() { 
    int64_t res = 2520; 

    while (true) {
        int c = 0;

        for (int i = 20; i >= 1; --i) {
            if (res % i != 0) break;
            c++;
        }
        
        if (c == 20) break;

        res++;
    }

    std::cout << res << std::endl;
}