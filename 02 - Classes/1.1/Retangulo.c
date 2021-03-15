#include <stdio.h>
#include <math.h>

typedef struct {
int x, y;
int w, h;
} Rect;


void print (Rect*r1){
	printf("O retangulo possui tamanho (%d,%d) e esta na posicao (%d, %d)\n", r->w,r->h, r->x,r->y);
}

void main (void){
	Rect r1 = {1,1, 20,20};
	print (&r1);
}
