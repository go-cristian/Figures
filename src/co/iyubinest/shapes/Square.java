package co.iyubinest.shapes;

final class Square implements Shape {

  private static final int CHARS = 3;
  private static final int LINES = 3;

  public static Shape create() {
    return new Square();
  }

  private static boolean positionFrom(int line, int on) {
    return true;
  }

  @Override public String value() {
    return new Shape.Builder()
        .lines(LINES)
        .chars(CHARS)
        .printer(Square::positionFrom)
        .value();
  }
}
