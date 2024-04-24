/*---------------------------------------------
 | Name: Natalie Mann                          |
 | Date: No idea when I started this           |
 | Teacher: Mr Hanley                          |
 | Sauce Code: 3                               |
 | Credit to Alex he helping so much with this |
 ---------------------------------------------*/

final char SPACE = '0';
final char WALL = '1';
int x = 0;
int y = 0;
int mouse = 0;
int storeX;
int storeY;

//grid width and height
final int WIDTH = 9, HEIGHT =9;

char[][]sudoku = { {0, 2, 9, 0, 8, 0, 7, 0, 6},
  {0, 0, 8, 2, 7, 3, 0, 9, 0},
  {0, 3, 0, 9, 0, 0, 8, 2, 4},
  {0, 5, 0, 3, 9, 0, 0, 0, 2},
  {1, 0, 0, 0, 4, 2, 0, 0, 5},
  {3, 0, 2, 0, 0, 0, 0, 6, 0},
  {0, 1, 7, 0, 0, 9, 0, 0, 0},
  {4, 0, 0, 8, 0, 0, 9, 0, 3},
  {9, 0, 3, 0, 1, 4, 0, 0, 0} };  //x,y

int[][]solved = { {5, 2, 9, 4, 8, 1, 7, 3, 6}, // first
  {6, 4, 8, 2, 7, 3, 5, 9, 1}, // second
  {7, 3, 1, 9, 6, 5, 8, 2, 4}, // third
  {8, 5, 4, 3, 9, 6, 1, 7, 2}, // fourth
  {1, 9, 6, 7, 4, 2, 3, 8, 5}, // fifth
  {3, 7, 2, 1, 5, 8, 4, 6, 9}, // sixth
  {2, 1, 7, 5, 3, 9, 6, 4, 8}, // seventh
  {4, 6, 5, 8, 2, 7, 9, 1, 3}, // eighth
  {9, 8, 3, 6, 1, 4, 2, 5, 7} }; //ninth


boolean i = false;
boolean filled = false;
boolean unfilled = true;
boolean notdone = true;
boolean [][]constant = new boolean [WIDTH][HEIGHT];
boolean correct = false;
boolean button = false;
boolean reset = false;

void setup() {
  size(650, 650);
  //window size
  loadSudoku();
  }
void loadSudoku() {
  // Open the file from the createReader
  BufferedReader reader = createReader("new fil.txt");
  String line = null;
  y=0;
  try {
    while ((line = reader.readLine()) != null) {
      //Break the line into its individual 50 integer values and reads it
      int x=0;
      while (x<line.length()) {
        switch(line.substring(x, x+1)) {
        case ".":
          sudoku[x][y] = SPACE;
          break;
        }
        x++;
      }
      y++;
    }
    reader.close();
  }
  catch (IOException e) {
    e.printStackTrace();
  }
}

void mouseClicked() {
  if (mouseX >100 && mouseX<550 &&mouseY>100&&mouseY<550&&mouseButton==LEFT) {
    if (sudoku[floor(((mouseX-100)/50))][floor(((mouseY-100)/50))]!='0') {
      i = true;
      storeX = mouseX;
      storeY = mouseY;
    }
  }
  if (mouseButton == LEFT && mouseX <400 && mouseX > 250 && mouseY < 620 && mouseY > 570) {
    button = true;
    for (x=0; x<WIDTH; x++) {
      for (y=0; y<HEIGHT; y++) {
        if ((sudoku[x][y]) == (solved[x][y])) {
          correct = true;
        } else {
          correct = false;
          unfilled = true;
          filled = false;
        }
        if(x == 8 && y == 8){
          if(correct == true){
            unfilled = false;
            filled = true;
          } else {
            unfilled = true;
            filled = false;
          }
        }
      }
    }
  }
/*  if(mouseButton == LEFT && mouseX < 620 && mouseX > 570 && mouseY < 620 && mouseY > 620){
    reset = true;
  }*/
}




  void draw() {
    //start of grid
    background(255);
    strokeWeight(1);
    fill(255, 255, 255);
    for (int x=0; x<WIDTH; x++) {
      for (int y=0; y<HEIGHT; y++) {
        rect(x*50+100, y*50+100, 50, 50);
      }
    }
    strokeWeight(6);
    line(100, 100, 100, 550); //left left line thickens certain lights, sort of an aesthetic thing than anything
    line(100, 100, 550, 100); //top top line
    line(550, 550, 550, 100); //right right
    line(550, 550, 100, 550); //bottom bottom
    line(250, 100, 250, 550); //left right
    line(400, 100, 400, 550); //right left
    line(100, 250, 550, 250); //top bottom
    line(100, 400, 550, 400); //bottom top
    //font
    PFont comic;
    comic = loadFont("ComicSansMS-60.vlw"); //font, text size, where it is located and if it is to the right, left, or center of the coordinate
    fill(170, 170, 170);
    rect(250, 570, 150, 50);
   // rect(570,570,50,50);
    textFont(comic);
    textSize(60);
    fill(0, 0, 0);
    textAlign(CENTER);
    text("Sudoku", 320, 70);
    textSize(40);
    text("Check", 325, 610);
    textSize(15);
    //text("Reset", 595, 600);
    //numbers
    //change this to an array with for loop seems you can not do it with text
    textAlign(CENTER, CENTER);
    textSize(35);
    /*for (x=0; x<9; x++) {
     for (y=0; y<9; y++) {
     if(sudoku[x][y] != 0){
     if(sudoku[x][y] == 1){
     text("1",sudoku[x][y], sudoku[x][y]);
     }
     if(sudoku[x][y] == 2){
     text("2",sudoku[x][y], sudoku[x][y]);
     }
     if(sudoku[x][y] == 3){
     text("3",sudoku[x][y], sudoku[x][y]);
     }
     if(sudoku[x][y] == 4){
     text("4",sudoku[x][y], sudoku[x][y]);
     }
     if(sudoku[x][y] == 5){
     text("5",sudoku[x][y], sudoku[x][y]);
     }
     if(sudoku[x][y] == 6){
     text("6",sudoku[x][y], sudoku[x][y]);
     }
     if(sudoku[x][y] == 7){
     text("7",sudoku[x][y], sudoku[x][y]);
     }
     if(sudoku[x][y] == 8){
     text("8",sudoku[x][y], sudoku[x][y]);
     }
     if(sudoku[x][y] == 9){
     text("9",sudoku[x][y], sudoku[x][y]);
     }
     }
     }
     } */
    text("2", 175, 125); //2,1
    text("9", 225, 125); //3,1
    text("8", 325, 125); //5,1
    text("7", 425, 125); //7,1
    text("6", 525, 125); //9,1
    text("8", 225, 175); //3,2
    text("2", 275, 175); //4,2
    text("7", 325, 175); //5,2
    text("3", 375, 175); //6,2
    text("9", 475, 175); //8,2
    text("3", 175, 225); //2,3
    text("9", 275, 225); //4,3
    text("8", 425, 225); //7,3
    text("2", 475, 225); //8,3
    text("4", 525, 225); //9,4
    text("5", 175, 275); //2,4
    text("3", 275, 275); //4,4
    text("9", 325, 275); //5,4
    text("2", 525, 275); //9,4
    text("1", 125, 325); //1,5
    text("4", 325, 325); //5,5
    text("2", 375, 325); //6,5
    text("5", 525, 325); //9,5
    text("3", 125, 375); //1,6
    text("2", 225, 375); //3,6
    text("6", 475, 375); //8,6
    text("1", 175, 425); //2,7
    text("7", 225, 425); //3,7
    text("9", 375, 425); //6,7
    text("4", 125, 475); //1,7
    text("8", 275, 475); //4,8
    text("9", 425, 475); //7,8
    text("3", 525, 475); //9,8
    text("9", 125, 525); //1,9
    text("3", 225, 525); //3,9
    text("1", 325, 525); //5,9
    text("4", 375, 525); //6,9

    for (x=0; x<9; x++) {
      for (y=0; y<9; y++) {
        if ((sudoku[x][y] != '0'&& sudoku[x][y] != '.')) {
          if (i == true) {
            fill(8, 201, 206);
            text (sudoku[x][y], (x*50)+125, (y*50)+125);
          }
        }
      }
    }
    if (unfilled==false && filled == true && correct == true && button == true) {
      fill(30, 196, 67);
      rect(250, 300, 150, 50);
      fill(255, 255, 255);
      text("Correct", 325, 325);
    } else if (unfilled == true && filled == false && correct == false && button == true) {
      fill(211, 15, 21);
      rect(250, 300, 150, 50);
      fill(255, 255, 255);
      textSize(30);
      text("Incorrect", 325, 325);
    }
    /*
   to make the solver, have it so it calculates the sum (45) and multiply (362880) of the boxes, rows, column, etc
     each number inputted is put into an array then add certain array values up so you can test
     use if statements for assigning arrays (more efficient method)
     */
  } //end of void draw

  void keyPressed() {
    if (key == '1'||key == '2'||key == '3'||key == '4'|key == '5'||key == '6'||key == '7'||key == '8'||key == '9'||key==BACKSPACE) {
      if ((sudoku[floor(((storeX-100)/50))][floor(((storeY-100)/50))] != '.')&&i==true) {
        sudoku[floor(((storeX-100)/50))][floor(((storeY-100)/50))]=key;
      }
    }
  }
