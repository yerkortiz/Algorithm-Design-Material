#include <stdio.h>
typedef long long int uint64_t;
void bin(uint64_t)
{
    if (n > 1) bin(n >> 1);
    printf("%llu ", n & 1);
}
int main(int argv, char **argc)
{
    return 0;
}