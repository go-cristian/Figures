package co.iyubinest.shapes;

import org.junit.Assert;
import org.junit.Test;

import static co.iyubinest.shapes.Shapes.SQUARE;
import static org.hamcrest.CoreMatchers.is;

public class SquareShould {

  @Test
  public void be() {
    Assert.assertThat(
        Shapes.create(SQUARE).value(),
        is(
            "***\\n"
                + "***\\n"
                + "***"
        )
    );
  }
}
