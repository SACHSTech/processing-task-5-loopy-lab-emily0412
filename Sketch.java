import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  public void setup() {
    background(45, 150, 207);
  }

  public void draw() {
	   
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX1 = 0;
    int intY1 = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX1 = 3 + (intRow * 10); //Instead of zero, calculate the proper intX location using 'intRow'
        intY1 = 300 + 3 + (intColumn * 10); //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX1, intY1, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    
    int intX2 = 300;
    int intY2 = 0;
    
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX2 = 3 + 300 + (intRow * 10); //Instead of zero, calculate the proper intX location using 'intRow'
        intY2 = 300 + 3 + (intColumn * 10); //Instead of zero, calculate the proper intY location using 'intColumn'

        if (intRow % 2 == 0) {
          fill(255);
          noStroke();
          rect(intX2, intY2, 5, 5);
        } else {
          fill(0);
          noStroke();
          rect(intX2, intY2, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){

    int intX3 = 0;
    int intY3 = 0;
    
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX3 = 3 + 300 + 300 + (intRow * 10); //Instead of zero, calculate the proper intX location using 'intRow'
        intY3 = 300 + 3 + (intColumn * 10); //Instead of zero, calculate the proper intY location using 'intColumn'

        if (intColumn % 2 == 0) {
          fill(0);
          noStroke();
          rect(intX3, intY3, 5, 5);
        } else {
          fill(255);
          noStroke();
          rect(intX3, intY3, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int intX4 = 0;
    int intY4 = 0;
    
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX4 = 3 + 300 + 300 + 300 + (intRow * 10); 
        intY4 = 300 + 3 + (intColumn * 10); 

        if (intColumn % 2 == 0) {
          fill(0);
          noStroke();
          rect(intX4, intY4, 5, 5);
        } else if (intRow % 2 == 0 && intColumn % 2 != 0) {
          fill(255);
          noStroke();
          rect(intX4, intY4, 5, 5);
        } else {
          fill(0);
          noStroke();
          rect(intX4, intY4, 5, 5);
        }
      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int intX5 = 0;
    int intY5 = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = (30 - intRow); intColumn < 30; intColumn++){
        intX5 = 3 + (intRow * 10); 
        intY5 = 3 + (intColumn*10);

        fill(255);
        noStroke();
        rect(intX5, intY5, 5, 5);

      }
    }
  }

  public void draw_section6(){
    int intX6 = 0;
    int intY6 = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = intRow; intColumn < 30; intColumn++){
        intX6 = 3 + 300 + (intRow * 10); 
        intY6 = 3 + (intColumn*10); 

        fill(255);
        noStroke();
        rect(intX6, intY6, 5, 5);

      }
    }
  }

  public void draw_section7(){
    int intX7 = 0;
    int intY7 = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = (30 - intRow); intColumn > 0; intColumn--){ // (30-intRow controls rows)
        intX7 = 3 + 300 + 300 + (intRow * 10); 
        intY7 = 3 + (intColumn*10) - 10;

        fill(255);
        noStroke();
        rect(intX7, intY7, 5, 5);

      }
    }
  }
  
  public void draw_section8(){
    int intX8 = 0;
    int intY8 = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = intRow; intColumn < 30; intColumn++){
        intX8 = 3 + (intRow * 10); 
        intY8 = 3 + 300 + 300 + 300 + (intColumn*10); 

        fill(255);
        noStroke();
        rect(intY8, intX8, 5, 5);

      }
    }
  }
}