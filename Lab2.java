public class Lab2
{
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    
    while (Robot.frontIsClear()) {
        Robot.move();
        if (Robot.onDark()) {
            Robot.makeLight();
        } else {
            Robot.turnLeft();
        }
    }
  }
  
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
    int counter = 0;
    
    while (counter <= 3) {
        turnRight();
        while (Robot.frontIsClear()) {
                Robot.makeDark();
                if (Robot.onDark()) {
                        Robot.move();
                }
            }
        turnAround();
        Robot.makeDark();
        while (Robot.frontIsClear()) {
                if (Robot.onDark()) {
                    Robot.move();
                }
            }
        turnRight();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        counter ++;
    }
        turnRight();
        while (Robot.frontIsClear()) {
            Robot.makeDark();
            if (Robot.onDark()) {
                Robot.move();
            }
        }
        turnAround();
        Robot.makeDark();
        while (Robot.frontIsClear()) {
            if (Robot.onDark()) {
                Robot.move();
            }
        }
  }
  
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    
    int counter = 0;
    int repeat = 0;
    
    while (repeat <= 2) {
        while (counter <= 6) {
            Robot.makeDark();
            Robot.move();  
             if (Robot.frontIsClear()) {
                 Robot.move();
                 counter ++;
            } else {
                turnRight();
                Robot.move();
                turnRight();
                counter++;
            }
        }
        if (counter > 6) {
                Robot.makeDark();
                Robot.move();
                Robot.turnLeft();
                
                Robot.move();
                Robot.turnLeft();
                repeat++;
                counter = 0;
            }
        while (repeat >= 3) {  
             while (counter <= 7) {
                 Robot.makeDark();
                 Robot.move();  
                 if (Robot.frontIsClear()) {
                 Robot.move();
                 counter ++;
                } else {
                turnRight();
                Robot.move();
                turnRight();
                counter++;
                }
            }
        }
    }
  }
  
  public static void turnRight()
  {
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.turnLeft();
    }
    
    public static void turnAround() 
    {
        Robot.turnLeft();
        Robot.turnLeft();
    }
  
}
