import java.util.Scanner;
import java.util.Stack;

public class theCube
{
public static void main (String[] args)
{
    Scanner keyboard = new Scanner(System.in);
    
    int menue = 0;
    
    String movement = "M";
    
    String holder1 = "a";
    String holder2 = "b";
    String holder3 = "c";
    String holder4 = "d";
    String holder5 = "e";
    String holder6 = "f";
    
    int Quit = 1;
    
    boolean theStackTesterB = true;
    int theStackTesterI = 0;
    String theStackSolver = "SOLVED";
    
    
     
// Declares and Creates the Values inside the Cubes
    String redSide[][]
            = { { "r","r","r" }, { "r","r","r" }, { "r","r","r" } };
    
    String orangeSide[][]
            = { { "o","o","o" }, { "o","o","o" }, { "o","o","o" } };
    
    String yellowSide[][]
            = { { "y","y","y" }, { "y","y","y" }, { "y","y","y" } };
    
    String greenSide[][]
            = { { "g","g","g" }, { "g","g","g" }, { "g","g","g" } };
    
    String blueSide[][]
            = { { "b","b","b" }, { "b","b","b" }, { "b","b","b" } };
    
    String whiteSide[][]
            = { { "w","w","w" }, { "w","w","w" }, { "w","w","w" } };
  
    // Creating my Stack for Auto Solving the Problem 
    Stack<String> stack = new Stack<String>();
    
   // System.out.println(stack.empty());
    
    
    /* This prints the Cube Master
        for (int i = 0; i < 1; i++) {
        
            for (int j = 0; j < 3; j++){
            
                for (int l = 0; l < 3; l++) {
                    System.out.print("   ");
                }
                System.out.print(" ");
                for (int l = 0; l < 3; l++) {
                    System.out.print("[" + whiteSide[l][j] + "]");
                    }
                System.out.print(" ");
                System.out.println("");
            }
            System.out.println("");
        
        
            for (int j = 0; j < 3; j++){
                
                for (int l = 0; l < 3; l++) {
                    System.out.print("[" + redSide[l][j] + "]");
                    }
                System.out.print(" ");
                
                for (int l = 0; l < 3; l++) {
                    System.out.print("[" + redSide[l][j] + "]");
                     }
                System.out.print(" ");
                
                for (int l = 0; l < 3; l++) {
                    System.out.print("[" + yellowSide[l][j] + "]");
                    }
                System.out.print(" ");
                
                for (int l = 0; l < 3; l++) {
                    System.out.print("[" + greenSide[l][j] + "]");
                    }
                System.out.print(" ");
                System.out.println("");
            }
            System.out.println();
        
            for (int j = 0; j < 3; j++){
            
                for (int l = 0; l < 3; l++) {
                    System.out.print("   ");
                }
                System.out.print(" ");
                for (int l = 0; l < 3; l++) {
                    System.out.print("[" + blueSide[l][j] + "]");
                    }
                System.out.print(" ");
                System.out.println("");
            }
            System.out.println("");
  }
    */
     
    // This is the game menue
    System.out.println("1. Play the Game");
    
    menue = keyboard.nextInt();
    
    switch (menue){
 
    case 1:
        System.out.println("Play With The Cube");
            while (Quit == 1){
                
    //prints the cube 
        for (int i = 0; i < 1; i++) {
        
            for (int j = 0; j < 3; j++){
            
                for (int l = 0; l < 3; l++) {
                    System.out.print("   ");
                }
                System.out.print(" ");
                for (int l = 0; l < 3; l++) {
                    System.out.print("[" + whiteSide[l][j] + "]");
                    }
                System.out.print(" ");
                System.out.println("");
            }
            System.out.println("");
        
        
            for (int j = 0; j < 3; j++){
                
                for (int l = 0; l < 3; l++) {
                    System.out.print("[" + greenSide[l][j] + "]");
                    }
                System.out.print(" ");
                
                for (int l = 0; l < 3; l++) {
                    System.out.print("[" + redSide[l][j] + "]");
                     }
                System.out.print(" ");
                
                for (int l = 0; l < 3; l++) {
                    System.out.print("[" + orangeSide[l][j] + "]");
                    }
                System.out.print(" ");
                
                for (int l = 0; l < 3; l++) {
                    System.out.print("[" + yellowSide[l][j] + "]");
                    }
                System.out.print(" ");
                System.out.println("");
            }
            System.out.println();
        
            for (int j = 0; j < 3; j++){
            
                for (int l = 0; l < 3; l++) {
                    System.out.print("   ");
                }
                System.out.print(" ");
                for (int l = 0; l < 3; l++) {
                    System.out.print("[" + blueSide[l][j] + "]");
                    }
                System.out.print(" ");
                System.out.println("");
            }
            System.out.println("");
  }
    
    
    //Asking For the Movements
    System.out.println("Select a Movement -- Enter ' to go the other way");
      
    System.out.println("U for Top Row Left");
    System.out.println("D for Bottom Row Left");
    System.out.println("R for Right Collumn Up");
    System.out.println("L for Left Collumn Up");
    System.out.println("F for Front Face Right");
    System.out.println("B for Back Face Right");
    System.out.println("S for Solve the Cube");
    System.out.println("Q to Quit the Program");
    
    movement = keyboard.nextLine();
    
    stack.push(movement);           
                
    switch (movement){
        case "u":
        case "U":
        case "u'":
        case "U'":
            
            if (movement.equals("u'") || movement.equals("U'") ){
                
                for (int i = 0; i < 3; i++) {
                    
                    //Does the rim
                    //Collects the Cells from the Red Face Top Row
                    holder1 = redSide[0][0];
                    holder2 = redSide[1][0];
                    holder3 = redSide[2][0];
            
                    // Collects the Cells from the Green Face Top Row
                    holder4 = greenSide[0][0];
                    holder5 = greenSide[1][0];
                    holder6 = greenSide[2][0];
            
                    // Replaces the cells from the Red face to the Green Face
                    greenSide[0][0] = holder1;
                    greenSide[1][0] = holder2;
                    greenSide[2][0] = holder3;
            
                    //Collects the Cells from the Yellow Face Top Row
                    holder1 = yellowSide[0][0];
                    holder2 = yellowSide[1][0];
                    holder3 = yellowSide[2][0];
            
                    // Replaces the Cells from the Green Face to the Yellow Face
                    yellowSide[0][0] = holder4;
                    yellowSide[1][0] = holder5;
                    yellowSide[2][0] = holder6;
            
                    //Collects the Cells from the Organce Face Top Row 
                    holder4 = orangeSide[0][0];
                    holder5 = orangeSide[1][0];
                    holder6 = orangeSide[2][0];
            
                    // Replaces the Cells from the Yellow Face to the Orange Face
                    orangeSide[0][0] = holder1;
                    orangeSide[1][0] = holder2;
                    orangeSide[2][0] = holder3;
            
                    // Replaces the Cells from the Orange Face to the Red Face
                    redSide[0][0] =holder4;
                    redSide[1][0] =holder5;
                    redSide[2][0] =holder6;
                    
                    
                    
                    // moves the inside of the white face around 
                    //Collects the values of the top row white face
                    holder1 = whiteSide[0][0];
                    holder2 = whiteSide[1][0];
                    holder3 = whiteSide[2][0];
            
                    //Collects the values of the right collumn yellow face
                    holder4 = whiteSide[2][0];
                    holder5 = whiteSide[2][1];
                    holder6 = whiteSide[2][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    whiteSide[2][0] = holder1;
                    whiteSide[2][1] = holder2;
            
                    //Collects the values of the bottom row of the yellow face
                    holder1 = whiteSide[0][2];
                    holder2 = whiteSide[1][2];
                    holder3 = whiteSide[2][2];
            
                    //Replaces the values of the bottom row with the values of the right collumn
                    whiteSide[0][2] = holder6;
                    whiteSide[1][2] = holder5;
                    whiteSide[2][2] = holder4;
            
                    //Collects the values of the left collumn 
                    holder4 = whiteSide[0][0];
                    holder5 = whiteSide[0][1];
                    holder6 = whiteSide[0][2];
            
                    //Replaces the values of the left collumn with the values of the bottom row 
                    whiteSide[0][0] = holder1;
                    whiteSide[0][1] = holder2;
                    whiteSide[0][2] = holder3;
            
                    //Replaces the values of the top row with the values in the left collumn
                    whiteSide[1][0] = holder5;
                    whiteSide[2][0] = holder4;
                    
                    }
                
            }
            else {
                    //Collects the Cells from the Red Face Top Row
                    holder1 = redSide[0][0];
                    holder2 = redSide[1][0];
                    holder3 = redSide[2][0];
            
                    // Collects the Cells from the Green Face Top Row
                    holder4 = greenSide[0][0];
                    holder5 = greenSide[1][0];
                    holder6 = greenSide[2][0];
            
                    // Replaces the cells from the Red face to the Green Face
                    greenSide[0][0] = holder1;
                    greenSide[1][0] = holder2;
                    greenSide[2][0] = holder3;
            
                    //Collects the Cells from the Yellow Face Top Row
                    holder1 = yellowSide[0][0];
                    holder2 = yellowSide[1][0];
                    holder3 = yellowSide[2][0];
            
                    // Replaces the Cells from the Green Face to the Yellow Face
                    yellowSide[0][0] = holder4;
                    yellowSide[1][0] = holder5;
                    yellowSide[2][0] = holder6;
            
                    //Collects the Cells from the Organce Face Top Row 
                    holder4 = orangeSide[0][0];
                    holder5 = orangeSide[1][0];
                    holder6 = orangeSide[2][0];
            
                    // Replaces the Cells from the Yellow Face to the Orange Face
                    orangeSide[0][0] = holder1;
                    orangeSide[1][0] = holder2;
                    orangeSide[2][0] = holder3;
            
                    // Replaces the Cells from the Orange Face to the Red Face
                    redSide[0][0] =holder4;
                    redSide[1][0] =holder5;
                    redSide[2][0] =holder6;
                
                    // moves the inside of the white face around 
                    //Collects the values of the top row white face
                    holder1 = whiteSide[0][0];
                    holder2 = whiteSide[1][0];
                    holder3 = whiteSide[2][0];
            
                    //Collects the values of the right collumn yellow face
                    holder4 = whiteSide[2][0];
                    holder5 = whiteSide[2][1];
                    holder6 = whiteSide[2][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    whiteSide[2][0] = holder1;
                    whiteSide[2][1] = holder2;
            
                    //Collects the values of the bottom row of the yellow face
                    holder1 = whiteSide[0][2];
                    holder2 = whiteSide[1][2];
                    holder3 = whiteSide[2][2];
            
                    //Replaces the values of the bottom row with the values of the right collumn
                    whiteSide[0][2] = holder6;
                    whiteSide[1][2] = holder5;
                    whiteSide[2][2] = holder4;
            
                    //Collects the values of the left collumn 
                    holder4 = whiteSide[0][0];
                    holder5 = whiteSide[0][1];
                    holder6 = whiteSide[0][2];
            
                    //Replaces the values of the left collumn with the values of the bottom row 
                    whiteSide[0][0] = holder1;
                    whiteSide[0][1] = holder2;
                    whiteSide[0][2] = holder3;
            
                    //Replaces the values of the top row with the values in the left collumn
                    whiteSide[1][0] = holder5;
                    whiteSide[2][0] = holder4;
            }
            break;
            
        case "d":
        case "D":
        case "d'":
        case "D'":
           
            
            if (movement.equals("d'") || movement.equals("D'") ){

                for (int i = 0; i < 3; i++) {
                    
                    //Collects the Cells from the Red Face Bottom Row
            holder1 = redSide[0][2];
            holder2 = redSide[1][2];
            holder3 = redSide[2][2];
            
            // Collects the Cells from the Green Face Bottom Row
            holder4 = greenSide[0][2];
            holder5 = greenSide[1][2];
            holder6 = greenSide[2][2];
            
            // Replaces the cells from the Red face to the Green Face
            greenSide[0][2] = holder1;
            greenSide[1][2] = holder2;
            greenSide[2][2] = holder3;
            
            //Collects the Cells from the Yellow Face Bottom Row
            holder1 = yellowSide[0][2];
            holder2 = yellowSide[1][2];
            holder3 = yellowSide[2][2];
            
            // Replaces the Cells from the Green Face to the Yellow Face
            yellowSide[0][2] = holder4;
            yellowSide[1][2] = holder5;
            yellowSide[2][2] = holder6;
            
            //Collects the Cells from the Organce Face Bottom Row 
            holder4 = orangeSide[0][2];
            holder5 = orangeSide[1][2];
            holder6 = orangeSide[2][2];
            
            // Replaces the Cells from the Yellow Face to the Orange Face
            orangeSide[0][2] = holder1;
            orangeSide[1][2] = holder2;
            orangeSide[2][2] = holder3;
            
            // Replaces the Cells from the Orange Face to the Red Face
            redSide[0][2] =holder4;
            redSide[1][2] =holder5;
            redSide[2][2] =holder6;
                    
            // moves the inside of the blue face around 
            //Collects the values of the top row blue face
                    holder1 = blueSide[0][0];
                    holder2 = blueSide[1][0];
                    holder3 = blueSide[2][0];
            
                    //Collects the values of the right collumn blue face
                    holder4 = blueSide[0][0];
                    holder5 = blueSide[0][1];
                    holder6 = blueSide[0][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    blueSide[0][0] = holder3;
                    blueSide[0][1] = holder2;
                    blueSide[0][2] = holder1;
            
                    //Collects the values of the bottom row of the blue face
                    holder1 = blueSide[2][1];
                    holder2 = blueSide[1][2];
                    holder3 = blueSide[2][2];
                
                    //Replaces the values of the bottom row with the values of the right collumn
                    blueSide[1][2] = holder5;
                    blueSide[2][2] = holder6;
                
                   
                    blueSide[2][1] = holder2;
                    blueSide[2][0] = holder3;
                    blueSide[1][0] = holder1;
                    
                }
            }
            else {
                
                //Collects the Cells from the Red Face Bottom Row
            holder1 = redSide[0][2];
            holder2 = redSide[1][2];
            holder3 = redSide[2][2];
            
            // Collects the Cells from the Green Face Bottom Row
            holder4 = greenSide[0][2];
            holder5 = greenSide[1][2];
            holder6 = greenSide[2][2];
            
            // Replaces the cells from the Red face to the Green Face
            greenSide[0][2] = holder1;
            greenSide[1][2] = holder2;
            greenSide[2][2] = holder3;
            
            //Collects the Cells from the Yellow Face Bottom Row
            holder1 = yellowSide[0][2];
            holder2 = yellowSide[1][2];
            holder3 = yellowSide[2][2];
            
            // Replaces the Cells from the Green Face to the Yellow Face
            yellowSide[0][2] = holder4;
            yellowSide[1][2] = holder5;
            yellowSide[2][2] = holder6;
            
            //Collects the Cells from the Organce Face Bottom Row 
            holder4 = orangeSide[0][2];
            holder5 = orangeSide[1][2];
            holder6 = orangeSide[2][2];
            
            // Replaces the Cells from the Yellow Face to the Orange Face
            orangeSide[0][2] = holder1;
            orangeSide[1][2] = holder2;
            orangeSide[2][2] = holder3;
            
            // Replaces the Cells from the Orange Face to the Red Face
            redSide[0][2] =holder4;
            redSide[1][2] =holder5;
            redSide[2][2] =holder6;
                
            // moves the inside of the blue face around 
            //Collects the values of the top row blue face
                    holder1 = blueSide[0][0];
                    holder2 = blueSide[1][0];
                    holder3 = blueSide[2][0];
            
                    //Collects the values of the right collumn blue face
                    holder4 = blueSide[0][0];
                    holder5 = blueSide[0][1];
                    holder6 = blueSide[0][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    blueSide[0][0] = holder3;
                    blueSide[0][1] = holder2;
                    blueSide[0][2] = holder1;
            
                    //Collects the values of the bottom row of the blue face
                    holder1 = blueSide[2][1];
                    holder2 = blueSide[1][2];
                    holder3 = blueSide[2][2];
                
                    //Replaces the values of the bottom row with the values of the right collumn
                    blueSide[1][2] = holder5;
                    blueSide[2][2] = holder6;
                
                   
                    blueSide[2][1] = holder2;
                    blueSide[2][0] = holder3;
                    blueSide[1][0] = holder1;
 
            }     
            break;
        case "r":
        case "R":
        case "r'":
        case "R'":
            
            
             if (movement.equals("r'") || movement.equals("R'") ){
                 
                 for (int i = 0; i < 3; i++) {
                 
                // Collects the Cells from the Right Side of the the Red Face
            holder1 = redSide[2][0];
            holder2 = redSide[2][1];
            holder3 = redSide[2][2];
            
            //Collects the Cells from the Right Side of the White Face
            holder4 = whiteSide[2][0];
            holder5 = whiteSide[2][1];
            holder6 = whiteSide[2][2];
            
            //Replaces the Cells from the red face to the white facce 
            whiteSide[2][0] = holder1;
            whiteSide[2][1] = holder2;
            whiteSide[2][2] = holder3;
            
            //Collects the Cells from the Right Side of the Green Face
            holder1 = greenSide[2][0];
            holder2 = greenSide[2][1];
            holder3 = greenSide[2][2];
            
            //Replaces the Cells from the white face to the Green Face
            greenSide[2][0] = holder4;
            greenSide[2][1] = holder5;
            greenSide[2][2] = holder6;
            
            //Collects the cells from the Right Side of the Blue Face
            holder4 = blueSide[2][0];
            holder5 = blueSide[2][1];
            holder6 = blueSide[2][2];
            
            // Replaces the Cells from the Green Face to the Blue Face
            blueSide[2][0] = holder1;
            blueSide[2][1] = holder2;
            blueSide[2][2] = holder3;
            
            // Replaces the Cells from the Blue Face to the Red Face
            redSide[2][0] = holder4;
            redSide[2][1] = holder5;
            redSide[2][2] = holder6;
                     
            // moves the inside of the white face around 
                    //Collects the values of the top row white face
                    holder1 = orangeSide[0][0];
                    holder2 = orangeSide[1][0];
                    holder3 = orangeSide[2][0];
            
                    //Collects the values of the right collumn yellow face
                    holder4 = orangeSide[2][0];
                    holder5 = orangeSide[2][1];
                    holder6 = orangeSide[2][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    orangeSide[2][0] = holder1;
                    orangeSide[2][1] = holder2;
            
                    //Collects the values of the bottom row of the yellow face
                    holder1 = orangeSide[0][2];
                    holder2 = orangeSide[1][2];
                    holder3 = orangeSide[2][2];
            
                    //Replaces the values of the bottom row with the values of the right collumn
                    orangeSide[0][2] = holder6;
                    orangeSide[1][2] = holder5;
                    orangeSide[2][2] = holder4;
            
                    //Collects the values of the left collumn 
                    holder4 = orangeSide[0][0];
                    holder5 = orangeSide[0][1];
                    holder6 = orangeSide[0][2];
            
                    //Replaces the values of the left collumn with the values of the bottom row 
                    orangeSide[0][0] = holder1;
                    orangeSide[0][1] = holder2;
                    orangeSide[0][2] = holder3;
            
                    //Replaces the values of the top row with the values in the left collumn
                    orangeSide[1][0] = holder5;
                    orangeSide[2][0] = holder4;    
                 
                 }

            }
            else {
                // Collects the Cells from the Right Side of the the Red Face
            holder1 = redSide[2][0];
            holder2 = redSide[2][1];
            holder3 = redSide[2][2];
            
            //Collects the Cells from the Right Side of the White Face
            holder4 = whiteSide[2][0];
            holder5 = whiteSide[2][1];
            holder6 = whiteSide[2][2];
            
            //Replaces the Cells from the red face to the white facce 
            whiteSide[2][0] = holder1;
            whiteSide[2][1] = holder2;
            whiteSide[2][2] = holder3;
            
            //Collects the Cells from the Right Side of the Green Face
            holder1 = greenSide[2][0];
            holder2 = greenSide[2][1];
            holder3 = greenSide[2][2];
            
            //Replaces the Cells from the white face to the Green Face
            greenSide[2][0] = holder4;
            greenSide[2][1] = holder5;
            greenSide[2][2] = holder6;
            
            //Collects the cells from the Right Side of the Blue Face
            holder4 = blueSide[2][0];
            holder5 = blueSide[2][1];
            holder6 = blueSide[2][2];
            
            // Replaces the Cells from the Green Face to the Blue Face
            blueSide[2][0] = holder1;
            blueSide[2][1] = holder2;
            blueSide[2][2] = holder3;
            
            // Replaces the Cells from the Blue Face to the Red Face
            redSide[2][0] = holder4;
            redSide[2][1] = holder5;
            redSide[2][2] = holder6;
                
                
            // moves the inside of the white face around 
                    //Collects the values of the top row white face
                    holder1 = orangeSide[0][0];
                    holder2 = orangeSide[1][0];
                    holder3 = orangeSide[2][0];
            
                    //Collects the values of the right collumn yellow face
                    holder4 = orangeSide[2][0];
                    holder5 = orangeSide[2][1];
                    holder6 = orangeSide[2][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    orangeSide[2][0] = holder1;
                    orangeSide[2][1] = holder2;
            
                    //Collects the values of the bottom row of the yellow face
                    holder1 = orangeSide[0][2];
                    holder2 = orangeSide[1][2];
                    holder3 = orangeSide[2][2];
            
                    //Replaces the values of the bottom row with the values of the right collumn
                    orangeSide[0][2] = holder6;
                    orangeSide[1][2] = holder5;
                    orangeSide[2][2] = holder4;
            
                    //Collects the values of the left collumn 
                    holder4 = orangeSide[0][0];
                    holder5 = orangeSide[0][1];
                    holder6 = orangeSide[0][2];
            
                    //Replaces the values of the left collumn with the values of the bottom row 
                    orangeSide[0][0] = holder1;
                    orangeSide[0][1] = holder2;
                    orangeSide[0][2] = holder3;
            
                    //Replaces the values of the top row with the values in the left collumn
                    orangeSide[1][0] = holder5;
                    orangeSide[2][0] = holder4;    
            
            }
            
              
            break;
        case "l":
        case "L":
        case "l'":
        case "L'":
            
            if (movement.equals("l'") || movement.equals("L'") ){
                
                for (int i = 0; i < 3; i++) {
                    
            // Collects the Cells from the Left Side of the the Red Face
            holder1 = redSide[0][0];
            holder2 = redSide[0][1];
            holder3 = redSide[0][2];
            
            //Collects the Cells from the Left Side of the White Face
            holder4 = whiteSide[0][0];
            holder5 = whiteSide[0][1];
            holder6 = whiteSide[0][2];
            
            //Replaces the Cells from the red face to the white facce 
            whiteSide[0][0] = holder1;
            whiteSide[0][1] = holder2;
            whiteSide[0][2] = holder3;
            
            //Collects the Cells from the Left Side of the Green Face
            holder1 = yellowSide[2][0];
            holder2 = yellowSide[2][1];
            holder3 = yellowSide[2][2];
            
            //Replaces the Cells from the white face to the Green Face
            yellowSide[2][0] = holder4;
            yellowSide[2][1] = holder5;
            yellowSide[2][2] = holder6;
            
            //Collects the cells from the Left Side of the Blue Face
            holder4 = blueSide[0][0];
            holder5 = blueSide[0][1];
            holder6 = blueSide[0][2];
            
            // Replaces the Cells from the Green Face to the Blue Face
            blueSide[0][0] = holder1;
            blueSide[0][1] = holder2;
            blueSide[0][2] = holder3;
            
            // Replaces the Cells from the Blue Face to the Red Face
            redSide[0][0] = holder4;
            redSide[0][1] = holder5;
            redSide[0][2] = holder6;
                
            
            // moves the inside of the blue face around 
            //Collects the values of the top row blue face
                    holder1 = greenSide[0][0];
                    holder2 = greenSide[1][0];
                    holder3 = greenSide[2][0];
            
                    //Collects the values of the right collumn blue face
                    holder4 = greenSide[0][0];
                    holder5 = greenSide[0][1];
                    holder6 = greenSide[0][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    greenSide[0][0] = holder3;
                    greenSide[0][1] = holder2;
                    greenSide[0][2] = holder1;
            
                    //Collects the values of the bottom row of the blue face
                    holder1 = greenSide[2][1];
                    holder2 = greenSide[1][2];
                    holder3 = greenSide[2][2];
                
                    //Replaces the values of the bottom row with the values of the right collumn
                    greenSide[1][2] = holder5;
                    greenSide[2][2] = holder6;
                
                   
                    greenSide[2][1] = holder2;
                    greenSide[2][0] = holder3;
                    greenSide[1][0] = holder1;  }

            }
            else {
                // Collects the Cells from the Left Side of the the Red Face
            holder1 = redSide[0][0];
            holder2 = redSide[0][1];
            holder3 = redSide[0][2];
            
            //Collects the Cells from the Left Side of the White Face
            holder4 = whiteSide[0][0];
            holder5 = whiteSide[0][1];
            holder6 = whiteSide[0][2];
            
            //Replaces the Cells from the red face to the white facce 
            whiteSide[0][0] = holder1;
            whiteSide[0][1] = holder2;
            whiteSide[0][2] = holder3;
            
            //Collects the Cells from the Left Side of the Green Face
            holder1 = yellowSide[2][0];
            holder2 = yellowSide[2][1];
            holder3 = yellowSide[2][2];
            
            //Replaces the Cells from the white face to the Green Face
            yellowSide[2][0] = holder4;
            yellowSide[2][1] = holder5;
            yellowSide[2][2] = holder6;
            
            //Collects the cells from the Left Side of the Blue Face
            holder4 = blueSide[0][0];
            holder5 = blueSide[0][1];
            holder6 = blueSide[0][2];
            
            // Replaces the Cells from the Green Face to the Blue Face
            blueSide[0][0] = holder1;
            blueSide[0][1] = holder2;
            blueSide[0][2] = holder3;
            
            // Replaces the Cells from the Blue Face to the Red Face
            redSide[0][0] = holder4;
            redSide[0][1] = holder5;
            redSide[0][2] = holder6;
                
            
            // moves the inside of the blue face around 
            //Collects the values of the top row blue face
                    holder1 = greenSide[0][0];
                    holder2 = greenSide[1][0];
                    holder3 = greenSide[2][0];
            
                    //Collects the values of the right collumn blue face
                    holder4 = greenSide[0][0];
                    holder5 = greenSide[0][1];
                    holder6 = greenSide[0][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    greenSide[0][0] = holder3;
                    greenSide[0][1] = holder2;
                    greenSide[0][2] = holder1;
            
                    //Collects the values of the bottom row of the blue face
                    holder1 = greenSide[2][1];
                    holder2 = greenSide[1][2];
                    holder3 = greenSide[2][2];
                
                    //Replaces the values of the bottom row with the values of the right collumn
                    greenSide[1][2] = holder5;
                    greenSide[2][2] = holder6;
                
                   
                    greenSide[2][1] = holder2;
                    greenSide[2][0] = holder3;
                    greenSide[1][0] = holder1; 
            }
            
        
            
            
            
            break;
        case "f":
        case "F":
        case "f'":
        case "F'":
            
            if (movement.equals("f'") || movement.equals("F'") ){

                for (int i = 0; i < 3; i++) {
                // This is going to move the rim of the face
            // Collects the rim of the white face 
            holder1 = whiteSide[0][2];
            holder2 = whiteSide[1][2];
            holder3 = whiteSide[2][2];
            
            // Collects the rim of the orange face
            holder4 = orangeSide[0][0];
            holder5 = orangeSide[0][1];
            holder6 = orangeSide[0][2];
            
            // Replaces the orange side with the values from the white side
            orangeSide[0][0] = holder1;
            orangeSide[0][1] = holder2;
            orangeSide[0][2] = holder3;
            
            // Collects the values from the blue side now 
            holder1 = blueSide[0][0];
            holder2 = blueSide[1][0];
            holder3 = blueSide[2][0];
            
            // Replaces the values of the blue side with the values from the orange side
            blueSide[0][0] = holder6;
            blueSide[1][0] = holder5;
            blueSide[2][0] = holder4;
            
            //Collects the values from the green side
            holder6 = greenSide[2][0];
            holder5 = greenSide[2][1];
            holder4 = greenSide[2][2];
            
            //Replaces the values of the green side with the values of the blue side 
            greenSide[2][0] = holder1;
            greenSide[2][1] = holder2;
            greenSide[2][2] = holder3;
            
            //Replaces the values of the white face with the values of the green face
            whiteSide[0][2] = holder4;
            whiteSide[1][2] = holder5;
            whiteSide[2][2] = holder6;
            
            
            
            // moves the inside of the red face around 
            //Collects the values of the top row red face
            holder1 = redSide[0][0];
            holder2 = redSide[1][0];
            holder3 = redSide[2][0];
            
            //Collects the values of the right collumn red face
            holder4 = redSide[2][0];
            holder5 = redSide[2][1];
            holder6 = redSide[2][2];
            
            //Replaces the values of the right collumn with the values of the top row
            redSide[2][0] = holder1;
            redSide[2][1] = holder2;
            
            //Collects the values of the bottom row of the red face
            holder1 = redSide[0][2];
            holder2 = redSide[1][2];
            holder3 = redSide[2][2];
            
            //Replaces the values of the bottom row with the values of the right collumn
            redSide[0][2] = holder6;
            redSide[1][2] = holder5;
            redSide[2][2] = holder4;
            
            //Collects the values of the left collumn 
            holder4 = redSide[0][0];
            holder5 = redSide[0][1];
            holder6 = redSide[0][2];
            
            //Replaces the values of the left collumn with the values of the bottom row 
            redSide[0][0] = holder1;
            redSide[0][1] = holder2;
            redSide[0][2] = holder3;
            
            //Replaces the values of the top row with the values in the left collumn
            redSide[1][0] = holder5;
            redSide[2][0] = holder4;
            }
                
            }
            else {
                // This is going to move the rim of the face
            // Collects the rim of the white face 
            holder1 = whiteSide[0][2];
            holder2 = whiteSide[1][2];
            holder3 = whiteSide[2][2];
            
            // Collects the rim of the orange face
            holder4 = orangeSide[0][0];
            holder5 = orangeSide[0][1];
            holder6 = orangeSide[0][2];
            
            // Replaces the orange side with the values from the white side
            orangeSide[0][0] = holder1;
            orangeSide[0][1] = holder2;
            orangeSide[0][2] = holder3;
            
            // Collects the values from the blue side now 
            holder1 = blueSide[0][0];
            holder2 = blueSide[1][0];
            holder3 = blueSide[2][0];
            
            // Replaces the values of the blue side with the values from the orange side
            blueSide[0][0] = holder6;
            blueSide[1][0] = holder5;
            blueSide[2][0] = holder4;
            
            //Collects the values from the green side
            holder6 = greenSide[2][0];
            holder5 = greenSide[2][1];
            holder4 = greenSide[2][2];
            
            //Replaces the values of the green side with the values of the blue side 
            greenSide[2][0] = holder1;
            greenSide[2][1] = holder2;
            greenSide[2][2] = holder3;
            
            //Replaces the values of the white face with the values of the green face
            whiteSide[0][2] = holder4;
            whiteSide[1][2] = holder5;
            whiteSide[2][2] = holder6;
            
            
            
            // moves the inside of the red face around 
            //Collects the values of the top row red face
            holder1 = redSide[0][0];
            holder2 = redSide[1][0];
            holder3 = redSide[2][0];
            
            //Collects the values of the right collumn red face
            holder4 = redSide[2][0];
            holder5 = redSide[2][1];
            holder6 = redSide[2][2];
            
            //Replaces the values of the right collumn with the values of the top row
            redSide[2][0] = holder1;
            redSide[2][1] = holder2;
            
            //Collects the values of the bottom row of the red face
            holder1 = redSide[0][2];
            holder2 = redSide[1][2];
            holder3 = redSide[2][2];
            
            //Replaces the values of the bottom row with the values of the right collumn
            redSide[0][2] = holder6;
            redSide[1][2] = holder5;
            redSide[2][2] = holder4;
            
            //Collects the values of the left collumn 
            holder4 = redSide[0][0];
            holder5 = redSide[0][1];
            holder6 = redSide[0][2];
            
            //Replaces the values of the left collumn with the values of the bottom row 
            redSide[0][0] = holder1;
            redSide[0][1] = holder2;
            redSide[0][2] = holder3;
            
            //Replaces the values of the top row with the values in the left collumn
            redSide[1][0] = holder5;
            redSide[2][0] = holder4;
            }
            
            
            
            
            break;
        case "b":
        case "B":
        case "b'":
        case "B'":
            
            if (movement.equals("b'") || movement.equals("B'") ){

                for (int i = 0; i < 3; i++) {
                                    //Does the rim
                    //Collects the Cells from the Red Face Top Row
                    holder1 = whiteSide[0][0];
                    holder2 = whiteSide[1][0];
                    holder3 = whiteSide[2][0];
            
                    // Collects the Cells from the Green Face Top Row
                    holder4 = orangeSide[2][0];
                    holder5 = orangeSide[2][1];
                    holder6 = orangeSide[2][2];
            
                    // Replaces the cells from the Red face to the Green Face
                    orangeSide[2][2] = holder1;
                    orangeSide[2][1] = holder2;
                    orangeSide[2][0] = holder3;
            
                    //Collects the Cells from the Yellow Face Top Row
                    holder1 = blueSide[0][2];
                    holder2 = blueSide[1][2];
                    holder3 = blueSide[2][2];
            
                    // Replaces the Cells from the Green Face to the Yellow Face
                    blueSide[0][2] = holder4;
                    blueSide[1][2] = holder5;
                    blueSide[2][2] = holder6;
            
                    //Collects the Cells from the Organce Face Top Row 
                    holder4 = greenSide[0][0];
                    holder5 = greenSide[0][1];
                    holder6 = greenSide[0][2];
            
                    // Replaces the Cells from the Yellow Face to the Orange Face
                    greenSide[0][0] = holder3;
                    greenSide[0][1] = holder2;
                    greenSide[0][2] = holder1;
            
                    // Replaces the Cells from the Orange Face to the Red Face
                    whiteSide[0][0] = holder4;
                    whiteSide[1][0] = holder5;
                    whiteSide[2][0] = holder6;

                    
                    // moves the inside of the white face around 
                    //Collects the values of the top row white face
                    holder1 = yellowSide[0][0];
                    holder2 = yellowSide[1][0];
                    holder3 = yellowSide[2][0];
            
                    //Collects the values of the right collumn yellow face
                    holder4 = yellowSide[0][0];
                    holder5 = yellowSide[0][1];
                    holder6 = yellowSide[0][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    yellowSide[0][0] = holder3;
                    yellowSide[0][1] = holder2;
                    yellowSide[0][2] = holder1;
            
                    //Collects the values of the bottom row of the yellow face
                    holder1 = yellowSide[0][2];
                    holder2 = yellowSide[1][2];
                    holder3 = yellowSide[2][2];
                      
                    //Replaces the values of the bottom row with the values of the right collumn
                    yellowSide[2][2] = holder6;
                    yellowSide[1][2] = holder5;
                    yellowSide[0][2] = holder4;
            
                    //Collects the values of the left collumn 
                    holder4 = yellowSide[2][0];
                    holder5 = yellowSide[2][1];
                
                
                    yellowSide[2][1] = holder2;
                    yellowSide[2][0] = holder3;
                    
                    yellowSide[0][0]= holder4;
                    yellowSide[1][0]= holder5;
                    
            }
                
            }
            else {
                                    //Does the rim
                    //Collects the Cells from the Red Face Top Row
                    holder1 = whiteSide[0][0];
                    holder2 = whiteSide[1][0];
                    holder3 = whiteSide[2][0];
            
                    // Collects the Cells from the Green Face Top Row
                    holder4 = orangeSide[2][0];
                    holder5 = orangeSide[2][1];
                    holder6 = orangeSide[2][2];
            
                    // Replaces the cells from the Red face to the Green Face
                    orangeSide[2][2] = holder1;
                    orangeSide[2][1] = holder2;
                    orangeSide[2][0] = holder3;
            
                    //Collects the Cells from the Yellow Face Top Row
                    holder1 = blueSide[0][2];
                    holder2 = blueSide[1][2];
                    holder3 = blueSide[2][2];
            
                    // Replaces the Cells from the Green Face to the Yellow Face
                    blueSide[0][2] = holder4;
                    blueSide[1][2] = holder5;
                    blueSide[2][2] = holder6;
            
                    //Collects the Cells from the Organce Face Top Row 
                    holder4 = greenSide[0][0];
                    holder5 = greenSide[0][1];
                    holder6 = greenSide[0][2];
            
                    // Replaces the Cells from the Yellow Face to the Orange Face
                    greenSide[0][0] = holder3;
                    greenSide[0][1] = holder2;
                    greenSide[0][2] = holder1;
            
                    // Replaces the Cells from the Orange Face to the Red Face
                    whiteSide[0][0] = holder4;
                    whiteSide[1][0] = holder5;
                    whiteSide[2][0] = holder6;

                    
                    // moves the inside of the white face around 
                    //Collects the values of the top row white face
                    holder1 = yellowSide[0][0];
                    holder2 = yellowSide[1][0];
                    holder3 = yellowSide[2][0];
            
                    //Collects the values of the right collumn yellow face
                    holder4 = yellowSide[0][0];
                    holder5 = yellowSide[0][1];
                    holder6 = yellowSide[0][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    yellowSide[0][0] = holder3;
                    yellowSide[0][1] = holder2;
                    yellowSide[0][2] = holder1;
            
                    //Collects the values of the bottom row of the yellow face
                    holder1 = yellowSide[0][2];
                    holder2 = yellowSide[1][2];
                    holder3 = yellowSide[2][2];
                      
                    //Replaces the values of the bottom row with the values of the right collumn
                    yellowSide[2][2] = holder6;
                    yellowSide[1][2] = holder5;
                    yellowSide[0][2] = holder4;
            
                    //Collects the values of the left collumn 
                    holder4 = yellowSide[2][0];
                    holder5 = yellowSide[2][1];
                
                
                    yellowSide[2][1] = holder2;
                    yellowSide[2][0] = holder3;
                    
                    yellowSide[0][0]= holder4;
                    yellowSide[1][0]= holder5;
                    
            }
            
            break;
        
        case "s":
        
            stack.pop();

        for (theStackTesterI = stack.size(); theStackTesterI > 1; theStackTesterI = theStackTesterI - 1) {

                theStackSolver = stack.pop();
                System.out.println("Your Last Move Was " + theStackSolver);
                
                
                switch (theStackSolver){
                        // solves for a regular input 
                    case "U":
                    case "u":{theStackSolver = "u'"; break;}
                    case "d":
                    case "D":{theStackSolver = "d'"; break;}
                    case "r":
                    case "R":{theStackSolver = "r'"; break;}
                    case "l":
                    case "L":{theStackSolver = "l'"; break;}
                    case "f":
                    case "F":{theStackSolver = "f'"; break;}
                    case "b":
                    case "B":{theStackSolver = "b'"; break;}
                        
                        // solves for a prime input
                    case "U'":
                    case "u'":{theStackSolver = "u"; break;}
                    case "d'":
                    case "D'":{theStackSolver = "d"; break;}
                    case "r'":
                    case "R'":{theStackSolver = "r"; break;}
                    case "l'":
                    case "L'":{theStackSolver = "l"; break;}
                    case "f'":
                    case "F'":{theStackSolver = "f"; break;}
                    case "b'":
                    case "B'":{theStackSolver = "b"; break;}  
                        
                    
                }
            
                switch (theStackSolver){
        case "u":
        case "U":
        case "u'":
        case "U'":
            
            if (theStackSolver.equals("u'") || theStackSolver.equals("U'") ){
                
                for (int i = 0; i < 3; i++) {
                    
                    //Does the rim
                    //Collects the Cells from the Red Face Top Row
                    holder1 = redSide[0][0];
                    holder2 = redSide[1][0];
                    holder3 = redSide[2][0];
            
                    // Collects the Cells from the Green Face Top Row
                    holder4 = greenSide[0][0];
                    holder5 = greenSide[1][0];
                    holder6 = greenSide[2][0];
            
                    // Replaces the cells from the Red face to the Green Face
                    greenSide[0][0] = holder1;
                    greenSide[1][0] = holder2;
                    greenSide[2][0] = holder3;
            
                    //Collects the Cells from the Yellow Face Top Row
                    holder1 = yellowSide[0][0];
                    holder2 = yellowSide[1][0];
                    holder3 = yellowSide[2][0];
            
                    // Replaces the Cells from the Green Face to the Yellow Face
                    yellowSide[0][0] = holder4;
                    yellowSide[1][0] = holder5;
                    yellowSide[2][0] = holder6;
            
                    //Collects the Cells from the Organce Face Top Row 
                    holder4 = orangeSide[0][0];
                    holder5 = orangeSide[1][0];
                    holder6 = orangeSide[2][0];
            
                    // Replaces the Cells from the Yellow Face to the Orange Face
                    orangeSide[0][0] = holder1;
                    orangeSide[1][0] = holder2;
                    orangeSide[2][0] = holder3;
            
                    // Replaces the Cells from the Orange Face to the Red Face
                    redSide[0][0] =holder4;
                    redSide[1][0] =holder5;
                    redSide[2][0] =holder6;
                    
                    
                    
                    // moves the inside of the white face around 
                    //Collects the values of the top row white face
                    holder1 = whiteSide[0][0];
                    holder2 = whiteSide[1][0];
                    holder3 = whiteSide[2][0];
            
                    //Collects the values of the right collumn yellow face
                    holder4 = whiteSide[2][0];
                    holder5 = whiteSide[2][1];
                    holder6 = whiteSide[2][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    whiteSide[2][0] = holder1;
                    whiteSide[2][1] = holder2;
            
                    //Collects the values of the bottom row of the yellow face
                    holder1 = whiteSide[0][2];
                    holder2 = whiteSide[1][2];
                    holder3 = whiteSide[2][2];
            
                    //Replaces the values of the bottom row with the values of the right collumn
                    whiteSide[0][2] = holder6;
                    whiteSide[1][2] = holder5;
                    whiteSide[2][2] = holder4;
            
                    //Collects the values of the left collumn 
                    holder4 = whiteSide[0][0];
                    holder5 = whiteSide[0][1];
                    holder6 = whiteSide[0][2];
            
                    //Replaces the values of the left collumn with the values of the bottom row 
                    whiteSide[0][0] = holder1;
                    whiteSide[0][1] = holder2;
                    whiteSide[0][2] = holder3;
            
                    //Replaces the values of the top row with the values in the left collumn
                    whiteSide[1][0] = holder5;
                    whiteSide[2][0] = holder4;
                    
                    }
                
            }
            else {
                    //Collects the Cells from the Red Face Top Row
                    holder1 = redSide[0][0];
                    holder2 = redSide[1][0];
                    holder3 = redSide[2][0];
            
                    // Collects the Cells from the Green Face Top Row
                    holder4 = greenSide[0][0];
                    holder5 = greenSide[1][0];
                    holder6 = greenSide[2][0];
            
                    // Replaces the cells from the Red face to the Green Face
                    greenSide[0][0] = holder1;
                    greenSide[1][0] = holder2;
                    greenSide[2][0] = holder3;
            
                    //Collects the Cells from the Yellow Face Top Row
                    holder1 = yellowSide[0][0];
                    holder2 = yellowSide[1][0];
                    holder3 = yellowSide[2][0];
            
                    // Replaces the Cells from the Green Face to the Yellow Face
                    yellowSide[0][0] = holder4;
                    yellowSide[1][0] = holder5;
                    yellowSide[2][0] = holder6;
            
                    //Collects the Cells from the Organce Face Top Row 
                    holder4 = orangeSide[0][0];
                    holder5 = orangeSide[1][0];
                    holder6 = orangeSide[2][0];
            
                    // Replaces the Cells from the Yellow Face to the Orange Face
                    orangeSide[0][0] = holder1;
                    orangeSide[1][0] = holder2;
                    orangeSide[2][0] = holder3;
            
                    // Replaces the Cells from the Orange Face to the Red Face
                    redSide[0][0] =holder4;
                    redSide[1][0] =holder5;
                    redSide[2][0] =holder6;
                
                    // moves the inside of the white face around 
                    //Collects the values of the top row white face
                    holder1 = whiteSide[0][0];
                    holder2 = whiteSide[1][0];
                    holder3 = whiteSide[2][0];
            
                    //Collects the values of the right collumn yellow face
                    holder4 = whiteSide[2][0];
                    holder5 = whiteSide[2][1];
                    holder6 = whiteSide[2][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    whiteSide[2][0] = holder1;
                    whiteSide[2][1] = holder2;
            
                    //Collects the values of the bottom row of the yellow face
                    holder1 = whiteSide[0][2];
                    holder2 = whiteSide[1][2];
                    holder3 = whiteSide[2][2];
            
                    //Replaces the values of the bottom row with the values of the right collumn
                    whiteSide[0][2] = holder6;
                    whiteSide[1][2] = holder5;
                    whiteSide[2][2] = holder4;
            
                    //Collects the values of the left collumn 
                    holder4 = whiteSide[0][0];
                    holder5 = whiteSide[0][1];
                    holder6 = whiteSide[0][2];
            
                    //Replaces the values of the left collumn with the values of the bottom row 
                    whiteSide[0][0] = holder1;
                    whiteSide[0][1] = holder2;
                    whiteSide[0][2] = holder3;
            
                    //Replaces the values of the top row with the values in the left collumn
                    whiteSide[1][0] = holder5;
                    whiteSide[2][0] = holder4;
            }
            break;
            
        case "d":
        case "D":
        case "d'":
        case "D'":
           
            
            if (theStackSolver.equals("d'") || theStackSolver.equals("D'") ){

                for (int i = 0; i < 3; i++) {
                    
                    //Collects the Cells from the Red Face Bottom Row
            holder1 = redSide[0][2];
            holder2 = redSide[1][2];
            holder3 = redSide[2][2];
            
            // Collects the Cells from the Green Face Bottom Row
            holder4 = greenSide[0][2];
            holder5 = greenSide[1][2];
            holder6 = greenSide[2][2];
            
            // Replaces the cells from the Red face to the Green Face
            greenSide[0][2] = holder1;
            greenSide[1][2] = holder2;
            greenSide[2][2] = holder3;
            
            //Collects the Cells from the Yellow Face Bottom Row
            holder1 = yellowSide[0][2];
            holder2 = yellowSide[1][2];
            holder3 = yellowSide[2][2];
            
            // Replaces the Cells from the Green Face to the Yellow Face
            yellowSide[0][2] = holder4;
            yellowSide[1][2] = holder5;
            yellowSide[2][2] = holder6;
            
            //Collects the Cells from the Organce Face Bottom Row 
            holder4 = orangeSide[0][2];
            holder5 = orangeSide[1][2];
            holder6 = orangeSide[2][2];
            
            // Replaces the Cells from the Yellow Face to the Orange Face
            orangeSide[0][2] = holder1;
            orangeSide[1][2] = holder2;
            orangeSide[2][2] = holder3;
            
            // Replaces the Cells from the Orange Face to the Red Face
            redSide[0][2] =holder4;
            redSide[1][2] =holder5;
            redSide[2][2] =holder6;
                    
            // moves the inside of the blue face around 
            //Collects the values of the top row blue face
                    holder1 = blueSide[0][0];
                    holder2 = blueSide[1][0];
                    holder3 = blueSide[2][0];
            
                    //Collects the values of the right collumn blue face
                    holder4 = blueSide[0][0];
                    holder5 = blueSide[0][1];
                    holder6 = blueSide[0][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    blueSide[0][0] = holder3;
                    blueSide[0][1] = holder2;
                    blueSide[0][2] = holder1;
            
                    //Collects the values of the bottom row of the blue face
                    holder1 = blueSide[2][1];
                    holder2 = blueSide[1][2];
                    holder3 = blueSide[2][2];
                
                    //Replaces the values of the bottom row with the values of the right collumn
                    blueSide[1][2] = holder5;
                    blueSide[2][2] = holder6;
                
                   
                    blueSide[2][1] = holder2;
                    blueSide[2][0] = holder3;
                    blueSide[1][0] = holder1;
                    
                }
            }
            else {
                
                //Collects the Cells from the Red Face Bottom Row
            holder1 = redSide[0][2];
            holder2 = redSide[1][2];
            holder3 = redSide[2][2];
            
            // Collects the Cells from the Green Face Bottom Row
            holder4 = greenSide[0][2];
            holder5 = greenSide[1][2];
            holder6 = greenSide[2][2];
            
            // Replaces the cells from the Red face to the Green Face
            greenSide[0][2] = holder1;
            greenSide[1][2] = holder2;
            greenSide[2][2] = holder3;
            
            //Collects the Cells from the Yellow Face Bottom Row
            holder1 = yellowSide[0][2];
            holder2 = yellowSide[1][2];
            holder3 = yellowSide[2][2];
            
            // Replaces the Cells from the Green Face to the Yellow Face
            yellowSide[0][2] = holder4;
            yellowSide[1][2] = holder5;
            yellowSide[2][2] = holder6;
            
            //Collects the Cells from the Organce Face Bottom Row 
            holder4 = orangeSide[0][2];
            holder5 = orangeSide[1][2];
            holder6 = orangeSide[2][2];
            
            // Replaces the Cells from the Yellow Face to the Orange Face
            orangeSide[0][2] = holder1;
            orangeSide[1][2] = holder2;
            orangeSide[2][2] = holder3;
            
            // Replaces the Cells from the Orange Face to the Red Face
            redSide[0][2] =holder4;
            redSide[1][2] =holder5;
            redSide[2][2] =holder6;
                
            // moves the inside of the blue face around 
            //Collects the values of the top row blue face
                    holder1 = blueSide[0][0];
                    holder2 = blueSide[1][0];
                    holder3 = blueSide[2][0];
            
                    //Collects the values of the right collumn blue face
                    holder4 = blueSide[0][0];
                    holder5 = blueSide[0][1];
                    holder6 = blueSide[0][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    blueSide[0][0] = holder3;
                    blueSide[0][1] = holder2;
                    blueSide[0][2] = holder1;
            
                    //Collects the values of the bottom row of the blue face
                    holder1 = blueSide[2][1];
                    holder2 = blueSide[1][2];
                    holder3 = blueSide[2][2];
                
                    //Replaces the values of the bottom row with the values of the right collumn
                    blueSide[1][2] = holder5;
                    blueSide[2][2] = holder6;
                
                   
                    blueSide[2][1] = holder2;
                    blueSide[2][0] = holder3;
                    blueSide[1][0] = holder1;
 
            }     
            break;
        case "r":
        case "R":
        case "r'":
        case "R'":
            
            
             if (theStackSolver.equals("r'") || theStackSolver.equals("R'") ){
                 
                 for (int i = 0; i < 3; i++) {
                 
                // Collects the Cells from the Right Side of the the Red Face
            holder1 = redSide[2][0];
            holder2 = redSide[2][1];
            holder3 = redSide[2][2];
            
            //Collects the Cells from the Right Side of the White Face
            holder4 = whiteSide[2][0];
            holder5 = whiteSide[2][1];
            holder6 = whiteSide[2][2];
            
            //Replaces the Cells from the red face to the white facce 
            whiteSide[2][0] = holder1;
            whiteSide[2][1] = holder2;
            whiteSide[2][2] = holder3;
            
            //Collects the Cells from the Right Side of the Green Face
            holder1 = greenSide[2][0];
            holder2 = greenSide[2][1];
            holder3 = greenSide[2][2];
            
            //Replaces the Cells from the white face to the Green Face
            greenSide[2][0] = holder4;
            greenSide[2][1] = holder5;
            greenSide[2][2] = holder6;
            
            //Collects the cells from the Right Side of the Blue Face
            holder4 = blueSide[2][0];
            holder5 = blueSide[2][1];
            holder6 = blueSide[2][2];
            
            // Replaces the Cells from the Green Face to the Blue Face
            blueSide[2][0] = holder1;
            blueSide[2][1] = holder2;
            blueSide[2][2] = holder3;
            
            // Replaces the Cells from the Blue Face to the Red Face
            redSide[2][0] = holder4;
            redSide[2][1] = holder5;
            redSide[2][2] = holder6;
                     
            // moves the inside of the white face around 
                    //Collects the values of the top row white face
                    holder1 = orangeSide[0][0];
                    holder2 = orangeSide[1][0];
                    holder3 = orangeSide[2][0];
            
                    //Collects the values of the right collumn yellow face
                    holder4 = orangeSide[2][0];
                    holder5 = orangeSide[2][1];
                    holder6 = orangeSide[2][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    orangeSide[2][0] = holder1;
                    orangeSide[2][1] = holder2;
            
                    //Collects the values of the bottom row of the yellow face
                    holder1 = orangeSide[0][2];
                    holder2 = orangeSide[1][2];
                    holder3 = orangeSide[2][2];
            
                    //Replaces the values of the bottom row with the values of the right collumn
                    orangeSide[0][2] = holder6;
                    orangeSide[1][2] = holder5;
                    orangeSide[2][2] = holder4;
            
                    //Collects the values of the left collumn 
                    holder4 = orangeSide[0][0];
                    holder5 = orangeSide[0][1];
                    holder6 = orangeSide[0][2];
            
                    //Replaces the values of the left collumn with the values of the bottom row 
                    orangeSide[0][0] = holder1;
                    orangeSide[0][1] = holder2;
                    orangeSide[0][2] = holder3;
            
                    //Replaces the values of the top row with the values in the left collumn
                    orangeSide[1][0] = holder5;
                    orangeSide[2][0] = holder4;    
                 
                 }

            }
            else {
                // Collects the Cells from the Right Side of the the Red Face
            holder1 = redSide[2][0];
            holder2 = redSide[2][1];
            holder3 = redSide[2][2];
            
            //Collects the Cells from the Right Side of the White Face
            holder4 = whiteSide[2][0];
            holder5 = whiteSide[2][1];
            holder6 = whiteSide[2][2];
            
            //Replaces the Cells from the red face to the white facce 
            whiteSide[2][0] = holder1;
            whiteSide[2][1] = holder2;
            whiteSide[2][2] = holder3;
            
            //Collects the Cells from the Right Side of the Green Face
            holder1 = greenSide[2][0];
            holder2 = greenSide[2][1];
            holder3 = greenSide[2][2];
            
            //Replaces the Cells from the white face to the Green Face
            greenSide[2][0] = holder4;
            greenSide[2][1] = holder5;
            greenSide[2][2] = holder6;
            
            //Collects the cells from the Right Side of the Blue Face
            holder4 = blueSide[2][0];
            holder5 = blueSide[2][1];
            holder6 = blueSide[2][2];
            
            // Replaces the Cells from the Green Face to the Blue Face
            blueSide[2][0] = holder1;
            blueSide[2][1] = holder2;
            blueSide[2][2] = holder3;
            
            // Replaces the Cells from the Blue Face to the Red Face
            redSide[2][0] = holder4;
            redSide[2][1] = holder5;
            redSide[2][2] = holder6;
                
                
            // moves the inside of the white face around 
                    //Collects the values of the top row white face
                    holder1 = orangeSide[0][0];
                    holder2 = orangeSide[1][0];
                    holder3 = orangeSide[2][0];
            
                    //Collects the values of the right collumn yellow face
                    holder4 = orangeSide[2][0];
                    holder5 = orangeSide[2][1];
                    holder6 = orangeSide[2][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    orangeSide[2][0] = holder1;
                    orangeSide[2][1] = holder2;
            
                    //Collects the values of the bottom row of the yellow face
                    holder1 = orangeSide[0][2];
                    holder2 = orangeSide[1][2];
                    holder3 = orangeSide[2][2];
            
                    //Replaces the values of the bottom row with the values of the right collumn
                    orangeSide[0][2] = holder6;
                    orangeSide[1][2] = holder5;
                    orangeSide[2][2] = holder4;
            
                    //Collects the values of the left collumn 
                    holder4 = orangeSide[0][0];
                    holder5 = orangeSide[0][1];
                    holder6 = orangeSide[0][2];
            
                    //Replaces the values of the left collumn with the values of the bottom row 
                    orangeSide[0][0] = holder1;
                    orangeSide[0][1] = holder2;
                    orangeSide[0][2] = holder3;
            
                    //Replaces the values of the top row with the values in the left collumn
                    orangeSide[1][0] = holder5;
                    orangeSide[2][0] = holder4;    
            
            }
            
              
            break;
        case "l":
        case "L":
        case "l'":
        case "L'":
            
            if (theStackSolver.equals("l'") || theStackSolver.equals("L'") ){
                
                for (int i = 0; i < 3; i++) {
                    
            // Collects the Cells from the Left Side of the the Red Face
            holder1 = redSide[0][0];
            holder2 = redSide[0][1];
            holder3 = redSide[0][2];
            
            //Collects the Cells from the Left Side of the White Face
            holder4 = whiteSide[0][0];
            holder5 = whiteSide[0][1];
            holder6 = whiteSide[0][2];
            
            //Replaces the Cells from the red face to the white facce 
            whiteSide[0][0] = holder1;
            whiteSide[0][1] = holder2;
            whiteSide[0][2] = holder3;
            
            //Collects the Cells from the Left Side of the Green Face
            holder1 = yellowSide[2][0];
            holder2 = yellowSide[2][1];
            holder3 = yellowSide[2][2];
            
            //Replaces the Cells from the white face to the Green Face
            yellowSide[2][0] = holder4;
            yellowSide[2][1] = holder5;
            yellowSide[2][2] = holder6;
            
            //Collects the cells from the Left Side of the Blue Face
            holder4 = blueSide[0][0];
            holder5 = blueSide[0][1];
            holder6 = blueSide[0][2];
            
            // Replaces the Cells from the Green Face to the Blue Face
            blueSide[0][0] = holder1;
            blueSide[0][1] = holder2;
            blueSide[0][2] = holder3;
            
            // Replaces the Cells from the Blue Face to the Red Face
            redSide[0][0] = holder4;
            redSide[0][1] = holder5;
            redSide[0][2] = holder6;
                
            
            // moves the inside of the blue face around 
            //Collects the values of the top row blue face
                    holder1 = greenSide[0][0];
                    holder2 = greenSide[1][0];
                    holder3 = greenSide[2][0];
            
                    //Collects the values of the right collumn blue face
                    holder4 = greenSide[0][0];
                    holder5 = greenSide[0][1];
                    holder6 = greenSide[0][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    greenSide[0][0] = holder3;
                    greenSide[0][1] = holder2;
                    greenSide[0][2] = holder1;
            
                    //Collects the values of the bottom row of the blue face
                    holder1 = greenSide[2][1];
                    holder2 = greenSide[1][2];
                    holder3 = greenSide[2][2];
                
                    //Replaces the values of the bottom row with the values of the right collumn
                    greenSide[1][2] = holder5;
                    greenSide[2][2] = holder6;
                
                   
                    greenSide[2][1] = holder2;
                    greenSide[2][0] = holder3;
                    greenSide[1][0] = holder1;  }

            }
            else {
                // Collects the Cells from the Left Side of the the Red Face
            holder1 = redSide[0][0];
            holder2 = redSide[0][1];
            holder3 = redSide[0][2];
            
            //Collects the Cells from the Left Side of the White Face
            holder4 = whiteSide[0][0];
            holder5 = whiteSide[0][1];
            holder6 = whiteSide[0][2];
            
            //Replaces the Cells from the red face to the white facce 
            whiteSide[0][0] = holder1;
            whiteSide[0][1] = holder2;
            whiteSide[0][2] = holder3;
            
            //Collects the Cells from the Left Side of the Green Face
            holder1 = yellowSide[2][0];
            holder2 = yellowSide[2][1];
            holder3 = yellowSide[2][2];
            
            //Replaces the Cells from the white face to the Green Face
            yellowSide[2][0] = holder4;
            yellowSide[2][1] = holder5;
            yellowSide[2][2] = holder6;
            
            //Collects the cells from the Left Side of the Blue Face
            holder4 = blueSide[0][0];
            holder5 = blueSide[0][1];
            holder6 = blueSide[0][2];
            
            // Replaces the Cells from the Green Face to the Blue Face
            blueSide[0][0] = holder1;
            blueSide[0][1] = holder2;
            blueSide[0][2] = holder3;
            
            // Replaces the Cells from the Blue Face to the Red Face
            redSide[0][0] = holder4;
            redSide[0][1] = holder5;
            redSide[0][2] = holder6;
                
            
            // moves the inside of the blue face around 
            //Collects the values of the top row blue face
                    holder1 = greenSide[0][0];
                    holder2 = greenSide[1][0];
                    holder3 = greenSide[2][0];
            
                    //Collects the values of the right collumn blue face
                    holder4 = greenSide[0][0];
                    holder5 = greenSide[0][1];
                    holder6 = greenSide[0][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    greenSide[0][0] = holder3;
                    greenSide[0][1] = holder2;
                    greenSide[0][2] = holder1;
            
                    //Collects the values of the bottom row of the blue face
                    holder1 = greenSide[2][1];
                    holder2 = greenSide[1][2];
                    holder3 = greenSide[2][2];
                
                    //Replaces the values of the bottom row with the values of the right collumn
                    greenSide[1][2] = holder5;
                    greenSide[2][2] = holder6;
                
                   
                    greenSide[2][1] = holder2;
                    greenSide[2][0] = holder3;
                    greenSide[1][0] = holder1; 
            }
            
        
            
            
            
            break;
        case "f":
        case "F":
        case "f'":
        case "F'":
            
            if (theStackSolver.equals("f'") || theStackSolver.equals("F'") ){

                for (int i = 0; i < 3; i++) {
                // This is going to move the rim of the face
            // Collects the rim of the white face 
            holder1 = whiteSide[0][2];
            holder2 = whiteSide[1][2];
            holder3 = whiteSide[2][2];
            
            // Collects the rim of the orange face
            holder4 = orangeSide[0][0];
            holder5 = orangeSide[0][1];
            holder6 = orangeSide[0][2];
            
            // Replaces the orange side with the values from the white side
            orangeSide[0][0] = holder1;
            orangeSide[0][1] = holder2;
            orangeSide[0][2] = holder3;
            
            // Collects the values from the blue side now 
            holder1 = blueSide[0][0];
            holder2 = blueSide[1][0];
            holder3 = blueSide[2][0];
            
            // Replaces the values of the blue side with the values from the orange side
            blueSide[0][0] = holder6;
            blueSide[1][0] = holder5;
            blueSide[2][0] = holder4;
            
            //Collects the values from the green side
            holder6 = greenSide[2][0];
            holder5 = greenSide[2][1];
            holder4 = greenSide[2][2];
            
            //Replaces the values of the green side with the values of the blue side 
            greenSide[2][0] = holder1;
            greenSide[2][1] = holder2;
            greenSide[2][2] = holder3;
            
            //Replaces the values of the white face with the values of the green face
            whiteSide[0][2] = holder4;
            whiteSide[1][2] = holder5;
            whiteSide[2][2] = holder6;
            
            
            
            // moves the inside of the red face around 
            //Collects the values of the top row red face
            holder1 = redSide[0][0];
            holder2 = redSide[1][0];
            holder3 = redSide[2][0];
            
            //Collects the values of the right collumn red face
            holder4 = redSide[2][0];
            holder5 = redSide[2][1];
            holder6 = redSide[2][2];
            
            //Replaces the values of the right collumn with the values of the top row
            redSide[2][0] = holder1;
            redSide[2][1] = holder2;
            
            //Collects the values of the bottom row of the red face
            holder1 = redSide[0][2];
            holder2 = redSide[1][2];
            holder3 = redSide[2][2];
            
            //Replaces the values of the bottom row with the values of the right collumn
            redSide[0][2] = holder6;
            redSide[1][2] = holder5;
            redSide[2][2] = holder4;
            
            //Collects the values of the left collumn 
            holder4 = redSide[0][0];
            holder5 = redSide[0][1];
            holder6 = redSide[0][2];
            
            //Replaces the values of the left collumn with the values of the bottom row 
            redSide[0][0] = holder1;
            redSide[0][1] = holder2;
            redSide[0][2] = holder3;
            
            //Replaces the values of the top row with the values in the left collumn
            redSide[1][0] = holder5;
            redSide[2][0] = holder4;
            }
                
            }
            else {
                // This is going to move the rim of the face
            // Collects the rim of the white face 
            holder1 = whiteSide[0][2];
            holder2 = whiteSide[1][2];
            holder3 = whiteSide[2][2];
            
            // Collects the rim of the orange face
            holder4 = orangeSide[0][0];
            holder5 = orangeSide[0][1];
            holder6 = orangeSide[0][2];
            
            // Replaces the orange side with the values from the white side
            orangeSide[0][0] = holder1;
            orangeSide[0][1] = holder2;
            orangeSide[0][2] = holder3;
            
            // Collects the values from the blue side now 
            holder1 = blueSide[0][0];
            holder2 = blueSide[1][0];
            holder3 = blueSide[2][0];
            
            // Replaces the values of the blue side with the values from the orange side
            blueSide[0][0] = holder6;
            blueSide[1][0] = holder5;
            blueSide[2][0] = holder4;
            
            //Collects the values from the green side
            holder6 = greenSide[2][0];
            holder5 = greenSide[2][1];
            holder4 = greenSide[2][2];
            
            //Replaces the values of the green side with the values of the blue side 
            greenSide[2][0] = holder1;
            greenSide[2][1] = holder2;
            greenSide[2][2] = holder3;
            
            //Replaces the values of the white face with the values of the green face
            whiteSide[0][2] = holder4;
            whiteSide[1][2] = holder5;
            whiteSide[2][2] = holder6;
            
            
            
            // moves the inside of the red face around 
            //Collects the values of the top row red face
            holder1 = redSide[0][0];
            holder2 = redSide[1][0];
            holder3 = redSide[2][0];
            
            //Collects the values of the right collumn red face
            holder4 = redSide[2][0];
            holder5 = redSide[2][1];
            holder6 = redSide[2][2];
            
            //Replaces the values of the right collumn with the values of the top row
            redSide[2][0] = holder1;
            redSide[2][1] = holder2;
            
            //Collects the values of the bottom row of the red face
            holder1 = redSide[0][2];
            holder2 = redSide[1][2];
            holder3 = redSide[2][2];
            
            //Replaces the values of the bottom row with the values of the right collumn
            redSide[0][2] = holder6;
            redSide[1][2] = holder5;
            redSide[2][2] = holder4;
            
            //Collects the values of the left collumn 
            holder4 = redSide[0][0];
            holder5 = redSide[0][1];
            holder6 = redSide[0][2];
            
            //Replaces the values of the left collumn with the values of the bottom row 
            redSide[0][0] = holder1;
            redSide[0][1] = holder2;
            redSide[0][2] = holder3;
            
            //Replaces the values of the top row with the values in the left collumn
            redSide[1][0] = holder5;
            redSide[2][0] = holder4;
            }
            
            
            
            
            break;
        case "b":
        case "B":
        case "b'":
        case "B'":
            
            if (theStackSolver.equals("b'") || theStackSolver.equals("B'") ){

                for (int i = 0; i < 3; i++) {
                                    //Does the rim
                    //Collects the Cells from the Red Face Top Row
                    holder1 = whiteSide[0][0];
                    holder2 = whiteSide[1][0];
                    holder3 = whiteSide[2][0];
            
                    // Collects the Cells from the Green Face Top Row
                    holder4 = orangeSide[2][0];
                    holder5 = orangeSide[2][1];
                    holder6 = orangeSide[2][2];
            
                    // Replaces the cells from the Red face to the Green Face
                    orangeSide[2][2] = holder1;
                    orangeSide[2][1] = holder2;
                    orangeSide[2][0] = holder3;
            
                    //Collects the Cells from the Yellow Face Top Row
                    holder1 = blueSide[0][2];
                    holder2 = blueSide[1][2];
                    holder3 = blueSide[2][2];
            
                    // Replaces the Cells from the Green Face to the Yellow Face
                    blueSide[0][2] = holder4;
                    blueSide[1][2] = holder5;
                    blueSide[2][2] = holder6;
            
                    //Collects the Cells from the Organce Face Top Row 
                    holder4 = greenSide[0][0];
                    holder5 = greenSide[0][1];
                    holder6 = greenSide[0][2];
            
                    // Replaces the Cells from the Yellow Face to the Orange Face
                    greenSide[0][0] = holder3;
                    greenSide[0][1] = holder2;
                    greenSide[0][2] = holder1;
            
                    // Replaces the Cells from the Orange Face to the Red Face
                    whiteSide[0][0] = holder4;
                    whiteSide[1][0] = holder5;
                    whiteSide[2][0] = holder6;

                    
                    // moves the inside of the white face around 
                    //Collects the values of the top row white face
                    holder1 = yellowSide[0][0];
                    holder2 = yellowSide[1][0];
                    holder3 = yellowSide[2][0];
            
                    //Collects the values of the right collumn yellow face
                    holder4 = yellowSide[0][0];
                    holder5 = yellowSide[0][1];
                    holder6 = yellowSide[0][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    yellowSide[0][0] = holder3;
                    yellowSide[0][1] = holder2;
                    yellowSide[0][2] = holder1;
            
                    //Collects the values of the bottom row of the yellow face
                    holder1 = yellowSide[0][2];
                    holder2 = yellowSide[1][2];
                    holder3 = yellowSide[2][2];
                      
                    //Replaces the values of the bottom row with the values of the right collumn
                    yellowSide[2][2] = holder6;
                    yellowSide[1][2] = holder5;
                    yellowSide[0][2] = holder4;
            
                    //Collects the values of the left collumn 
                    holder4 = yellowSide[2][0];
                    holder5 = yellowSide[2][1];
                
                
                    yellowSide[2][1] = holder2;
                    yellowSide[2][0] = holder3;
                    
                    yellowSide[0][0]= holder4;
                    yellowSide[1][0]= holder5;
                    
            }
                
            }
            else {
                                    //Does the rim
                    //Collects the Cells from the Red Face Top Row
                    holder1 = whiteSide[0][0];
                    holder2 = whiteSide[1][0];
                    holder3 = whiteSide[2][0];
            
                    // Collects the Cells from the Green Face Top Row
                    holder4 = orangeSide[2][0];
                    holder5 = orangeSide[2][1];
                    holder6 = orangeSide[2][2];
            
                    // Replaces the cells from the Red face to the Green Face
                    orangeSide[2][2] = holder1;
                    orangeSide[2][1] = holder2;
                    orangeSide[2][0] = holder3;
            
                    //Collects the Cells from the Yellow Face Top Row
                    holder1 = blueSide[0][2];
                    holder2 = blueSide[1][2];
                    holder3 = blueSide[2][2];
            
                    // Replaces the Cells from the Green Face to the Yellow Face
                    blueSide[0][2] = holder4;
                    blueSide[1][2] = holder5;
                    blueSide[2][2] = holder6;
            
                    //Collects the Cells from the Organce Face Top Row 
                    holder4 = greenSide[0][0];
                    holder5 = greenSide[0][1];
                    holder6 = greenSide[0][2];
            
                    // Replaces the Cells from the Yellow Face to the Orange Face
                    greenSide[0][0] = holder3;
                    greenSide[0][1] = holder2;
                    greenSide[0][2] = holder1;
            
                    // Replaces the Cells from the Orange Face to the Red Face
                    whiteSide[0][0] = holder4;
                    whiteSide[1][0] = holder5;
                    whiteSide[2][0] = holder6;

                    
                    // moves the inside of the white face around 
                    //Collects the values of the top row white face
                    holder1 = yellowSide[0][0];
                    holder2 = yellowSide[1][0];
                    holder3 = yellowSide[2][0];
            
                    //Collects the values of the right collumn yellow face
                    holder4 = yellowSide[0][0];
                    holder5 = yellowSide[0][1];
                    holder6 = yellowSide[0][2];
            
                    //Replaces the values of the right collumn with the values of the top row
                    yellowSide[0][0] = holder3;
                    yellowSide[0][1] = holder2;
                    yellowSide[0][2] = holder1;
            
                    //Collects the values of the bottom row of the yellow face
                    holder1 = yellowSide[0][2];
                    holder2 = yellowSide[1][2];
                    holder3 = yellowSide[2][2];
                      
                    //Replaces the values of the bottom row with the values of the right collumn
                    yellowSide[2][2] = holder6;
                    yellowSide[1][2] = holder5;
                    yellowSide[0][2] = holder4;
            
                    //Collects the values of the left collumn 
                    holder4 = yellowSide[2][0];
                    holder5 = yellowSide[2][1];
                
                
                    yellowSide[2][1] = holder2;
                    yellowSide[2][0] = holder3;
                    
                    yellowSide[0][0]= holder4;
                    yellowSide[1][0]= holder5;
                    
            }
            
            break;
            
        } // while loop
                    
  
            }
            
            break;
            
        case "q":
        case "Q":
            Quit = Quit - 1;
            break;
    }
}
        break;
            
    default:
    System.out.println("Please Try Again");      
    }
    
}
    
   
}