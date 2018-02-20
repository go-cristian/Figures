package co.iyubinest.shapes;

interface Shape {

  String value();

  interface ShapePrinter {
    boolean print(int line, int on);
  }

  final class Builder {

    private static final String STAR = "*";
    private static final String SPACE = " ";
    private ShapePrinter modifier = (line, on) -> false;
    private int lines = 1;
    private int chars = 1;

    Builder lines(int lines) {
      this.lines = lines;
      return this;
    }

    Builder chars(int chars) {
      this.chars = chars;
      return this;
    }

    Builder printer(ShapePrinter modifier) {
      this.modifier = modifier;
      return this;
    }

    String value() {
      StringBuilder builder = new StringBuilder();
      builder.append(allRows());
      return builder.toString();
    }

    private StringBuilder allRows() {
      StringBuilder builder = new StringBuilder();
      for (int row = 0; row < lines; row++) {
        builder.append(colsIn(row));
        if (notLastLine(row)) {
          builder.append(String.format("%n"));
        }
      }
      return builder;
    }

    private StringBuilder colsIn(int row) {
      StringBuilder builder = new StringBuilder();
      for (int col = 0; col < chars; col++) {
        builder.append(charFor(row, col));
      }
      return builder;
    }

    private String charFor(int row, int col) {
      return modifier.print(row, col) ? STAR : SPACE;
    }

    private boolean notLastLine(int i) {
      return i != lines - 1;
    }
  }
}
