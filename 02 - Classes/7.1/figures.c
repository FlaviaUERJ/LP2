#include <stdio.h>
#include <stdlib.h>
#include <math.h>

typedef struct {
    int r,g,b;
} Color;

struct Figure;
typedef void (* Figure_Print) (struct Figure*);

typedef struct Figure {
    int x, y;
    int w, h;
    Color contorno, fundo;
    void (* print) (struct Figure*);
} Figure;


/**************************************************************************************/

/********************/
/*    Losango     * /
/******************/

typedef struct {
    Figure super;
} Lozenge;

void Lozenge_print (Lozenge* this) {
    Figure* sup = (Figure*) this;
    printf("Losango na posicao (%d,%d) de tamanho (%d,%d) com cor de Contorno(%d,%d,%d), e cor de fundo (%d,%d,%d).\n",
        sup->x,sup->y, sup->h,sup->w, sup->contorno.r,sup->contorno.g,sup->contorno.b,sup->fundo.r,sup->fundo.g,sup->fundo.b);  
}

Lozenge* lozenge_new (int x, int y, int w, int h, Color bg, Color fg) {
    Lozenge* this = malloc(sizeof(Lozenge));
    Figure* sup = (Figure*) this;
    sup->print = (Figure_Print) Lozenge_print;
    sup->x = x;
    sup->y = y;
    sup->w = w;
    sup->h = h;
    sup->contorno = contorno;
    sup->fundo = fundo;
}

/**************************************************************************************/

/********************/
/*    Pentagono   * /
/******************/

typedef struct {
    Figure super;
	Polygon p ;
} Pentagono;

void pentagon_print (Pentagono* this) {
    Figure* sup = (Figure*) this;

    printf("Pentagono de vertices em (%d,%d), (%d,%d), (%d,%d), (%d,%d) e (%d,%d).\n",
            sup->x + (sup->w)/2, sup->y,
            sup->x + sup->w, sup->y + (25*sup->h)/100,
            sup->x + (75*sup->w)/100, sup->y + sup->h,
            sup->x + (sup->w)/2, sup->y + sup->h,
            sup->x, sup->y + (25*sup->h)/100);
}

Pentagon* pentagon_new (int x, int y, int w, int h) {
    Pentagono* this = malloc(sizeof(Pentagono));
    Figure* sup = (Figure*) this;
    sup->print = (Figure_Print) pentagono_print;
    sup->x = x;
    sup->y = y;
    sup->w = w;
    sup->h = h;
}
/********************************************************************************************/
void main (void) {
    Figure* figs[4] = {
        (Figure*) Pentagono_new(25,25,70,70, red, orange),
        (Figure*) Lozenge_new(30,60,140,140, green, blue),
        (Figure*) Pentagono_new(15,10,200,200, yellow, pink),
        (Figure*) Lozenge_new(210,100,140,140, black, magenta),
    };

  

    for (int i=0; i<4; i++) {
        figs[i]->print(figs[i]);
    }

  

    for (int i=0; i<4; i++) {
        free(figs[i]);
    }
}
