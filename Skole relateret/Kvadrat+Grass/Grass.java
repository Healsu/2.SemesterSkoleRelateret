public class Grass {

    private double grassHeight;
    private double grassMax;

    public Grass(double grassHeight, double grassMax) {
        this.grassHeight = grassHeight;
        this.grassMax = grassMax;
    }

    public void checkGrass(){
       int days = 0;
       double startingHeight = this.grassHeight;
        System.out.println("Starting grass height: "+grassHeight);
        System.out.println("The grass will increase by 0.8 every day. \n");

       while(grassMax > grassHeight){
           if(grassHeight > grassMax-1){
               System.out.println("The grass has reached near its max point and has been reset to its starting height.");
               System.out.println("Grass Height: "+grassHeight);
               grassHeight = startingHeight;
               break;
           }
           else {
               grassHeight += 0.8;
               days += 1;
               System.out.println("Current amount of days gone by: " + days);
               System.out.println("Current grass height: "+grassHeight);
           }

       }


    }



    public double getGrassHeight() {
        return grassHeight;
    }
    public void setGrassHeight(double grassHeight) {
        this.grassHeight = grassHeight;
    }
    public double getGrassMax() {
        return grassMax;
    }
    public void setGrassMax(double grassMax) {
        this.grassMax = grassMax;
    }
}
