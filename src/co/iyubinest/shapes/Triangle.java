package co.iyubinest.shapes;

final class Triangle implements Shape {

  private static final int CHARS = 5;
  private static final int LINES = 3;

  public static Shape create() {
    return new Triangle();
  }

  private static boolean positionFor(int line, int on) {
    return on >= (CHARS / 2) - line && on <= CHARS - 1 - (CHARS / 2) + line;
  }

  @Override public String value() {
    return new Shape.Builder()
        .chars(CHARS)
        .lines(LINES)
        .printer(Triangle::positionFor)
        .value();
  }
}
