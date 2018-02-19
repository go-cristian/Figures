package co.iyubinest.shapes;

enum Shapes {

  TRIANGLE,
  SQUARE,
  DIAMOND,;

  public static Shape create(Shapes shape) {
    switch (shape) {
      case SQUARE:
        return new Square();
      case TRIANGLE:
        return new Triangle();
      case DIAMOND:
        return new Diamond();
      default:
        throw new IllegalArgumentException("Invalid shape");
    }
  }
}
