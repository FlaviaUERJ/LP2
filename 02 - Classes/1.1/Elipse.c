#include <stdio.h>
#include <math.h>

typedef struct
{
    int x, y;
	  float raio;

} Elipse;

void print (Elipse* e){
		printf("Elipse na posicao (%d,%d) e raio %.2f )\n", e->x, e->y, e->raio);	
	}

int main (){
	Elipse e1 = {1,1,1,5,15,30};
	print(&e1);
	return 0;
}
