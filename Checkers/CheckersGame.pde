final static int grid[][] = new int[8][8]; // 0 = light, 1 = dark

final color darkSquare = color(176, 147, 70);
final color lightSquare = color(112, 85, 13);
final color whitePiece = color(200, 200, 200);
final color blackPiece = color(0, 0, 0);
final color highlighting = color(69, 137, 255);

final int squareSize = 80;

class CheckersGame{
    
    
    voidsetup() {
        size(640, 640);
        background(255);
        draw();
    }
       void draw() {
            grid(); 
            //startPieces();
        }
            
       void grid() {
                //start of grid
                strokeWeight(1);
                for(int x = 0;x<8; x++) {
                    for (int y = 0; y < 8; y++) {
                        if (((x % 2 ==  0) && !(y % 2 ==  0)) || (!(x % 2 ==  0) && (y % 2 ==  0))) {
                           grid[x][y] = 1;
                        } 
                    }
                    }
                       for(int x = 0; x<= 8; x++) {
                           for(int y = 0; y <= 8; y++) {
                             if(y % 2 != 0 && x % 2 == 0 || y % 2 == 0 && x % 2 != 0) {
                                    fill(lightSquare);
                       } else {
                                        fill(darkSquare);
                                }
                                        rect(x * squareSize,y * squareSize,squareSize,squareSize);
                                    }
                                    } 
                                   for(int x = 0; x<8; x++) {
                                        for(int y = 0; y<8; y++) {
                                          if(grid[x][y] == 1 && (y<3 || y>4)) {
                                                if(y<3) {
                                                        fill(blackPiece);
                                                } else if (y > 4) {
                                                            fill(whitePiece);
                                                        }
                                                            int xTEMP = ((x + 1) * squareSize) - (squareSize / 2);
                                                            int yTEMP = ((y + 1) * squareSize) - (squareSize / 2);
                                                           circle(xTEMP ,yTEMP ,(squareSize / 2));
                                                         grid[x][y] = -1; // the space is occupied
                                                    }
                                                        }
                                                        }
                                                        }
                                                        }