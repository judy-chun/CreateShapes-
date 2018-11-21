public int maze(int width, int delta, int rounds)
{
  for (int i=0;i < rounds;i++){
    int totalDistance = 0;
    this.forward(width);
    this.turnRight();
    totalDistance+=width;
    width+=delta;
  }
  System.out.printlon(width);
  return totalDistance;
}