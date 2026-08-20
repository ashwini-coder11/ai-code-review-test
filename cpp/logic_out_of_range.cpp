#include <iostream>
#include <vector>

int main() {
    std::vector<int> values = {1, 2, 3, 4};
    int total = 0;
    for (int i = 0; i <= values.size(); ++i) {
        total += values[i];
    }
    std::cout << total << std::endl;
    return 0;
}

// The loop reads past the end of the vector when i reaches the size.
