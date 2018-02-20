package co.iyubinest.shapes;

final class Diagonal implements Shape {

  private static final int CHARS = 5;
  private static final int LINES = 5;

  public static Shape create() {
    return new Diagonal();
  }

  @Override public String value() {
    return new Shape.Builder()
        .lines(LINES)
        .chars(CHARS)
        .printer((line, on) -> line == on)
        .value();
  }
}
