public class Calculation implements Runnable {
    private double radius, side, area;
    private double phi = 3.14;
    public void setSquare(double side) throws IllegalArgumentException{
    if (side < 1) {
        throw new IllegalArgumentException("Nilai sisi tidak boleh kurang dari 1");
      }
      this.side = side;
      this.area = side * side;
    }
    public double getSquare() {
      return this.area;
    }
  
    public void setCircle(double radius) throws IllegalArgumentException {
      if (radius < 1) {
        throw new IllegalArgumentException("Nilai jari-jari tidak boleh kurang dari 1");
      }
      this.radius = radius;
      this.area = phi * radius * radius;
    }
    public double getCircle() {
      return this.area;
    }
  
    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
      if (a < 1 || b < 1 || t < 1) {
        throw new IllegalArgumentException("Nilai sisi atau tinggi tidak boleh kurang dari 1");
      }
      this.area = ((a + b) * t) / 2;
    }
    public double getTrapezoid() {
      return this.area;
    }
  
    @Override
    public void run() {
      System.out.print("Program will start in ");
      try {

        for (int i = 3; i > 0; i--) {
          System.out.print(i + " ");
          Thread.sleep(3000);
        }
      } catch (InterruptedException x) {
        System.out.println("Error: " + x.getMessage());
      }
      System.out.println("\nProgram started");
    }
}
