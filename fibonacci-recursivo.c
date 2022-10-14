
#include <stdio.h>

int fibonacci(int n) {
  int x;
  
  if (n == 1 || n == 2) {
    return 1;
  }
  
  else{
  
 return fibonacci(n - 1) + fibonacci(n - 2);
 
  }
}


int main() {
  int n, num;
  
  printf("Digite o numero: ");
  scanf("%d", &n);
  
  while(n <= 0) {
    printf("Numero incorreto. Digite novamente: ");
    scanf("%d", &n);
  }
  
  for (num = 1; num <= n; num++) {
    printf("%d \n", fibonacci(num));
  }
  return(0);
}
