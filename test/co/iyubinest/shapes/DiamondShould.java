package co.iyubinest.shapes;

import org.junit.Assert;
import org.junit.Test;

import static co.iyubinest.shapes.Shapes.DIAMOND;
import static co.iyubinest.shapes.Shapes.TRIANGLE;
import static org.hamcrest.CoreMatchers.is;

public class DiamondShould {

  @Test
  public void be() {
    Assert.assertThat(
        Shapes.create(DIAMOND).value(),
        is(
            "  *  \\n"
                + " *** \\n"
                + "*****\\n"
                + " *** \\n"
                + "  *  "
        )
    );
  }
}
