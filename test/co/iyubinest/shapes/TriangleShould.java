package co.iyubinest.shapes;

import org.junit.Assert;
import org.junit.Test;

import static co.iyubinest.shapes.Shapes.SQUARE;
import static co.iyubinest.shapes.Shapes.TRIANGLE;
import static org.hamcrest.CoreMatchers.is;

public class TriangleShould {

  @Test
  public void be() {
    Assert.assertThat(
        Shapes.create(TRIANGLE).value(),
        is(
            "  *  \\n"
                + " *** \\n"
                + "*****"
        )
    );
  }
}
