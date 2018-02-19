package co.iyubinest.shapes;

interface Shape {

  interface ShapeModifier {
    boolean print(int line, int on);
  }

  String value();

  final class Builder {

    private int lines = 1;
    private Square.ShapeModifier modifier = new Empty();
    private int chars = 1;

    public Builder lines(int lines) {
      this.lines = lines;
      return this;
    }

    public Builder chars(int chars) {
      this.chars = chars;
      return this;
    }

    public Builder modifier(ShapeModifier modifier) {
      this.modifier = modifier;
      return this;
    }

    public String value() {
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < lines; i++) {
        for (int j = 0; j < chars; j++) {
          if (modifier.print(i, j)) {
            builder.append("*");
          } else {
            builder.append(" ");
          }
        }
        if (i != lines - 1) {
          builder.append("\\n");
        }
      }
      return builder.toString();
    }
  }

  final class Empty implements ShapeModifier {
    @Override public boolean print(int line, int on) {
      return false;
    }
  }
}
