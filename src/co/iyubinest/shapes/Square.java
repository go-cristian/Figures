package co.iyubinest.shapes;

final class Square implements Shape {

  private static final int CHARS = 3;
  private static final int LINES = 3;

  @Override public String value() {
    return new Shape.Builder()
        .lines(LINES)
        .chars(CHARS)
        .modifier(Square::positionFrom)
        .value();
  }

  private static boolean positionFrom(int line, int on) {
    return true;
  }
}
