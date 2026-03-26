#include "resistor_color.h"

// Function 1: Get the numeric value of a single band
int color_code(resistor_band_t color) {
    // Because the enum assigns integer values starting from 0,
    // the color itself IS the correct numeric value.
    return color; 
}

// Function 2: Return an array of all possible bands
const resistor_band_t* colors(void) {
    // We use 'static' so the array's memory isn't destroyed 
    // when the function finishes running.
    static const resistor_band_t all_colors[] = {
        BLACK, BROWN, RED, ORANGE, YELLOW, 
        GREEN, BLUE, VIOLET, GREY, WHITE
    };
    
    return all_colors;
}