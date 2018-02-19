package co.iyubinest.shapes;

final class Triangle implements Shape {

  private static final int CHARS = 5;
  private static final int LINES = 3;

  @Override public String value() {
    return new Shape.Builder()
        .chars(CHARS)
        .lines(LINES)
        .modifier(Triangle::positionFor)
        .value();
  }

  private static boolean positionFor(int line, int on) {
    return on >= (CHARS / 2) - line && on <= CHARS - 1 - (CHARS / 2) + line;
  }
}
