package co.iyubinest.shapes;

final class Diamond implements Shape {
  private static final int CHARS = 5;
  private static final int LINES = 5;

  public static Shape create() {
    return new Diamond();
  }

  private static boolean upperTriangle(int line, int on) {
    return line <= CHARS / 2 && on >= (CHARS / 2) - line && on <= CHARS - 1 - (CHARS / 2) + line;
  }

  private static boolean bottomTriangle(int line, int on) {
    return line > CHARS / 2 && on >= line / 2 && on <= CHARS - 1 - (line / 2);
  }

  private static boolean positionFor(int line, int on) {
    return line <= CHARS / 2 ? upperTriangle(line, on) : bottomTriangle(line, on);
  }

  @Override public String value() {
    return new Builder()
        .lines(LINES)
        .chars(CHARS)
        .printer(Diamond::positionFor)
        .value();
  }
}
